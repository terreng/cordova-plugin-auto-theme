/*global cordova, module*/

module.exports = {
    getTheme: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "AutoTheme", "getTheme");
    }
};