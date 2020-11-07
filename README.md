# cordova-plugin-auto-theme

**Android only**

A Cordova plugin for detecting if dark mode is enabled on Android, and listening for changes to device theme. Only works on Android 9+, so make sure to check the Android version in your code.

## Install
`cordova plugin add cordova-plugin-auto-theme`

## Usage
```js
//get current device theme
AutoTheme.getTheme(function(isdark) {
     console.log("Is dark mode: "+isdark)
})
```

## Events
```js
//called whenver theme changes
window.onThemeChange = function(isdark) {
    console.log("Dark mode changed. Is dark mode: "+isdark)
}
```
