#!/usr/bin/env bash
set -u
set -o pipefail

APK="app/build/outputs/apk/debug/app-debug.apk"
PACKAGE="com.deepaksah.marrow.rebuild"

echo "=== adb ==="
adb start-server || true
adb devices
timeout 120s adb wait-for-device

echo "=== install ==="
if ! timeout 90s adb install -r -t "${APK}"; then
  echo "streamed install failed; retrying non-streaming"
  timeout 90s adb install --no-streaming -r -t "${APK}" || exit 1
fi

adb shell pm path "${PACKAGE}" > /tmp/package-path.txt 2>&1
cat /tmp/package-path.txt
test -s /tmp/package-path.txt

echo "=== launch ==="
adb shell am force-stop "${PACKAGE}" || true
timeout 60s adb shell am start -W -n "${PACKAGE}/.MainActivity" > /tmp/launch.txt 2>&1
START_RC=$?
cat /tmp/launch.txt

sleep 5
adb exec-out screencap -p > /tmp/marrow-home.png
sleep 10
adb exec-out screencap -p > /tmp/marrow-home-t28s.png

adb shell pidof "${PACKAGE}" > /tmp/pid.txt 2>&1
PID_RC=$?
cat /tmp/pid.txt
adb shell dumpsys activity activities > /tmp/activity.txt 2>&1 || true
grep -E 'mResumedActivity|mFocusedApp' /tmp/activity.txt || true
adb logcat -d -v threadtime -t 1600 > /tmp/logcat.txt 2>&1 || true

adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb exec-out cat /sdcard/window.xml > /tmp/home-ui.xml 2>/dev/null || true

echo "=== app UI markers ==="
grep -E 'homeQBankCard|homePearlsCard|homeShare|QBank|Pearls|Home' /tmp/home-ui.xml | head -80 || true

echo "=== diagnostics ==="
echo "start_rc=${START_RC}"
echo "pid_rc=${PID_RC}"
grep -E 'FATAL EXCEPTION|AndroidRuntime|Process: com.deepaksah.marrow.rebuild|ANR in' /tmp/logcat.txt | tail -100 || true

test "${START_RC}" -eq 0
test "${PID_RC}" -eq 0
echo "install-smoke-production-package"
