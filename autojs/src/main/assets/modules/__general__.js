
module.exports = function(__runtime__, scope){
    scope.toast = function(text){
        __runtime__.toast(text);
    }

    scope.sleep = function(millis){
        __runtime__.sleep(millis);
    }

    scope.isStopped = function(){
        return __runtime__.isStopped();
    }

    scope.notStopped = function(){
        return !isStopped();
    }

    scope.stop = function(){
        __runtime__.stop();
    }

    scope.setClip = function(text){
        __runtime__.setClip(text);
    }

    scope.getClip = function(text){
       return __runtime__.getClip();
    }

    scope.currentPackage = function(){
        return __runtime__.info.getLatestPackage();
    }

    scope.currentActivity = function(){
        return __runtime__.info.getLatestActivity();
    }
}