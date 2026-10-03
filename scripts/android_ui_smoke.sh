#!/usr/bin/env bash
set -u

API_LEVEL="${1:-34}"
APK="app/build/outputs/apk/debug/app-debug.apk"
PACKAGE="com.deepaksah.marrow.rebuild"
ACTIVITY="${PACKAGE}/.MainActivity"

timeout 30s adb wait-for-device
adb shell input keyevent 82
timeout 60s adb install -r -t "${APK}"
adb shell pm path "${PACKAGE}"

set +e
timeout 45s adb shell am start -W -n "${ACTIVITY}" > launch.txt 2>&1
START_RC=$?
cat launch.txt
sleep 5
adb exec-out screencap -p > "marrow-launch-api-${API_LEVEL}-t05s.png"
sleep 25
adb exec-out screencap -p > "marrow-launch-api-${API_LEVEL}-t30s.png"
sleep 30
adb exec-out screencap -p > "marrow-launch-api-${API_LEVEL}-t60s.png"

adb shell pidof "${PACKAGE}" > pid.txt 2>&1
PID_RC=$?
cat pid.txt
adb shell dumpsys activity activities | grep -E 'mResumedActivity|mFocusedApp' > activity.txt 2>&1
cat activity.txt
adb logcat -d -v threadtime -t 1200 > logcat.txt
adb shell dumpsys package "${PACKAGE}" > package.txt

tap_text() {
  local target="$1"
  adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
  local line
  line=$(adb exec-out cat /sdcard/window.xml 2>/dev/null | grep -m1 "text=\"${target}\"" || true)
  local b
  b=$(printf '%s' "${line}" | sed -n 's/.*bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]".*/\1 \2 \3 \4/p')
  if [ -n "${b}" ]; then
    set -- ${b}
    adb shell input tap $(( ($1+$3)/2 )) $(( ($2+$4)/2 ))
    sleep 3
    return 0
  fi
  return 1
}

tap_desc() {
  local target="$1"
  adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1 || true
  local line
  line=$(adb exec-out cat /sdcard/window.xml 2>/dev/null | grep -m1 "content-desc=\"${target}\"" || true)
  local b
  b=$(printf '%s' "${line}" | sed -n 's/.*bounds="\[\([0-9]*\),\([0-9]*\)\]\[\([0-9]*\),\([0-9]*\)\]".*/\1 \2 \3 \4/p')
  if [ -n "${b}" ]; then
    set -- ${b}
    adb shell input tap $(( ($1+$3)/2 )) $(( ($2+$4)/2 ))
    sleep 3
    return 0
  fi
  return 1
}

tap_text "QBank" || true
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-qbank.png"
tap_text "Tests" || true
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-tests.png"
tap_text "Home" || true
sleep 2
tap_desc "Menu" || tap_text "☰" || true
sleep 1
tap_text "Profile" || true
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-profile.png"
tap_text "BACK HOME" || true
adb exec-out screencap -p > "marrow-ui-api-${API_LEVEL}-home-final.png"

{
  echo "start_rc=${START_RC}"
  echo "pid_rc=${PID_RC}"
  echo "--- launch ---"
  cat launch.txt
  echo "--- pid ---"
  cat pid.txt
  echo "--- activity ---"
  cat activity.txt
  echo "--- crash markers ---"
  grep -E 'FATAL EXCEPTION|AndroidRuntime|Process: com.deepaksah.marrow.rebuild|ANR in' logcat.txt | tail -80 || true
} | tee install-summary.txt

test "${START_RC}" -eq 0
test "${PID_RC}" -eq 0
