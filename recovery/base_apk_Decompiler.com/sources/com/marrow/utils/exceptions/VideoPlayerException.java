package com.marrow.utils.exceptions;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\t\nB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/marrow/utils/exceptions/VideoPlayerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "NoInternetException", "InternalPlaybackException", "Lcom/marrow/utils/exceptions/VideoPlayerException$InternalPlaybackException;", "Lcom/marrow/utils/exceptions/VideoPlayerException$NoInternetException;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VideoPlayerException extends RuntimeException {
    public static final int $stable = 8;

    private VideoPlayerException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ VideoPlayerException(String str, Throwable th, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    public /* synthetic */ VideoPlayerException(String str, Throwable th, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, th);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/marrow/utils/exceptions/VideoPlayerException$NoInternetException;", "Lcom/marrow/utils/exceptions/VideoPlayerException;", "", "p0", "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoInternetException extends VideoPlayerException {
        public static final int $stable = 8;

        public NoInternetException(Throwable th) {
            super("No internet connection available", th, null);
        }

        public /* synthetic */ NoInternetException(Throwable th, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoInternetException() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/marrow/utils/exceptions/VideoPlayerException$InternalPlaybackException;", "Lcom/marrow/utils/exceptions/VideoPlayerException;", "", "p0", "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InternalPlaybackException extends VideoPlayerException {
        public static final int $stable = 8;

        public InternalPlaybackException(Throwable th) {
            super("Internal playback failure", th, null);
        }

        public /* synthetic */ InternalPlaybackException(Throwable th, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InternalPlaybackException() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
