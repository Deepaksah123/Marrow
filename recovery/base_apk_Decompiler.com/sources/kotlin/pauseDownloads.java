package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class pauseDownloads implements updateProgress {
    private static final DownloadManagerExternalSyntheticLambda1 RemoteActionCompatParcelizer = new DownloadManagerExternalSyntheticLambda1() { // from class: o.pauseDownloads.3
        @Override // kotlin.DownloadManagerExternalSyntheticLambda1
        public final boolean RemoteActionCompatParcelizer(Class<?> cls) {
            return false;
        }

        @Override // kotlin.DownloadManagerExternalSyntheticLambda1
        public final DownloadManager1 AudioAttributesCompatParcelizer(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final DownloadManagerExternalSyntheticLambda1 read;

    public pauseDownloads() {
        this(AudioAttributesCompatParcelizer());
    }

    private pauseDownloads(DownloadManagerExternalSyntheticLambda1 downloadManagerExternalSyntheticLambda1) {
        this.read = (DownloadManagerExternalSyntheticLambda1) getDownloadIndex.AudioAttributesCompatParcelizer(downloadManagerExternalSyntheticLambda1, "messageInfoFactory");
    }

    @Override // kotlin.updateProgress
    public final <T> setNotMetRequirements<T> AudioAttributesCompatParcelizer(Class<T> cls) {
        DownloadManagerListener.AudioAttributesCompatParcelizer((Class<?>) cls);
        DownloadManager1 downloadManager1AudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(cls);
        if (downloadManager1AudioAttributesCompatParcelizer.read()) {
            if (updateWaitingForRequirements.class.isAssignableFrom(cls)) {
                return r8lambdaDm8gKcNDq_qR4IXWgQ8jRgFThg.AudioAttributesCompatParcelizer(DownloadManagerListener.AudioAttributesCompatParcelizer(), onDownloadUpdate.AudioAttributesCompatParcelizer(), downloadManager1AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            }
            return r8lambdaDm8gKcNDq_qR4IXWgQ8jRgFThg.AudioAttributesCompatParcelizer(DownloadManagerListener.IconCompatParcelizer(), onDownloadUpdate.IconCompatParcelizer(), downloadManager1AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
        }
        return read(cls, downloadManager1AudioAttributesCompatParcelizer);
    }

    private static <T> setNotMetRequirements<T> read(Class<T> cls, DownloadManager1 downloadManager1) {
        if (updateWaitingForRequirements.class.isAssignableFrom(cls)) {
            if (write(downloadManager1)) {
                return compareStartTimes.read(downloadManager1, putDownloadWithState.read(), getRequirements.read(), DownloadManagerListener.AudioAttributesCompatParcelizer(), onDownloadUpdate.AudioAttributesCompatParcelizer(), DownloadManagerDownloadUpdate.AudioAttributesCompatParcelizer());
            }
            return compareStartTimes.read(downloadManager1, putDownloadWithState.read(), getRequirements.read(), DownloadManagerListener.AudioAttributesCompatParcelizer(), null, DownloadManagerDownloadUpdate.AudioAttributesCompatParcelizer());
        }
        if (write(downloadManager1)) {
            return compareStartTimes.read(downloadManager1, putDownloadWithState.RemoteActionCompatParcelizer(), getRequirements.write(), DownloadManagerListener.IconCompatParcelizer(), onDownloadUpdate.IconCompatParcelizer(), DownloadManagerDownloadUpdate.read());
        }
        return compareStartTimes.read(downloadManager1, putDownloadWithState.RemoteActionCompatParcelizer(), getRequirements.write(), DownloadManagerListener.RemoteActionCompatParcelizer(), null, DownloadManagerDownloadUpdate.read());
    }

    private static boolean write(DownloadManager1 downloadManager1) {
        return downloadManager1.write() == onRemoveTaskStopped.PROTO2;
    }

    private static DownloadManagerExternalSyntheticLambda1 AudioAttributesCompatParcelizer() {
        return new IconCompatParcelizer(onMessageProcessed.RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer());
    }

    static class IconCompatParcelizer implements DownloadManagerExternalSyntheticLambda1 {
        private DownloadManagerExternalSyntheticLambda1[] IconCompatParcelizer;

        IconCompatParcelizer(DownloadManagerExternalSyntheticLambda1... downloadManagerExternalSyntheticLambda1Arr) {
            this.IconCompatParcelizer = downloadManagerExternalSyntheticLambda1Arr;
        }

        @Override // kotlin.DownloadManagerExternalSyntheticLambda1
        public final boolean RemoteActionCompatParcelizer(Class<?> cls) {
            for (DownloadManagerExternalSyntheticLambda1 downloadManagerExternalSyntheticLambda1 : this.IconCompatParcelizer) {
                if (downloadManagerExternalSyntheticLambda1.RemoteActionCompatParcelizer(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.DownloadManagerExternalSyntheticLambda1
        public final DownloadManager1 AudioAttributesCompatParcelizer(Class<?> cls) {
            for (DownloadManagerExternalSyntheticLambda1 downloadManagerExternalSyntheticLambda1 : this.IconCompatParcelizer) {
                if (downloadManagerExternalSyntheticLambda1.RemoteActionCompatParcelizer(cls)) {
                    return downloadManagerExternalSyntheticLambda1.AudioAttributesCompatParcelizer(cls);
                }
            }
            StringBuilder sb = new StringBuilder("No factory is available for message type: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    private static DownloadManagerExternalSyntheticLambda1 RemoteActionCompatParcelizer() {
        try {
            return (DownloadManagerExternalSyntheticLambda1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return RemoteActionCompatParcelizer;
        }
    }
}
