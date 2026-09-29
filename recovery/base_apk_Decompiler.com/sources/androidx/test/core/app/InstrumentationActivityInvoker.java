package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.test.internal.util.Checks;

/* JADX INFO: loaded from: classes4.dex */
class InstrumentationActivityInvoker {
    InstrumentationActivityInvoker() {
    }

    public static class BootstrapActivity extends Activity {
        private boolean read;
        private final BroadcastReceiver write = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BootstrapActivity.this.finishActivity(0);
                BootstrapActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            registerReceiver(this.write, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
            this.read = bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false);
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            if (this.read) {
                return;
            }
            this.read = true;
            PendingIntent pendingIntent = (PendingIntent) Checks.RemoteActionCompatParcelizer((PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY"));
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            try {
                if (bundleExtra == null) {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                } else {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleExtra);
                }
            } catch (IntentSender.SendIntentException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.app.Activity
        protected void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.read);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.write);
        }

        @Override // android.app.Activity
        protected void onActivityResult(int i, int i2, Intent intent) {
            if (i == 0) {
                Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
                if (intent != null) {
                    intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
                }
                sendBroadcast(intent2);
                finish();
            }
        }

        @Override // android.app.Activity
        public void onStart() {
            super.onStart();
        }

        @Override // android.app.Activity
        protected void onPause() {
            super.onPause();
        }

        @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class EmptyActivity extends Activity {
        private final BroadcastReceiver read = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            registerReceiver(this.read, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.read);
        }

        @Override // android.app.Activity
        public void onStart() {
            super.onStart();
        }

        @Override // android.app.Activity
        protected void onPause() {
            super.onPause();
        }

        @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class EmptyFloatingActivity extends Activity {
        private final BroadcastReceiver IconCompatParcelizer = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyFloatingActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            registerReceiver(this.IconCompatParcelizer, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.IconCompatParcelizer);
        }

        @Override // android.app.Activity
        public void onStart() {
            super.onStart();
        }

        @Override // android.app.Activity
        protected void onPause() {
            super.onPause();
        }

        @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }
}
