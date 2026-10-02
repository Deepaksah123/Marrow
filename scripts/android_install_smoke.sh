#!/usr/bin/env bash
set -euo pipefail

APK="app/build/outputs/apk/debug/app-debug.apk"
PACKAGE="com.deepaksah.marrow.rebuild"

adb devices
adb shell getprop sys.boot_completed || true
adb devices

if ! adb install -r "$APK"; then
  adb install --no-streaming -r "$APK"
fi
adb shell pm path "$PACKAGE"
adb shell am start -n "$PACKAGE/.MainActivity"

clear_launcher_anr() {
  adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
  if adb shell cat /sdcard/window.xml 2>/dev/null | grep -q "Pixel Launcher isn't responding"; then
    adb shell input tap 270 955 || true
    sleep 2
  fi
}

sleep 90
adb shell pidof "$PACKAGE" || true

READY=0
for i in $(seq 1 180); do
  clear_launcher_anr
  adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
  if adb shell cat /sdcard/window.xml 2>/dev/null | grep -q 'navHome'; then
    READY=1
    break
  fi
  sleep 1
done
if [ "$READY" -ne 1 ]; then
  echo "Timed out waiting for Home UI"
  adb shell cat /sdcard/window.xml 2>/dev/null || true
  exit 1
fi
clear_launcher_anr
adb exec-out screencap -p > /tmp/marrow-home.png

adb shell input tap 405 2300
sleep 3
clear_launcher_anr
adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb shell cat /sdcard/window.xml 2>/dev/null | grep -q 'qbankTracker' || { echo "QBank UI not detected"; adb shell cat /sdcard/window.xml 2>/dev/null || true; exit 1; }
clear_launcher_anr
adb exec-out screencap -p > /tmp/marrow-qbank.png

adb shell input tap 675 2300
sleep 3
clear_launcher_anr
adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb shell cat /sdcard/window.xml 2>/dev/null | grep -q 'testStart' || { echo "Test UI not detected"; adb shell cat /sdcard/window.xml 2>/dev/null || true; exit 1; }
clear_launcher_anr
adb exec-out screencap -p > /tmp/marrow-test.png

adb shell input tap 945 2300
sleep 3
clear_launcher_anr
adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb shell cat /sdcard/window.xml 2>/dev/null | grep -q 'videoSubjects' || { echo "Video UI not detected"; adb shell cat /sdcard/window.xml 2>/dev/null || true; exit 1; }
clear_launcher_anr
adb exec-out screencap -p > /tmp/marrow-video.png

echo "install-smoke-production-package"
