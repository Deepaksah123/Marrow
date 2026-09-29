package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<ParcelFileDescriptor> {
    private final InternalRewinder read;

    @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
    public final void read() {
    }

    public static boolean AudioAttributesCompatParcelizer() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.read = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor IconCompatParcelizer() throws IOException {
        return this.read.rewind();
    }

    public static final class AudioAttributesCompatParcelizer implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<ParcelFileDescriptor> {
        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final /* synthetic */ r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<ParcelFileDescriptor> write(ParcelFileDescriptor parcelFileDescriptor) {
            return AudioAttributesCompatParcelizer(parcelFileDescriptor);
        }

        private static r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<ParcelFileDescriptor> AudioAttributesCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final Class<ParcelFileDescriptor> IconCompatParcelizer() {
            return ParcelFileDescriptor.class;
        }
    }

    static final class InternalRewinder {
        private final ParcelFileDescriptor AudioAttributesCompatParcelizer;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.AudioAttributesCompatParcelizer = parcelFileDescriptor;
        }

        final ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.AudioAttributesCompatParcelizer.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.AudioAttributesCompatParcelizer;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }
}
