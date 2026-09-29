package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import kotlin.setPcmEncoding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InstallReferrerClient {

    public static final class AudioAttributesCompatParcelizer {
        private final Context AudioAttributesCompatParcelizer;

        public final InstallReferrerClient AudioAttributesCompatParcelizer() {
            Context context = this.AudioAttributesCompatParcelizer;
            if (context != null) {
                return new setPcmEncoding(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private AudioAttributesCompatParcelizer(Context context) {
            this.AudioAttributesCompatParcelizer = context;
        }

        /* synthetic */ AudioAttributesCompatParcelizer(Context context, byte b) {
            this(context);
        }
    }

    public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(Context context) {
        return new AudioAttributesCompatParcelizer(context, (byte) 0);
    }

    public abstract void IconCompatParcelizer();

    public abstract void IconCompatParcelizer(InstallReferrerStateListener installReferrerStateListener);

    public abstract ReferrerDetails RemoteActionCompatParcelizer() throws RemoteException;
}
