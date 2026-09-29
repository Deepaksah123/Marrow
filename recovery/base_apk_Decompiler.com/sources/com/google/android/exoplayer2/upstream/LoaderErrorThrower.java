package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface LoaderErrorThrower {

    public static final class Placeholder implements LoaderErrorThrower {
        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public final void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public final void maybeThrowError(int i) {
        }
    }

    void maybeThrowError() throws IOException;

    void maybeThrowError(int i) throws IOException;
}
