package com.stardust.autojs.runtime;

import com.stardust.autojs.engine.ScriptEngine;
import com.stardust.autojs.runtime.api.AbstractShell;
import com.stardust.autojs.runtime.api.AppUtils;
import com.stardust.autojs.runtime.api.Console;
import com.stardust.autojs.runtime.api.UiSelector;
import com.stardust.autojs.runtime.simple_action.SimpleActionAutomator;
import com.stardust.view.accessibility.AccessibilityInfoProvider;

/**
 * Created by Stardust on 2017/5/4.
 */

public abstract class AbstractScriptRuntime {

    @ScriptVariable
    public AppUtils app;

    @ScriptVariable
    public Console console;

    @ScriptVariable
    public SimpleActionAutomator automator;

    @ScriptVariable
    public AccessibilityInfoProvider info;

    public AbstractScriptRuntime(AppUtils app, Console console, AccessibilityBridge bridge) {
        this.app = app;
        this.console = console;
        this.automator = new SimpleActionAutomator(bridge, this);
        this.info = bridge.getInfoProvider();
    }

    public AbstractScriptRuntime() {
    }

    @ScriptInterface
    public abstract void toast(final String text);

    @ScriptInterface
    public abstract void sleep(long millis);

    @ScriptInterface
    public abstract void setClip(final String text);

    @ScriptInterface
    public abstract AbstractShell getRootShell();

    @ScriptInterface
    public abstract AbstractShell.Result shell(String cmd, int root);

    @ScriptInterface
    public abstract UiSelector selector(ScriptEngine engine);

    @ScriptInterface
    public abstract boolean isStopped();

    @ScriptInterface
    public abstract void requiresApi(int i);

    @ScriptInterface
    public abstract void loadJar(String path);

    @ScriptInterface
    public abstract void stop();

    public abstract void ensureAccessibilityServiceEnabled();

    public abstract void onStop();
}
