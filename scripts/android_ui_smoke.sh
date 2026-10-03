#!/usr/bin/env bash
set -u

API_LEVEL="${1:-34}"
APK="app/build/outputs/apk/debug/app-debug.apk"
PACKAGE="com.deepaksah.marrow.rebuild"
ACTIVITY="${PACKAGE}/.MainActivity"

echo "=== adb devices ==="
adb devices

echo "=== wait for device ==="
timeout 60s adb wait-for-device

echo "=== install ==="
if ! timeout 90s adb install -r -t "${APK}"; then
  echo "streamed install failed; retrying non-streaming"
  timeout 90s adb install --no-streaming -r -t "${APK}" || exit 1
fi

echo "=== package path ==="
adb shell pm path "${PACKAGE}" > package-path.txt 2>&1
cat package-path.txt
test -s package-path.txt

echo "=== launch ==="
adb shell am force-stop "${PACKAGE}" || true
timeout 60s adb shell am start -W -n "${ACTIVITY}" > launch.txt 2>&1
START_RC=$?
cat launch.txt

sleep 8
adb exec-out screencap -p > "marrow-launch-api-${API_LEVEL}-t08s.png"
sleep 22
adb exec-out screencap -p > "marrow-launch-api-${API_LEVEL}-t30s.png"
sleep 30
adb exec-out screencap -p > "marrow-launch-api-${API_LEVEL}-t60s.png"

adb shell pidof "${PACKAGE}" > pid.txt 2>&1
PID_RC=$?
cat pid.txt

adb shell dumpsys activity activities | grep -E 'mResumedActivity|mFocusedApp' > activity.txt 2>&1 || true
cat activity.txt
adb logcat -d -v threadtime -t 1600 > logcat.txt 2>&1 || true
adb shell dumpsys package "${PACKAGE}" > package.txt 2>&1 || true
adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb exec-out cat /sdcard/window.xml > ui.xml 2>/dev/null || true

echo "=== UI markers ==="
grep -E 'homeQBankCard|homePearlsCard|homeShare|QBank|Pearls|Home' ui.xml | head -80 || true

echo "=== navigation QA: QBank ==="
adb shell input keyevent 3 || true
sleep 1
adb shell input tap 405 2300 || true
sleep 3
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-qbank.png"
adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb exec-out cat /sdcard/window.xml > qbank-ui.xml 2>/dev/null || true

echo "=== navigation QA: Tests ==="
adb shell input tap 675 2300 || true
sleep 3
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-tests.png"
adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
adb exec-out cat /sdcard/window.xml > tests-ui.xml 2>/dev/null || true

echo "=== navigation QA: Home ==="
adb shell input tap 135 2300 || true
sleep 3
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-home-final.png"

echo "=== launch diagnostics ==="
echo "start_rc=${START_RC}"
echo "pid_rc=${PID_RC}"
echo "--- crash markers ---"
grep -E 'FATAL EXCEPTION|AndroidRuntime|Process: com.deepaksah.marrow.rebuild|ANR in' logcat.txt | tail -100 || true
echo "--- resumed/focused ---"
cat activity.txt
echo "--- UI marker counts ---"
grep -o 'homeQBankCard\|homePearlsCard\|homeShare' ui.xml | sort | uniq -c || true

test "${START_RC}" -eq 0
test "${PID_RC}" -eq 0
