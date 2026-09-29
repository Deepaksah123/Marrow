package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class isAlive extends argCount {
    private static final boolean IconCompatParcelizer = Log.isLoggable("UseSupportDynamicGroup", 3);
    private Dialog RemoteActionCompatParcelizer;
    private C0185kotlinModule write;

    public isAlive() {
        setCancelable(true);
    }

    private C0185kotlinModule AudioAttributesCompatParcelizer() {
        IconCompatParcelizer();
        return this.write;
    }

    private void IconCompatParcelizer() {
        if (this.write == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.write = C0185kotlinModule.RemoteActionCompatParcelizer(arguments.getBundle("selector"));
            }
            if (this.write == null) {
                this.write = C0185kotlinModule.read;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        IconCompatParcelizer();
        if (this.write.equals(c0185kotlinModule)) {
            return;
        }
        this.write = c0185kotlinModule;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", c0185kotlinModule.IconCompatParcelizer());
        setArguments(arguments);
        Dialog dialog = this.RemoteActionCompatParcelizer;
        if (dialog != null) {
            if (IconCompatParcelizer) {
                ((PrivateMaxEntriesMapWeightedValue) dialog).AudioAttributesCompatParcelizer(c0185kotlinModule);
            } else {
                ((PrivateMaxEntriesMapValueIterator) dialog).write(c0185kotlinModule);
            }
        }
    }

    private static PrivateMaxEntriesMapWeightedValue read(Context context) {
        return new PrivateMaxEntriesMapWeightedValue(context);
    }

    private static PrivateMaxEntriesMapValueIterator AudioAttributesCompatParcelizer(Context context) {
        return new PrivateMaxEntriesMapValueIterator(context);
    }

    @Override // kotlin.argCount
    public Dialog onCreateDialog(Bundle bundle) {
        if (IconCompatParcelizer) {
            PrivateMaxEntriesMapWeightedValue privateMaxEntriesMapWeightedValue = read(getContext());
            this.RemoteActionCompatParcelizer = privateMaxEntriesMapWeightedValue;
            privateMaxEntriesMapWeightedValue.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer());
        } else {
            PrivateMaxEntriesMapValueIterator privateMaxEntriesMapValueIteratorAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getContext());
            this.RemoteActionCompatParcelizer = privateMaxEntriesMapValueIteratorAudioAttributesCompatParcelizer;
            privateMaxEntriesMapValueIteratorAudioAttributesCompatParcelizer.write(AudioAttributesCompatParcelizer());
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.RemoteActionCompatParcelizer;
        if (dialog == null) {
            return;
        }
        if (IconCompatParcelizer) {
            ((PrivateMaxEntriesMapWeightedValue) dialog).RemoteActionCompatParcelizer();
        } else {
            ((PrivateMaxEntriesMapValueIterator) dialog).RemoteActionCompatParcelizer();
        }
    }
}
