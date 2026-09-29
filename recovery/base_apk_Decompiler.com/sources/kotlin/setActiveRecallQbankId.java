package kotlin;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.BookReference;
import kotlin.HomeLessonIndexV2;
import kotlin.LessonSpinnerItem;
import kotlin.setVideoAspectRatio;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes4.dex */
public final class setActiveRecallQbankId {

    public enum MediaBrowserCompatCustomActionResultReceiver implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);

        private final int MediaBrowserCompatCustomActionResultReceiver;

        static {
            new LessonSpinnerItem.RemoteActionCompatParcelizer<MediaBrowserCompatCustomActionResultReceiver>() { // from class: o.setActiveRecallQbankId.MediaBrowserCompatCustomActionResultReceiver.1
                @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                    return AudioAttributesCompatParcelizer(i);
                }

                private static MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer(int i) {
                    return MediaBrowserCompatCustomActionResultReceiver.read(i);
                }
            };
        }

        @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public static MediaBrowserCompatCustomActionResultReceiver read(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        MediaBrowserCompatCustomActionResultReceiver(int i) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
        }
    }

    public enum onMediaButtonEvent implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);

        private final int AudioAttributesImplApi26Parcelizer;

        static {
            new LessonSpinnerItem.RemoteActionCompatParcelizer<onMediaButtonEvent>() { // from class: o.setActiveRecallQbankId.onMediaButtonEvent.4
                @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                    return AudioAttributesCompatParcelizer(i);
                }

                private static onMediaButtonEvent AudioAttributesCompatParcelizer(int i) {
                    return onMediaButtonEvent.read(i);
                }
            };
        }

        @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public static onMediaButtonEvent read(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        onMediaButtonEvent(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }
    }

    public enum AudioAttributesImplBaseParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);

        private final int AudioAttributesImplBaseParcelizer;

        static {
            new LessonSpinnerItem.RemoteActionCompatParcelizer<AudioAttributesImplBaseParcelizer>() { // from class: o.setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.1
                @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                    return AudioAttributesCompatParcelizer(i);
                }

                private static AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(int i) {
                    return AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(i);
                }
            };
        }

        @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public static AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        AudioAttributesImplBaseParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver extends HomeLessonIndexV2 implements setLessonType {
        public static getParentMcqId<MediaBrowserCompatSearchResultReceiver> AudioAttributesCompatParcelizer = new setReadTime<MediaBrowserCompatSearchResultReceiver>() { // from class: o.setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver.5
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return read(setslidescount, setsteptype);
            }

            private static MediaBrowserCompatSearchResultReceiver read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new MediaBrowserCompatSearchResultReceiver(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final MediaBrowserCompatSearchResultReceiver write;
        private final setVideoAspectRatio AudioAttributesImplApi21Parcelizer;
        private toJSONArray IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private byte read;

        /* synthetic */ MediaBrowserCompatSearchResultReceiver(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ MediaBrowserCompatSearchResultReceiver(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return AudioAttributesImplBaseParcelizer();
        }

        private MediaBrowserCompatSearchResultReceiver(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.read = (byte) -1;
            this.RemoteActionCompatParcelizer = -1;
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private MediaBrowserCompatSearchResultReceiver() {
            this.read = (byte) -1;
            this.RemoteActionCompatParcelizer = -1;
            this.AudioAttributesImplApi21Parcelizer = setVideoAspectRatio.write;
        }

        public static MediaBrowserCompatSearchResultReceiver write() {
            return write;
        }

        private static MediaBrowserCompatSearchResultReceiver AudioAttributesImplBaseParcelizer() {
            return write;
        }

        private MediaBrowserCompatSearchResultReceiver(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.read = (byte) -1;
            this.RemoteActionCompatParcelizer = -1;
            RemoteActionCompatParcelizer();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 10) {
                                setVideoAspectRatio setvideoaspectratioRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer();
                                if (!z2) {
                                    this.IconCompatParcelizer = new McqAnswer();
                                    z2 = true;
                                }
                                this.IconCompatParcelizer.write(setvideoaspectratioRemoteActionCompatParcelizer);
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
            if (z2) {
                this.IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatSearchResultReceiver();
            write = mediaBrowserCompatSearchResultReceiver;
            mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        }

        private getServerAnswer MediaBrowserCompatItemReceiver() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer(int i) {
            return (String) this.IconCompatParcelizer.get(i);
        }

        private void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer = McqAnswer.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.read;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.read = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                setresumeexplanation.RemoteActionCompatParcelizer(1, this.IconCompatParcelizer.write(i));
            }
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.RemoteActionCompatParcelizer;
            if (i != -1) {
                return i;
            }
            int iRemoteActionCompatParcelizer = 0;
            for (int i2 = 0; i2 < this.IconCompatParcelizer.size(); i2++) {
                iRemoteActionCompatParcelizer += setResumeExplanation.RemoteActionCompatParcelizer(this.IconCompatParcelizer.write(i2));
            }
            int size = iRemoteActionCompatParcelizer + MediaBrowserCompatItemReceiver().size() + this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.RemoteActionCompatParcelizer = size;
            return size;
        }

        private static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            return RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        }

        private static RemoteActionCompatParcelizer MediaBrowserCompatMediaItem() {
            return AudioAttributesCompatParcelizer();
        }

        public static RemoteActionCompatParcelizer IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
            return AudioAttributesCompatParcelizer().IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final RemoteActionCompatParcelizer RatingCompat() {
            return IconCompatParcelizer(this);
        }

        public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<MediaBrowserCompatSearchResultReceiver, RemoteActionCompatParcelizer> implements setLessonType {
            private toJSONArray IconCompatParcelizer = McqAnswer.RemoteActionCompatParcelizer;
            private int RemoteActionCompatParcelizer;

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                return true;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return MediaDescriptionCompat();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaDescriptionCompat();
            }

            private RemoteActionCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver() {
                return new RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
            public RemoteActionCompatParcelizer clone() {
                return MediaBrowserCompatItemReceiver().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static MediaBrowserCompatSearchResultReceiver MediaDescriptionCompat() {
                return MediaBrowserCompatSearchResultReceiver.write();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public MediaBrowserCompatSearchResultReceiver write() {
                MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiverAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (mediaBrowserCompatSearchResultReceiverAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return mediaBrowserCompatSearchResultReceiverAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            public final MediaBrowserCompatSearchResultReceiver AudioAttributesImplApi26Parcelizer() {
                MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatSearchResultReceiver((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) 0);
                if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                    this.IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
                    this.RemoteActionCompatParcelizer &= -2;
                }
                mediaBrowserCompatSearchResultReceiver.IconCompatParcelizer = this.IconCompatParcelizer;
                return mediaBrowserCompatSearchResultReceiver;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final RemoteActionCompatParcelizer IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
                if (mediaBrowserCompatSearchResultReceiver == MediaBrowserCompatSearchResultReceiver.write()) {
                    return this;
                }
                if (!mediaBrowserCompatSearchResultReceiver.IconCompatParcelizer.isEmpty()) {
                    if (this.IconCompatParcelizer.isEmpty()) {
                        this.IconCompatParcelizer = mediaBrowserCompatSearchResultReceiver.IconCompatParcelizer;
                        this.RemoteActionCompatParcelizer &= -2;
                    } else {
                        AudioAttributesImplBaseParcelizer();
                        this.IconCompatParcelizer.addAll(mediaBrowserCompatSearchResultReceiver.IconCompatParcelizer);
                    }
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer));
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$MediaBrowserCompatSearchResultReceiver> r0 = o.setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$MediaBrowserCompatSearchResultReceiver r2 = (o.setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$MediaBrowserCompatSearchResultReceiver r3 = (o.setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaBrowserCompatSearchResultReceiver$RemoteActionCompatParcelizer");
            }

            private void AudioAttributesImplBaseParcelizer() {
                if ((this.RemoteActionCompatParcelizer & 1) != 1) {
                    this.IconCompatParcelizer = new McqAnswer(this.IconCompatParcelizer);
                    this.RemoteActionCompatParcelizer |= 1;
                }
            }
        }
    }

    public static final class MediaDescriptionCompat extends HomeLessonIndexV2 implements setLessonNumber {
        private static final MediaDescriptionCompat AudioAttributesCompatParcelizer;
        public static getParentMcqId<MediaDescriptionCompat> RemoteActionCompatParcelizer = new setReadTime<MediaDescriptionCompat>() { // from class: o.setActiveRecallQbankId.MediaDescriptionCompat.2
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return AudioAttributesCompatParcelizer(setslidescount, setsteptype);
            }

            private static MediaDescriptionCompat AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new MediaDescriptionCompat(setslidescount, setsteptype, (byte) 0);
            }
        };
        private final setVideoAspectRatio AudioAttributesImplApi21Parcelizer;
        private List<write> IconCompatParcelizer;
        private int read;
        private byte write;

        /* synthetic */ MediaDescriptionCompat(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ MediaDescriptionCompat(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatSearchResultReceiver();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return AudioAttributesImplBaseParcelizer();
        }

        private MediaDescriptionCompat(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.write = (byte) -1;
            this.read = -1;
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private MediaDescriptionCompat() {
            this.write = (byte) -1;
            this.read = -1;
            this.AudioAttributesImplApi21Parcelizer = setVideoAspectRatio.write;
        }

        public static MediaDescriptionCompat IconCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        private static MediaDescriptionCompat AudioAttributesImplBaseParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        private MediaDescriptionCompat(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.write = (byte) -1;
            this.read = -1;
            AudioAttributesCompatParcelizer();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 10) {
                                    if (!z2) {
                                        this.IconCompatParcelizer = new ArrayList();
                                        z2 = true;
                                    }
                                    this.IconCompatParcelizer.add((write) setslidescount.RemoteActionCompatParcelizer(write.write, setsteptype));
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new LessonTabItem(e.getMessage()).write(this);
                        }
                    } catch (LessonTabItem e2) {
                        throw e2.write(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if (z2) {
                this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat();
            AudioAttributesCompatParcelizer = mediaDescriptionCompat;
            mediaDescriptionCompat.AudioAttributesCompatParcelizer();
        }

        public static final class write extends HomeLessonIndexV2 implements setLastUpdated {
            private static final write read;
            public static getParentMcqId<write> write = new setReadTime<write>() { // from class: o.setActiveRecallQbankId.MediaDescriptionCompat.write.5
                @Override // kotlin.getParentMcqId
                public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    return write(setslidescount, setsteptype);
                }

                private static write write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    return new write(setslidescount, setsteptype, (byte) 0);
                }
            };
            private byte AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private final setVideoAspectRatio AudioAttributesImplBaseParcelizer;
            private AudioAttributesCompatParcelizer IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatItemReceiver;
            private int RemoteActionCompatParcelizer;

            /* synthetic */ write(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
                this(remoteActionCompatParcelizer);
            }

            /* synthetic */ write(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
                this(setslidescount, setsteptype);
            }

            @Override // kotlin.BookReference
            public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
                return handleMediaPlayPauseIfPendingOnHandler();
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaMetadataCompat();
            }

            private write(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super((byte) 0);
                this.AudioAttributesCompatParcelizer = (byte) -1;
                this.AudioAttributesImplApi21Parcelizer = -1;
                this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
            }

            private write() {
                this.AudioAttributesCompatParcelizer = (byte) -1;
                this.AudioAttributesImplApi21Parcelizer = -1;
                this.AudioAttributesImplBaseParcelizer = setVideoAspectRatio.write;
            }

            public static write RemoteActionCompatParcelizer() {
                return read;
            }

            private static write MediaMetadataCompat() {
                return read;
            }

            private write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                this.AudioAttributesCompatParcelizer = (byte) -1;
                this.AudioAttributesImplApi21Parcelizer = -1;
                MediaBrowserCompatSearchResultReceiver();
                setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
                setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                    this.RemoteActionCompatParcelizer |= 1;
                                    this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 16) {
                                    this.RemoteActionCompatParcelizer |= 2;
                                    this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 24) {
                                    int iWrite = setslidescount.write();
                                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iWrite);
                                    if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer == null) {
                                        setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                        setresumeexplanation.MediaMetadataCompat(iWrite);
                                    } else {
                                        this.RemoteActionCompatParcelizer |= 4;
                                        this.IconCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer;
                                    }
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            try {
                                setresumeexplanation.IconCompatParcelizer();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                                throw th2;
                            }
                            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            onStop();
                            throw th;
                        }
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                }
                try {
                    setresumeexplanation.IconCompatParcelizer();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    throw th3;
                }
                this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                onStop();
            }

            static {
                write writeVar = new write();
                read = writeVar;
                writeVar.MediaBrowserCompatSearchResultReceiver();
            }

            public enum AudioAttributesCompatParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                private final int read;

                static {
                    new LessonSpinnerItem.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer>() { // from class: o.setActiveRecallQbankId.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.3
                        @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                        public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                            return AudioAttributesCompatParcelizer(i);
                        }

                        private static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                            return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
                        }
                    };
                }

                @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
                public final int RemoteActionCompatParcelizer() {
                    return this.read;
                }

                public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                AudioAttributesCompatParcelizer(int i) {
                    this.read = i;
                }
            }

            public final boolean MediaBrowserCompatItemReceiver() {
                return (this.RemoteActionCompatParcelizer & 1) == 1;
            }

            public final int IconCompatParcelizer() {
                return this.MediaBrowserCompatCustomActionResultReceiver;
            }

            public final boolean MediaBrowserCompatMediaItem() {
                return (this.RemoteActionCompatParcelizer & 2) == 2;
            }

            public final int write() {
                return this.MediaBrowserCompatItemReceiver;
            }

            public final boolean AudioAttributesImplBaseParcelizer() {
                return (this.RemoteActionCompatParcelizer & 4) == 4;
            }

            public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            private void MediaBrowserCompatSearchResultReceiver() {
                this.MediaBrowserCompatCustomActionResultReceiver = -1;
                this.MediaBrowserCompatItemReceiver = 0;
                this.IconCompatParcelizer = AudioAttributesCompatParcelizer.PACKAGE;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                byte b = this.AudioAttributesCompatParcelizer;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!MediaBrowserCompatMediaItem()) {
                    this.AudioAttributesCompatParcelizer = (byte) 0;
                    return false;
                }
                this.AudioAttributesCompatParcelizer = (byte) 1;
                return true;
            }

            @Override // kotlin.BookReference
            public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
                AudioAttributesImplApi21Parcelizer();
                if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                    setresumeexplanation.write(1, this.MediaBrowserCompatCustomActionResultReceiver);
                }
                if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                    setresumeexplanation.write(2, this.MediaBrowserCompatItemReceiver);
                }
                if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                    setresumeexplanation.RemoteActionCompatParcelizer(3, this.IconCompatParcelizer.RemoteActionCompatParcelizer());
                }
                setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            }

            @Override // kotlin.BookReference
            public final int AudioAttributesImplApi21Parcelizer() {
                int i = this.AudioAttributesImplApi21Parcelizer;
                if (i != -1) {
                    return i;
                }
                int iAudioAttributesCompatParcelizer = (this.RemoteActionCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.MediaBrowserCompatCustomActionResultReceiver) : 0;
                if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                    iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.MediaBrowserCompatItemReceiver);
                }
                if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                    iAudioAttributesCompatParcelizer += setResumeExplanation.IconCompatParcelizer(3, this.IconCompatParcelizer.RemoteActionCompatParcelizer());
                }
                int iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer + this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                this.AudioAttributesImplApi21Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
                return iMediaBrowserCompatCustomActionResultReceiver;
            }

            private static C0135write MediaDescriptionCompat() {
                return C0135write.AudioAttributesImplBaseParcelizer();
            }

            private static C0135write handleMediaPlayPauseIfPendingOnHandler() {
                return MediaDescriptionCompat();
            }

            private static C0135write write(write writeVar) {
                return MediaDescriptionCompat().IconCompatParcelizer(writeVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.BookReference
            /* JADX INFO: renamed from: onAddQueueItem, reason: merged with bridge method [inline-methods] */
            public C0135write RatingCompat() {
                return write(this);
            }

            /* JADX INFO: renamed from: o.setActiveRecallQbankId$MediaDescriptionCompat$write$write, reason: collision with other inner class name */
            public static final class C0135write extends HomeLessonIndexV2.RemoteActionCompatParcelizer<write, C0135write> implements setLastUpdated {
                private int AudioAttributesCompatParcelizer = -1;
                private AudioAttributesCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer.PACKAGE;
                private int RemoteActionCompatParcelizer;
                private int read;

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
                public final /* synthetic */ HomeLessonIndexV2 read() {
                    return RatingCompat();
                }

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
                public final /* synthetic */ BookReference read() {
                    return RatingCompat();
                }

                private C0135write() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C0135write AudioAttributesImplBaseParcelizer() {
                    return new C0135write();
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
                /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
                public C0135write clone() {
                    return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(MediaBrowserCompatItemReceiver());
                }

                private static write RatingCompat() {
                    return write.RemoteActionCompatParcelizer();
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // o.BookReference.write
                /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
                public write write() {
                    write writeVarMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                    if (writeVarMediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
                        return writeVarMediaBrowserCompatItemReceiver;
                    }
                    throw MediaBrowserCompatMediaItem();
                }

                /* JADX WARN: Multi-variable type inference failed */
                private write MediaBrowserCompatItemReceiver() {
                    write writeVar = new write((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                    int i = this.RemoteActionCompatParcelizer;
                    int i2 = (i & 1) == 1 ? 1 : 0;
                    writeVar.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    writeVar.MediaBrowserCompatItemReceiver = this.read;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    writeVar.IconCompatParcelizer = this.IconCompatParcelizer;
                    writeVar.RemoteActionCompatParcelizer = i2;
                    return writeVar;
                }

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final C0135write IconCompatParcelizer(write writeVar) {
                    if (writeVar == write.RemoteActionCompatParcelizer()) {
                        return this;
                    }
                    if (writeVar.MediaBrowserCompatItemReceiver()) {
                        read(writeVar.IconCompatParcelizer());
                    }
                    if (writeVar.MediaBrowserCompatMediaItem()) {
                        write(writeVar.write());
                    }
                    if (writeVar.AudioAttributesImplBaseParcelizer()) {
                        read(writeVar.AudioAttributesCompatParcelizer());
                    }
                    AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(writeVar.AudioAttributesImplBaseParcelizer));
                    return this;
                }

                @Override // kotlin.getSelectedAnswerIndex
                public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                    return MediaBrowserCompatSearchResultReceiver();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // o.setNotesCount.write
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public o.setActiveRecallQbankId.MediaDescriptionCompat.write.C0135write read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                    /*
                        r1 = this;
                        o.getParentMcqId<o.setActiveRecallQbankId$MediaDescriptionCompat$write> r0 = o.setActiveRecallQbankId.MediaDescriptionCompat.write.write     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        o.setActiveRecallQbankId$MediaDescriptionCompat$write r2 = (o.setActiveRecallQbankId.MediaDescriptionCompat.write) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        if (r2 == 0) goto Ld
                        r1.IconCompatParcelizer(r2)
                    Ld:
                        return r1
                    Le:
                        r2 = move-exception
                        goto L1a
                    L10:
                        r2 = move-exception
                        o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                        o.setActiveRecallQbankId$MediaDescriptionCompat$write r3 = (o.setActiveRecallQbankId.MediaDescriptionCompat.write) r3     // Catch: java.lang.Throwable -> Le
                        throw r2     // Catch: java.lang.Throwable -> L18
                    L18:
                        r2 = move-exception
                        goto L1b
                    L1a:
                        r3 = 0
                    L1b:
                        if (r3 == 0) goto L20
                        r1.IconCompatParcelizer(r3)
                    L20:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaDescriptionCompat.write.C0135write.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaDescriptionCompat$write$write");
                }

                private C0135write read(int i) {
                    this.RemoteActionCompatParcelizer |= 1;
                    this.AudioAttributesCompatParcelizer = i;
                    return this;
                }

                private boolean MediaBrowserCompatSearchResultReceiver() {
                    return (this.RemoteActionCompatParcelizer & 2) == 2;
                }

                private C0135write write(int i) {
                    this.RemoteActionCompatParcelizer |= 2;
                    this.read = i;
                    return this;
                }

                private C0135write read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                    this.RemoteActionCompatParcelizer |= 4;
                    this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                    return this;
                }
            }
        }

        private int MediaBrowserCompatItemReceiver() {
            return this.IconCompatParcelizer.size();
        }

        public final write read(int i) {
            return this.IconCompatParcelizer.get(i);
        }

        private void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.write;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < MediaBrowserCompatItemReceiver(); i++) {
                if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.write = (byte) 0;
                    return false;
                }
            }
            this.write = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(1, this.IconCompatParcelizer.get(i));
            }
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.read;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.IconCompatParcelizer.size(); i3++) {
                i2 += setResumeExplanation.read(1, this.IconCompatParcelizer.get(i3));
            }
            int iMediaBrowserCompatCustomActionResultReceiver = i2 + this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.read = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static read RemoteActionCompatParcelizer() {
            return read.AudioAttributesImplBaseParcelizer();
        }

        private static read MediaBrowserCompatSearchResultReceiver() {
            return RemoteActionCompatParcelizer();
        }

        public static read RemoteActionCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) {
            return RemoteActionCompatParcelizer().IconCompatParcelizer(mediaDescriptionCompat);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final read RatingCompat() {
            return RemoteActionCompatParcelizer(this);
        }

        public static final class read extends HomeLessonIndexV2.RemoteActionCompatParcelizer<MediaDescriptionCompat, read> implements setLessonNumber {
            private int RemoteActionCompatParcelizer;
            private List<write> read = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return RatingCompat();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return RatingCompat();
            }

            private read() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static read AudioAttributesImplBaseParcelizer() {
                return new read();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public read clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(MediaBrowserCompatItemReceiver());
            }

            private static MediaDescriptionCompat RatingCompat() {
                return MediaDescriptionCompat.IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
            public MediaDescriptionCompat write() {
                MediaDescriptionCompat mediaDescriptionCompatMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                if (mediaDescriptionCompatMediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
                    return mediaDescriptionCompatMediaBrowserCompatItemReceiver;
                }
                throw MediaBrowserCompatMediaItem();
            }

            public final MediaDescriptionCompat MediaBrowserCompatItemReceiver() {
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) 0);
                if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.RemoteActionCompatParcelizer &= -2;
                }
                mediaDescriptionCompat.IconCompatParcelizer = this.read;
                return mediaDescriptionCompat;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final read IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) {
                if (mediaDescriptionCompat == MediaDescriptionCompat.IconCompatParcelizer()) {
                    return this;
                }
                if (!mediaDescriptionCompat.IconCompatParcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = mediaDescriptionCompat.IconCompatParcelizer;
                        this.RemoteActionCompatParcelizer &= -2;
                    } else {
                        AudioAttributesImplApi26Parcelizer();
                        this.read.addAll(mediaDescriptionCompat.IconCompatParcelizer);
                    }
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(mediaDescriptionCompat.AudioAttributesImplApi21Parcelizer));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(); i++) {
                    if (!RemoteActionCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.MediaDescriptionCompat.read read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$MediaDescriptionCompat> r0 = o.setActiveRecallQbankId.MediaDescriptionCompat.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$MediaDescriptionCompat r2 = (o.setActiveRecallQbankId.MediaDescriptionCompat) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$MediaDescriptionCompat r3 = (o.setActiveRecallQbankId.MediaDescriptionCompat) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaDescriptionCompat.read.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaDescriptionCompat$read");
            }

            private void AudioAttributesImplApi26Parcelizer() {
                if ((this.RemoteActionCompatParcelizer & 1) != 1) {
                    this.read = new ArrayList(this.read);
                    this.RemoteActionCompatParcelizer |= 1;
                }
            }

            private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return this.read.size();
            }

            private write RemoteActionCompatParcelizer(int i) {
                return this.read.get(i);
            }
        }
    }

    public static final class IconCompatParcelizer extends HomeLessonIndexV2 implements setAssociatedLessons {
        private static final IconCompatParcelizer AudioAttributesCompatParcelizer;
        public static getParentMcqId<IconCompatParcelizer> IconCompatParcelizer = new setReadTime<IconCompatParcelizer>() { // from class: o.setActiveRecallQbankId.IconCompatParcelizer.1
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return read(setslidescount, setsteptype);
            }

            private static IconCompatParcelizer read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new IconCompatParcelizer(setslidescount, setsteptype, (byte) 0);
            }
        };
        private final setVideoAspectRatio AudioAttributesImplApi21Parcelizer;
        private byte AudioAttributesImplApi26Parcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private List<C0132IconCompatParcelizer> read;
        private int write;

        /* synthetic */ IconCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaMetadataCompat();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaBrowserCompatMediaItem();
        }

        private IconCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.AudioAttributesImplApi26Parcelizer = (byte) -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private IconCompatParcelizer() {
            this.AudioAttributesImplApi26Parcelizer = (byte) -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.AudioAttributesImplApi21Parcelizer = setVideoAspectRatio.write;
        }

        public static IconCompatParcelizer IconCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        private static IconCompatParcelizer MediaBrowserCompatMediaItem() {
            return AudioAttributesCompatParcelizer;
        }

        private IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesImplApi26Parcelizer = (byte) -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            MediaBrowserCompatSearchResultReceiver();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                this.write |= 1;
                                this.RemoteActionCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 18) {
                                if ((c & 2) != 2) {
                                    this.read = new ArrayList();
                                    c = 2;
                                }
                                this.read.add((C0132IconCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(C0132IconCompatParcelizer.AudioAttributesCompatParcelizer, setsteptype));
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.read = Collections.unmodifiableList(this.read);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.read = Collections.unmodifiableList(this.read);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            AudioAttributesCompatParcelizer = iconCompatParcelizer;
            iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
        }

        /* JADX INFO: renamed from: o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        public static final class C0132IconCompatParcelizer extends HomeLessonIndexV2 implements isOptional {
            public static getParentMcqId<C0132IconCompatParcelizer> AudioAttributesCompatParcelizer = new setReadTime<C0132IconCompatParcelizer>() { // from class: o.setActiveRecallQbankId.IconCompatParcelizer.IconCompatParcelizer.5
                @Override // kotlin.getParentMcqId
                public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    return write(setslidescount, setsteptype);
                }

                private static C0132IconCompatParcelizer write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    return new C0132IconCompatParcelizer(setslidescount, setsteptype, (byte) 0);
                }
            };
            private static final C0132IconCompatParcelizer IconCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private final setVideoAspectRatio AudioAttributesImplBaseParcelizer;
            private RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
            private byte RemoteActionCompatParcelizer;
            private int read;
            private int write;

            /* synthetic */ C0132IconCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
                this(remoteActionCompatParcelizer);
            }

            /* synthetic */ C0132IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
                this(setslidescount, setsteptype);
            }

            @Override // kotlin.BookReference
            public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
                return MediaBrowserCompatMediaItem();
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaMetadataCompat();
            }

            private C0132IconCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super((byte) 0);
                this.RemoteActionCompatParcelizer = (byte) -1;
                this.write = -1;
                this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
            }

            private C0132IconCompatParcelizer() {
                this.RemoteActionCompatParcelizer = (byte) -1;
                this.write = -1;
                this.AudioAttributesImplBaseParcelizer = setVideoAspectRatio.write;
            }

            public static C0132IconCompatParcelizer IconCompatParcelizer() {
                return IconCompatParcelizer;
            }

            private static C0132IconCompatParcelizer MediaMetadataCompat() {
                return IconCompatParcelizer;
            }

            private C0132IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                this.RemoteActionCompatParcelizer = (byte) -1;
                this.write = -1;
                AudioAttributesImplBaseParcelizer();
                setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
                setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                    this.read |= 1;
                                    this.AudioAttributesImplApi21Parcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 18) {
                                    RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer c0134RemoteActionCompatParcelizerRatingCompat = (this.read & 2) == 2 ? this.MediaBrowserCompatItemReceiver.RatingCompat() : null;
                                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, setsteptype);
                                    this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer;
                                    if (c0134RemoteActionCompatParcelizerRatingCompat != null) {
                                        c0134RemoteActionCompatParcelizerRatingCompat.IconCompatParcelizer(remoteActionCompatParcelizer);
                                        this.MediaBrowserCompatItemReceiver = c0134RemoteActionCompatParcelizerRatingCompat.AudioAttributesImplBaseParcelizer();
                                    }
                                    this.read |= 2;
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (LessonTabItem e) {
                            throw e.write(this);
                        } catch (IOException e2) {
                            throw new LessonTabItem(e2.getMessage()).write(this);
                        }
                    } catch (Throwable th) {
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                }
                try {
                    setresumeexplanation.IconCompatParcelizer();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    throw th3;
                }
                this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                onStop();
            }

            static {
                C0132IconCompatParcelizer c0132IconCompatParcelizer = new C0132IconCompatParcelizer();
                IconCompatParcelizer = c0132IconCompatParcelizer;
                c0132IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }

            /* JADX INFO: renamed from: o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer */
            public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2 implements isPaid {
                public static getParentMcqId<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new setReadTime<RemoteActionCompatParcelizer>() { // from class: o.setActiveRecallQbankId.IconCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getParentMcqId
                    public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                        return read(setslidescount, setsteptype);
                    }

                    private static RemoteActionCompatParcelizer read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                        return new RemoteActionCompatParcelizer(setslidescount, setsteptype, (byte) 0);
                    }
                };
                private static final RemoteActionCompatParcelizer write;
                private double AudioAttributesImplApi21Parcelizer;
                private int AudioAttributesImplApi26Parcelizer;
                private int AudioAttributesImplBaseParcelizer;
                private int IconCompatParcelizer;
                private int MediaBrowserCompatCustomActionResultReceiver;
                private int MediaBrowserCompatItemReceiver;
                private long MediaBrowserCompatMediaItem;
                private int MediaBrowserCompatSearchResultReceiver;
                private EnumC0133IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                private float MediaDescriptionCompat;
                private byte MediaMetadataCompat;
                private int RatingCompat;
                private IconCompatParcelizer RemoteActionCompatParcelizer;
                private final setVideoAspectRatio onCommand;
                private List<RemoteActionCompatParcelizer> read;

                /* synthetic */ RemoteActionCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
                    this(remoteActionCompatParcelizer);
                }

                /* synthetic */ RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
                    this(setslidescount, setsteptype);
                }

                @Override // kotlin.BookReference
                public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
                    return onPrepareFromUri();
                }

                @Override // kotlin.getSelectedAnswerIndex
                public final /* synthetic */ BookReference read() {
                    return onSeekTo();
                }

                private RemoteActionCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                    super((byte) 0);
                    this.MediaMetadataCompat = (byte) -1;
                    this.RatingCompat = -1;
                    this.onCommand = remoteActionCompatParcelizer.MediaMetadataCompat();
                }

                private RemoteActionCompatParcelizer() {
                    this.MediaMetadataCompat = (byte) -1;
                    this.RatingCompat = -1;
                    this.onCommand = setVideoAspectRatio.write;
                }

                public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
                    return write;
                }

                private static RemoteActionCompatParcelizer onSeekTo() {
                    return write;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    this.MediaMetadataCompat = (byte) -1;
                    this.RatingCompat = -1;
                    onPrepareFromSearch();
                    setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
                    setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
                    boolean z = false;
                    char c = 0;
                    while (true) {
                        ?? Write = 256;
                        if (z) {
                            if ((c & 256) == 256) {
                                this.read = Collections.unmodifiableList(this.read);
                            }
                            try {
                                setresumeexplanation.IconCompatParcelizer();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                                throw th;
                            }
                            this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            onStop();
                            return;
                        }
                        try {
                            try {
                                int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                                switch (iHandleMediaPlayPauseIfPendingOnHandler) {
                                    case 0:
                                        z = true;
                                        break;
                                    case 8:
                                        int iWrite = setslidescount.write();
                                        EnumC0133IconCompatParcelizer enumC0133IconCompatParcelizerAudioAttributesCompatParcelizer = EnumC0133IconCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                                        if (enumC0133IconCompatParcelizerAudioAttributesCompatParcelizer == null) {
                                            setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                            setresumeexplanation.MediaMetadataCompat(iWrite);
                                        } else {
                                            this.AudioAttributesImplApi26Parcelizer |= 1;
                                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = enumC0133IconCompatParcelizerAudioAttributesCompatParcelizer;
                                        }
                                        break;
                                    case 16:
                                        this.AudioAttributesImplApi26Parcelizer |= 2;
                                        this.MediaBrowserCompatMediaItem = setslidescount.MediaBrowserCompatMediaItem();
                                        break;
                                    case 29:
                                        this.AudioAttributesImplApi26Parcelizer |= 4;
                                        this.MediaDescriptionCompat = setslidescount.AudioAttributesImplApi21Parcelizer();
                                        break;
                                    case 33:
                                        this.AudioAttributesImplApi26Parcelizer |= 8;
                                        this.AudioAttributesImplApi21Parcelizer = setslidescount.IconCompatParcelizer();
                                        break;
                                    case 40:
                                        this.AudioAttributesImplApi26Parcelizer |= 16;
                                        this.MediaBrowserCompatSearchResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                        break;
                                    case 48:
                                        this.AudioAttributesImplApi26Parcelizer |= 32;
                                        this.AudioAttributesImplBaseParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                        break;
                                    case 56:
                                        this.AudioAttributesImplApi26Parcelizer |= 64;
                                        this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                        break;
                                    case 66:
                                        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRatingCompat = (this.AudioAttributesImplApi26Parcelizer & 128) == 128 ? this.RemoteActionCompatParcelizer.RatingCompat() : null;
                                        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(IconCompatParcelizer.IconCompatParcelizer, setsteptype);
                                        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
                                        if (audioAttributesCompatParcelizerRatingCompat != null) {
                                            audioAttributesCompatParcelizerRatingCompat.IconCompatParcelizer(iconCompatParcelizer);
                                            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizerRatingCompat.AudioAttributesImplApi26Parcelizer();
                                        }
                                        this.AudioAttributesImplApi26Parcelizer |= 128;
                                        break;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.read = new ArrayList();
                                            c = 256;
                                        }
                                        this.read.add((RemoteActionCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer, setsteptype));
                                        break;
                                    case 80:
                                        this.AudioAttributesImplApi26Parcelizer |= 512;
                                        this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                        break;
                                    case 88:
                                        this.AudioAttributesImplApi26Parcelizer |= 256;
                                        this.IconCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                        break;
                                    default:
                                        Write = write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler);
                                        if (Write == 0) {
                                            z = true;
                                        }
                                        break;
                                }
                            } catch (LessonTabItem e) {
                                throw e.write(this);
                            } catch (IOException e2) {
                                throw new LessonTabItem(e2.getMessage()).write(this);
                            }
                        } catch (Throwable th2) {
                            if ((c & 256) == Write) {
                                this.read = Collections.unmodifiableList(this.read);
                            }
                            try {
                                setresumeexplanation.IconCompatParcelizer();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
                                this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                                throw th3;
                            }
                            this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            onStop();
                            throw th2;
                        }
                    }
                }

                static {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
                    write = remoteActionCompatParcelizer;
                    remoteActionCompatParcelizer.onPrepareFromSearch();
                }

                /* JADX INFO: renamed from: o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
                public enum EnumC0133IconCompatParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    private final int RatingCompat;

                    static {
                        new LessonSpinnerItem.RemoteActionCompatParcelizer<EnumC0133IconCompatParcelizer>() { // from class: o.setActiveRecallQbankId.IconCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer.4
                            @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                            public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                                return AudioAttributesCompatParcelizer(i);
                            }

                            private static EnumC0133IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                                return EnumC0133IconCompatParcelizer.AudioAttributesCompatParcelizer(i);
                            }
                        };
                    }

                    @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
                    public final int RemoteActionCompatParcelizer() {
                        return this.RatingCompat;
                    }

                    public static EnumC0133IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    EnumC0133IconCompatParcelizer(int i) {
                        this.RatingCompat = i;
                    }
                }

                public final boolean onPrepare() {
                    return (this.AudioAttributesImplApi26Parcelizer & 1) == 1;
                }

                public final EnumC0133IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                    return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }

                public final boolean onMediaButtonEvent() {
                    return (this.AudioAttributesImplApi26Parcelizer & 2) == 2;
                }

                public final long MediaBrowserCompatMediaItem() {
                    return this.MediaBrowserCompatMediaItem;
                }

                public final boolean onPlay() {
                    return (this.AudioAttributesImplApi26Parcelizer & 4) == 4;
                }

                public final float MediaBrowserCompatSearchResultReceiver() {
                    return this.MediaDescriptionCompat;
                }

                public final boolean onPause() {
                    return (this.AudioAttributesImplApi26Parcelizer & 8) == 8;
                }

                public final double MediaBrowserCompatItemReceiver() {
                    return this.AudioAttributesImplApi21Parcelizer;
                }

                public final boolean onPrepareFromMediaId() {
                    return (this.AudioAttributesImplApi26Parcelizer & 16) == 16;
                }

                public final int onCustomAction() {
                    return this.MediaBrowserCompatSearchResultReceiver;
                }

                public final boolean handleMediaPlayPauseIfPendingOnHandler() {
                    return (this.AudioAttributesImplApi26Parcelizer & 32) == 32;
                }

                public final int AudioAttributesImplBaseParcelizer() {
                    return this.AudioAttributesImplBaseParcelizer;
                }

                public final boolean onFastForward() {
                    return (this.AudioAttributesImplApi26Parcelizer & 64) == 64;
                }

                public final int MediaMetadataCompat() {
                    return this.MediaBrowserCompatCustomActionResultReceiver;
                }

                public final boolean onAddQueueItem() {
                    return (this.AudioAttributesImplApi26Parcelizer & 128) == 128;
                }

                public final IconCompatParcelizer write() {
                    return this.RemoteActionCompatParcelizer;
                }

                public final List<RemoteActionCompatParcelizer> IconCompatParcelizer() {
                    return this.read;
                }

                private int onRewind() {
                    return this.read.size();
                }

                public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                    return this.read.get(i);
                }

                public final boolean onCommand() {
                    return (this.AudioAttributesImplApi26Parcelizer & 256) == 256;
                }

                public final int AudioAttributesCompatParcelizer() {
                    return this.IconCompatParcelizer;
                }

                public final boolean onPlayFromMediaId() {
                    return (this.AudioAttributesImplApi26Parcelizer & 512) == 512;
                }

                public final int MediaDescriptionCompat() {
                    return this.MediaBrowserCompatItemReceiver;
                }

                private void onPrepareFromSearch() {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = EnumC0133IconCompatParcelizer.BYTE;
                    this.MediaBrowserCompatMediaItem = 0L;
                    this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
                    this.AudioAttributesImplApi21Parcelizer = 0.0d;
                    this.MediaBrowserCompatSearchResultReceiver = 0;
                    this.AudioAttributesImplBaseParcelizer = 0;
                    this.MediaBrowserCompatCustomActionResultReceiver = 0;
                    this.RemoteActionCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer();
                    this.read = Collections.emptyList();
                    this.IconCompatParcelizer = 0;
                    this.MediaBrowserCompatItemReceiver = 0;
                }

                @Override // kotlin.getSelectedAnswerIndex
                public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                    byte b = this.MediaMetadataCompat;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (onAddQueueItem() && !write().MediaBrowserCompatCustomActionResultReceiver()) {
                        this.MediaMetadataCompat = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < onRewind(); i++) {
                        if (!AudioAttributesCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                            this.MediaMetadataCompat = (byte) 0;
                            return false;
                        }
                    }
                    this.MediaMetadataCompat = (byte) 1;
                    return true;
                }

                @Override // kotlin.BookReference
                public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
                    AudioAttributesImplApi21Parcelizer();
                    if ((this.AudioAttributesImplApi26Parcelizer & 1) == 1) {
                        setresumeexplanation.RemoteActionCompatParcelizer(1, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer());
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 2) == 2) {
                        setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatMediaItem);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 4) == 4) {
                        setresumeexplanation.RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 8) == 8) {
                        setresumeexplanation.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 16) == 16) {
                        setresumeexplanation.write(5, this.MediaBrowserCompatSearchResultReceiver);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 32) == 32) {
                        setresumeexplanation.write(6, this.AudioAttributesImplBaseParcelizer);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 64) == 64) {
                        setresumeexplanation.write(7, this.MediaBrowserCompatCustomActionResultReceiver);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 128) == 128) {
                        setresumeexplanation.IconCompatParcelizer(8, this.RemoteActionCompatParcelizer);
                    }
                    for (int i = 0; i < this.read.size(); i++) {
                        setresumeexplanation.IconCompatParcelizer(9, this.read.get(i));
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 512) == 512) {
                        setresumeexplanation.write(10, this.MediaBrowserCompatItemReceiver);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 256) == 256) {
                        setresumeexplanation.write(11, this.IconCompatParcelizer);
                    }
                    setresumeexplanation.IconCompatParcelizer(this.onCommand);
                }

                @Override // kotlin.BookReference
                public final int AudioAttributesImplApi21Parcelizer() {
                    int i = this.RatingCompat;
                    if (i != -1) {
                        return i;
                    }
                    int iIconCompatParcelizer = (this.AudioAttributesImplApi26Parcelizer & 1) == 1 ? setResumeExplanation.IconCompatParcelizer(1, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) : 0;
                    if ((this.AudioAttributesImplApi26Parcelizer & 2) == 2) {
                        iIconCompatParcelizer += setResumeExplanation.write(this.MediaBrowserCompatMediaItem);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 4) == 4) {
                        iIconCompatParcelizer += setResumeExplanation.write();
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 8) == 8) {
                        iIconCompatParcelizer += setResumeExplanation.read();
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 16) == 16) {
                        iIconCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(5, this.MediaBrowserCompatSearchResultReceiver);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 32) == 32) {
                        iIconCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(6, this.AudioAttributesImplBaseParcelizer);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 64) == 64) {
                        iIconCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(7, this.MediaBrowserCompatCustomActionResultReceiver);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 128) == 128) {
                        iIconCompatParcelizer += setResumeExplanation.read(8, this.RemoteActionCompatParcelizer);
                    }
                    for (int i2 = 0; i2 < this.read.size(); i2++) {
                        iIconCompatParcelizer += setResumeExplanation.read(9, this.read.get(i2));
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 512) == 512) {
                        iIconCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(10, this.MediaBrowserCompatItemReceiver);
                    }
                    if ((this.AudioAttributesImplApi26Parcelizer & 256) == 256) {
                        iIconCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(11, this.IconCompatParcelizer);
                    }
                    int iMediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer + this.onCommand.MediaBrowserCompatCustomActionResultReceiver();
                    this.RatingCompat = iMediaBrowserCompatCustomActionResultReceiver;
                    return iMediaBrowserCompatCustomActionResultReceiver;
                }

                private static C0134RemoteActionCompatParcelizer onPlayFromSearch() {
                    return C0134RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
                }

                private static C0134RemoteActionCompatParcelizer onPrepareFromUri() {
                    return onPlayFromSearch();
                }

                public static C0134RemoteActionCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                    return onPlayFromSearch().IconCompatParcelizer(remoteActionCompatParcelizer);
                }

                @Override // kotlin.BookReference
                /* JADX INFO: renamed from: onPlayFromUri, reason: merged with bridge method [inline-methods] */
                public final C0134RemoteActionCompatParcelizer RatingCompat() {
                    return IconCompatParcelizer(this);
                }

                /* JADX INFO: renamed from: o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
                public static final class C0134RemoteActionCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<RemoteActionCompatParcelizer, C0134RemoteActionCompatParcelizer> implements isPaid {
                    public static int RemoteActionCompatParcelizer;
                    public static int write;
                    private int AudioAttributesImplApi21Parcelizer;
                    private int AudioAttributesImplApi26Parcelizer;
                    private int AudioAttributesImplBaseParcelizer;
                    private int IconCompatParcelizer;
                    private int MediaBrowserCompatCustomActionResultReceiver;
                    private double MediaBrowserCompatItemReceiver;
                    private long MediaBrowserCompatSearchResultReceiver;
                    private int MediaDescriptionCompat;
                    private float MediaMetadataCompat;
                    private EnumC0133IconCompatParcelizer MediaBrowserCompatMediaItem = EnumC0133IconCompatParcelizer.BYTE;
                    private IconCompatParcelizer read = IconCompatParcelizer.IconCompatParcelizer();
                    private List<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = Collections.emptyList();

                    @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
                    public final /* synthetic */ HomeLessonIndexV2 read() {
                        return onAddQueueItem();
                    }

                    @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
                    public final /* synthetic */ BookReference read() {
                        return onAddQueueItem();
                    }

                    private C0134RemoteActionCompatParcelizer() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static C0134RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver() {
                        return new C0134RemoteActionCompatParcelizer();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
                    /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
                    public C0134RemoteActionCompatParcelizer clone() {
                        return MediaBrowserCompatItemReceiver().IconCompatParcelizer(AudioAttributesImplBaseParcelizer());
                    }

                    private static RemoteActionCompatParcelizer onAddQueueItem() {
                        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // o.BookReference.write
                    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
                    public RemoteActionCompatParcelizer write() {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                        if (remoteActionCompatParcelizerAudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                            return remoteActionCompatParcelizerAudioAttributesImplBaseParcelizer;
                        }
                        throw MediaBrowserCompatMediaItem();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                        int i = this.MediaBrowserCompatCustomActionResultReceiver;
                        int i2 = (i & 1) == 1 ? 1 : 0;
                        remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatMediaItem;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = this.MediaBrowserCompatSearchResultReceiver;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        remoteActionCompatParcelizer.MediaDescriptionCompat = this.MediaMetadataCompat;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatItemReceiver;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver = this.MediaDescriptionCompat;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplBaseParcelizer;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = this.read;
                        if ((this.MediaBrowserCompatCustomActionResultReceiver & 256) == 256) {
                            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(this.AudioAttributesCompatParcelizer);
                            this.MediaBrowserCompatCustomActionResultReceiver &= -257;
                        }
                        remoteActionCompatParcelizer.read = this.AudioAttributesCompatParcelizer;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        remoteActionCompatParcelizer.IconCompatParcelizer = this.IconCompatParcelizer;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer;
                        remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer = i2;
                        return remoteActionCompatParcelizer;
                    }

                    @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final C0134RemoteActionCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                        if (remoteActionCompatParcelizer == RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                            return this;
                        }
                        if (remoteActionCompatParcelizer.onPrepare()) {
                            write(remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                        }
                        if (remoteActionCompatParcelizer.onMediaButtonEvent()) {
                            IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
                        }
                        if (remoteActionCompatParcelizer.onPlay()) {
                            read(remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
                        }
                        if (remoteActionCompatParcelizer.onPause()) {
                            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
                        }
                        if (remoteActionCompatParcelizer.onPrepareFromMediaId()) {
                            MediaBrowserCompatItemReceiver(remoteActionCompatParcelizer.onCustomAction());
                        }
                        if (remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler()) {
                            IconCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
                        }
                        if (remoteActionCompatParcelizer.onFastForward()) {
                            RemoteActionCompatParcelizer(remoteActionCompatParcelizer.MediaMetadataCompat());
                        }
                        if (remoteActionCompatParcelizer.onAddQueueItem()) {
                            IconCompatParcelizer(remoteActionCompatParcelizer.write());
                        }
                        if (!remoteActionCompatParcelizer.read.isEmpty()) {
                            if (this.AudioAttributesCompatParcelizer.isEmpty()) {
                                this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.read;
                                this.MediaBrowserCompatCustomActionResultReceiver &= -257;
                            } else {
                                MediaBrowserCompatSearchResultReceiver();
                                this.AudioAttributesCompatParcelizer.addAll(remoteActionCompatParcelizer.read);
                            }
                        }
                        if (remoteActionCompatParcelizer.onCommand()) {
                            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                        }
                        if (remoteActionCompatParcelizer.onPlayFromMediaId()) {
                            write(remoteActionCompatParcelizer.MediaDescriptionCompat());
                        }
                        AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(remoteActionCompatParcelizer.onCommand));
                        return this;
                    }

                    @Override // kotlin.getSelectedAnswerIndex
                    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                        if (onCustomAction() && !handleMediaPlayPauseIfPendingOnHandler().MediaBrowserCompatCustomActionResultReceiver()) {
                            return false;
                        }
                        for (int i = 0; i < onCommand(); i++) {
                            if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                    @Override // o.setNotesCount.write
                    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                        /*
                            r1 = this;
                            o.getParentMcqId<o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer> r0 = o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                            java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                            o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer r2 = (o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                            if (r2 == 0) goto Ld
                            r1.IconCompatParcelizer(r2)
                        Ld:
                            return r1
                        Le:
                            r2 = move-exception
                            goto L1a
                        L10:
                            r2 = move-exception
                            o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                            o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer r3 = (o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer) r3     // Catch: java.lang.Throwable -> Le
                            throw r2     // Catch: java.lang.Throwable -> L18
                        L18:
                            r2 = move-exception
                            goto L1b
                        L1a:
                            r3 = 0
                        L1b:
                            if (r3 == 0) goto L20
                            r1.IconCompatParcelizer(r3)
                        L20:
                            throw r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer");
                    }

                    private C0134RemoteActionCompatParcelizer write(EnumC0133IconCompatParcelizer enumC0133IconCompatParcelizer) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 1;
                        this.MediaBrowserCompatMediaItem = enumC0133IconCompatParcelizer;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer IconCompatParcelizer(long j) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 2;
                        this.MediaBrowserCompatSearchResultReceiver = j;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer read(float f) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 4;
                        this.MediaMetadataCompat = f;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(double d) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 8;
                        this.MediaBrowserCompatItemReceiver = d;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(int i) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 16;
                        this.MediaDescriptionCompat = i;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 32;
                        this.AudioAttributesImplBaseParcelizer = i;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 64;
                        this.AudioAttributesImplApi21Parcelizer = i;
                        return this;
                    }

                    private boolean onCustomAction() {
                        return (this.MediaBrowserCompatCustomActionResultReceiver & 128) == 128;
                    }

                    private IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler() {
                        return this.read;
                    }

                    private C0134RemoteActionCompatParcelizer IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
                        if ((this.MediaBrowserCompatCustomActionResultReceiver & 128) == 128 && this.read != IconCompatParcelizer.IconCompatParcelizer()) {
                            this.read = IconCompatParcelizer.read(this.read).IconCompatParcelizer(iconCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                        } else {
                            this.read = iconCompatParcelizer;
                        }
                        this.MediaBrowserCompatCustomActionResultReceiver |= 128;
                        return this;
                    }

                    private void MediaBrowserCompatSearchResultReceiver() {
                        if ((this.MediaBrowserCompatCustomActionResultReceiver & 256) != 256) {
                            this.AudioAttributesCompatParcelizer = new ArrayList(this.AudioAttributesCompatParcelizer);
                            this.MediaBrowserCompatCustomActionResultReceiver |= 256;
                        }
                    }

                    private int onCommand() {
                        return this.AudioAttributesCompatParcelizer.size();
                    }

                    private RemoteActionCompatParcelizer read(int i) {
                        return this.AudioAttributesCompatParcelizer.get(i);
                    }

                    private C0134RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 512;
                        this.IconCompatParcelizer = i;
                        return this;
                    }

                    private C0134RemoteActionCompatParcelizer write(int i) {
                        this.MediaBrowserCompatCustomActionResultReceiver |= 1024;
                        this.AudioAttributesImplApi26Parcelizer = i;
                        return this;
                    }

                    public static int AudioAttributesImplApi26Parcelizer() {
                        int i = RemoteActionCompatParcelizer;
                        int i2 = i % 9861142;
                        RemoteActionCompatParcelizer = i + 1;
                        if (i2 != 0) {
                            return write;
                        }
                        int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
                        write = mode;
                        return mode;
                    }
                }
            }

            public final boolean RemoteActionCompatParcelizer() {
                return (this.read & 1) == 1;
            }

            public final int write() {
                return this.AudioAttributesImplApi21Parcelizer;
            }

            public final boolean MediaBrowserCompatItemReceiver() {
                return (this.read & 2) == 2;
            }

            public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
                return this.MediaBrowserCompatItemReceiver;
            }

            private void AudioAttributesImplBaseParcelizer() {
                this.AudioAttributesImplApi21Parcelizer = 0;
                this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                byte b = this.RemoteActionCompatParcelizer;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!RemoteActionCompatParcelizer()) {
                    this.RemoteActionCompatParcelizer = (byte) 0;
                    return false;
                }
                if (!MediaBrowserCompatItemReceiver()) {
                    this.RemoteActionCompatParcelizer = (byte) 0;
                    return false;
                }
                if (!AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                    this.RemoteActionCompatParcelizer = (byte) 0;
                    return false;
                }
                this.RemoteActionCompatParcelizer = (byte) 1;
                return true;
            }

            @Override // kotlin.BookReference
            public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
                AudioAttributesImplApi21Parcelizer();
                if ((this.read & 1) == 1) {
                    setresumeexplanation.write(1, this.AudioAttributesImplApi21Parcelizer);
                }
                if ((this.read & 2) == 2) {
                    setresumeexplanation.IconCompatParcelizer(2, this.MediaBrowserCompatItemReceiver);
                }
                setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            }

            @Override // kotlin.BookReference
            public final int AudioAttributesImplApi21Parcelizer() {
                int i = this.write;
                if (i != -1) {
                    return i;
                }
                int iAudioAttributesCompatParcelizer = (this.read & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.AudioAttributesImplApi21Parcelizer) : 0;
                if ((this.read & 2) == 2) {
                    iAudioAttributesCompatParcelizer += setResumeExplanation.read(2, this.MediaBrowserCompatItemReceiver);
                }
                int iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer + this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                this.write = iMediaBrowserCompatCustomActionResultReceiver;
                return iMediaBrowserCompatCustomActionResultReceiver;
            }

            private static write MediaDescriptionCompat() {
                return write.AudioAttributesImplBaseParcelizer();
            }

            private static write MediaBrowserCompatMediaItem() {
                return MediaDescriptionCompat();
            }

            private static write IconCompatParcelizer(C0132IconCompatParcelizer c0132IconCompatParcelizer) {
                return MediaDescriptionCompat().IconCompatParcelizer(c0132IconCompatParcelizer);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.BookReference
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
            public write RatingCompat() {
                return IconCompatParcelizer(this);
            }

            /* JADX INFO: renamed from: o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$write */
            public static final class write extends HomeLessonIndexV2.RemoteActionCompatParcelizer<C0132IconCompatParcelizer, write> implements isOptional {
                private RemoteActionCompatParcelizer RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                private int read;
                private int write;

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
                public final /* synthetic */ HomeLessonIndexV2 read() {
                    return RatingCompat();
                }

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
                public final /* synthetic */ BookReference read() {
                    return RatingCompat();
                }

                private write() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static write AudioAttributesImplBaseParcelizer() {
                    return new write();
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
                /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
                public write clone() {
                    return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
                }

                private static C0132IconCompatParcelizer RatingCompat() {
                    return C0132IconCompatParcelizer.IconCompatParcelizer();
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // o.BookReference.write
                /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
                public C0132IconCompatParcelizer write() {
                    C0132IconCompatParcelizer c0132IconCompatParcelizerAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                    if (c0132IconCompatParcelizerAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                        return c0132IconCompatParcelizerAudioAttributesImplApi26Parcelizer;
                    }
                    throw MediaBrowserCompatMediaItem();
                }

                /* JADX WARN: Multi-variable type inference failed */
                private C0132IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                    C0132IconCompatParcelizer c0132IconCompatParcelizer = new C0132IconCompatParcelizer((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                    int i = this.read;
                    int i2 = (i & 1) == 1 ? 1 : 0;
                    c0132IconCompatParcelizer.AudioAttributesImplApi21Parcelizer = this.write;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    c0132IconCompatParcelizer.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer;
                    c0132IconCompatParcelizer.read = i2;
                    return c0132IconCompatParcelizer;
                }

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public final write IconCompatParcelizer(C0132IconCompatParcelizer c0132IconCompatParcelizer) {
                    if (c0132IconCompatParcelizer == C0132IconCompatParcelizer.IconCompatParcelizer()) {
                        return this;
                    }
                    if (c0132IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                        write(c0132IconCompatParcelizer.write());
                    }
                    if (c0132IconCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                        write(c0132IconCompatParcelizer.AudioAttributesCompatParcelizer());
                    }
                    AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(c0132IconCompatParcelizer.AudioAttributesImplBaseParcelizer));
                    return this;
                }

                @Override // kotlin.getSelectedAnswerIndex
                public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                    return onAddQueueItem() && onCustomAction() && MediaBrowserCompatSearchResultReceiver().MediaBrowserCompatCustomActionResultReceiver();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // o.setNotesCount.write
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.write read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                    /*
                        r1 = this;
                        o.getParentMcqId<o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer> r0 = o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer r2 = (o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        if (r2 == 0) goto Ld
                        r1.IconCompatParcelizer(r2)
                    Ld:
                        return r1
                    Le:
                        r2 = move-exception
                        goto L1a
                    L10:
                        r2 = move-exception
                        o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                        o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer r3 = (o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer) r3     // Catch: java.lang.Throwable -> Le
                        throw r2     // Catch: java.lang.Throwable -> L18
                    L18:
                        r2 = move-exception
                        goto L1b
                    L1a:
                        r3 = 0
                    L1b:
                        if (r3 == 0) goto L20
                        r1.IconCompatParcelizer(r3)
                    L20:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.write.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$IconCompatParcelizer$IconCompatParcelizer$write");
                }

                private boolean onAddQueueItem() {
                    return (this.read & 1) == 1;
                }

                private write write(int i) {
                    this.read |= 1;
                    this.write = i;
                    return this;
                }

                private boolean onCustomAction() {
                    return (this.read & 2) == 2;
                }

                private RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
                    return this.RemoteActionCompatParcelizer;
                }

                private write write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                    if ((this.read & 2) == 2 && this.RemoteActionCompatParcelizer != RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                        this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer(remoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
                    } else {
                        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
                    }
                    this.read |= 2;
                    return this;
                }
            }
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return (this.write & 1) == 1;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final List<C0132IconCompatParcelizer> RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final int write() {
            return this.read.size();
        }

        private C0132IconCompatParcelizer IconCompatParcelizer(int i) {
            return this.read.get(i);
        }

        private void MediaBrowserCompatSearchResultReceiver() {
            this.RemoteActionCompatParcelizer = 0;
            this.read = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesImplApi26Parcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!MediaBrowserCompatItemReceiver()) {
                this.AudioAttributesImplApi26Parcelizer = (byte) 0;
                return false;
            }
            for (int i = 0; i < write(); i++) {
                if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplApi26Parcelizer = (byte) 0;
                    return false;
                }
            }
            this.AudioAttributesImplApi26Parcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            if ((this.write & 1) == 1) {
                setresumeexplanation.write(1, this.RemoteActionCompatParcelizer);
            }
            for (int i = 0; i < this.read.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(2, this.read.get(i));
            }
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.write & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.RemoteActionCompatParcelizer) : 0;
            for (int i2 = 0; i2 < this.read.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(2, this.read.get(i2));
            }
            int iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer + this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.MediaBrowserCompatCustomActionResultReceiver = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static AudioAttributesCompatParcelizer MediaDescriptionCompat() {
            return AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static AudioAttributesCompatParcelizer MediaMetadataCompat() {
            return MediaDescriptionCompat();
        }

        public static AudioAttributesCompatParcelizer read(IconCompatParcelizer iconCompatParcelizer) {
            return MediaDescriptionCompat().IconCompatParcelizer(iconCompatParcelizer);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer RatingCompat() {
            return read(this);
        }

        public static final class AudioAttributesCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<IconCompatParcelizer, AudioAttributesCompatParcelizer> implements setAssociatedLessons {
            private int RemoteActionCompatParcelizer;
            private int read;
            private List<C0132IconCompatParcelizer> write = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }

            private AudioAttributesCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public AudioAttributesCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return IconCompatParcelizer.IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
            public IconCompatParcelizer write() {
                IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (iconCompatParcelizerAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return iconCompatParcelizerAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            public final IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) 0);
                byte b = (this.RemoteActionCompatParcelizer & 1) == 1 ? (byte) 1 : (byte) 0;
                iconCompatParcelizer.RemoteActionCompatParcelizer = this.read;
                if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                    this.write = Collections.unmodifiableList(this.write);
                    this.RemoteActionCompatParcelizer &= -3;
                }
                iconCompatParcelizer.read = this.write;
                iconCompatParcelizer.write = b;
                return iconCompatParcelizer;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final AudioAttributesCompatParcelizer IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
                if (iconCompatParcelizer == IconCompatParcelizer.IconCompatParcelizer()) {
                    return this;
                }
                if (iconCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                    RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer());
                }
                if (!iconCompatParcelizer.read.isEmpty()) {
                    if (this.write.isEmpty()) {
                        this.write = iconCompatParcelizer.read;
                        this.RemoteActionCompatParcelizer &= -3;
                    } else {
                        MediaBrowserCompatItemReceiver();
                        this.write.addAll(iconCompatParcelizer.read);
                    }
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesImplApi21Parcelizer));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onCustomAction()) {
                    return false;
                }
                for (int i = 0; i < MediaDescriptionCompat(); i++) {
                    if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.IconCompatParcelizer.AudioAttributesCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$IconCompatParcelizer> r0 = o.setActiveRecallQbankId.IconCompatParcelizer.IconCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$IconCompatParcelizer r2 = (o.setActiveRecallQbankId.IconCompatParcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$IconCompatParcelizer r3 = (o.setActiveRecallQbankId.IconCompatParcelizer) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.IconCompatParcelizer.AudioAttributesCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$IconCompatParcelizer$AudioAttributesCompatParcelizer");
            }

            private boolean onCustomAction() {
                return (this.RemoteActionCompatParcelizer & 1) == 1;
            }

            private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer |= 1;
                this.read = i;
                return this;
            }

            private void MediaBrowserCompatItemReceiver() {
                if ((this.RemoteActionCompatParcelizer & 2) != 2) {
                    this.write = new ArrayList(this.write);
                    this.RemoteActionCompatParcelizer |= 2;
                }
            }

            private int MediaDescriptionCompat() {
                return this.write.size();
            }

            private C0132IconCompatParcelizer read(int i) {
                return this.write.get(i);
            }
        }
    }

    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends HomeLessonIndexV2.read<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> implements setMCQCount {
        public static getParentMcqId<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> IconCompatParcelizer = new setReadTime<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver>() { // from class: o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.4
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return AudioAttributesCompatParcelizer(setslidescount, setsteptype);
            }

            private static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer;
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private byte MediaDescriptionCompat;
        private boolean MediaMetadataCompat;
        private int RatingCompat;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver handleMediaPlayPauseIfPendingOnHandler;
        private int onAddQueueItem;
        private final setVideoAspectRatio onCommand;
        private int onCustomAction;
        private List<read> read;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write;

        /* synthetic */ MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onSetRating();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onSetCaptioningEnabled();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(HomeLessonIndexV2.AudioAttributesCompatParcelizer<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.MediaDescriptionCompat = (byte) -1;
            this.MediaBrowserCompatSearchResultReceiver = -1;
            this.onCommand = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            this.MediaDescriptionCompat = (byte) -1;
            this.MediaBrowserCompatSearchResultReceiver = -1;
            this.onCommand = setVideoAspectRatio.write;
        }

        public static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }

        private static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onSetCaptioningEnabled() {
            return RemoteActionCompatParcelizer;
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            write writeVarRatingCompat;
            this.MediaDescriptionCompat = (byte) -1;
            this.MediaBrowserCompatSearchResultReceiver = -1;
            onSetRepeatMode();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        switch (iHandleMediaPlayPauseIfPendingOnHandler) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.AudioAttributesImplApi26Parcelizer |= 4096;
                                this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 18:
                                if (!z2) {
                                    this.read = new ArrayList();
                                    z2 = true;
                                }
                                this.read.add((read) setslidescount.RemoteActionCompatParcelizer(read.AudioAttributesCompatParcelizer, setsteptype));
                                break;
                            case 24:
                                this.AudioAttributesImplApi26Parcelizer |= 1;
                                this.MediaMetadataCompat = setslidescount.read();
                                break;
                            case 32:
                                this.AudioAttributesImplApi26Parcelizer |= 2;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 42:
                                writeVarRatingCompat = (this.AudioAttributesImplApi26Parcelizer & 4) == 4 ? this.MediaBrowserCompatMediaItem.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(IconCompatParcelizer, setsteptype);
                                this.MediaBrowserCompatMediaItem = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                    this.MediaBrowserCompatMediaItem = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.AudioAttributesImplApi26Parcelizer |= 4;
                                break;
                            case 48:
                                this.AudioAttributesImplApi26Parcelizer |= 16;
                                this.AudioAttributesImplBaseParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 56:
                                this.AudioAttributesImplApi26Parcelizer |= 32;
                                this.onAddQueueItem = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 64:
                                this.AudioAttributesImplApi26Parcelizer |= 8;
                                this.AudioAttributesImplApi21Parcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 72:
                                this.AudioAttributesImplApi26Parcelizer |= 64;
                                this.onCustomAction = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 82:
                                writeVarRatingCompat = (this.AudioAttributesImplApi26Parcelizer & 256) == 256 ? this.handleMediaPlayPauseIfPendingOnHandler.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(IconCompatParcelizer, setsteptype);
                                this.handleMediaPlayPauseIfPendingOnHandler = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2);
                                    this.handleMediaPlayPauseIfPendingOnHandler = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.AudioAttributesImplApi26Parcelizer |= 256;
                                break;
                            case 88:
                                this.AudioAttributesImplApi26Parcelizer |= 512;
                                this.RatingCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 96:
                                this.AudioAttributesImplApi26Parcelizer |= 128;
                                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 106:
                                writeVarRatingCompat = (this.AudioAttributesImplApi26Parcelizer & 1024) == 1024 ? this.write.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3 = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(IconCompatParcelizer, setsteptype);
                                this.write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3);
                                    this.write = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.AudioAttributesImplApi26Parcelizer |= 1024;
                                break;
                            case 112:
                                this.AudioAttributesImplApi26Parcelizer |= 2048;
                                this.AudioAttributesCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            default:
                                if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.read = Collections.unmodifiableList(this.read);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if (z2) {
                this.read = Collections.unmodifiableList(this.read);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.onCommand = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            RemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onSetRepeatMode();
        }

        public static final class read extends HomeLessonIndexV2 implements setLessonReadTimeText {
            public static getParentMcqId<read> AudioAttributesCompatParcelizer = new setReadTime<read>() { // from class: o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.5
                @Override // kotlin.getParentMcqId
                public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    return read(setslidescount, setsteptype);
                }

                private static read read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                    return new read(setslidescount, setsteptype, (byte) 0);
                }
            };
            private static final read RemoteActionCompatParcelizer;
            private write AudioAttributesImplApi21Parcelizer;
            private final setVideoAspectRatio AudioAttributesImplBaseParcelizer;
            private int IconCompatParcelizer;
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatItemReceiver;
            private int read;
            private byte write;

            /* synthetic */ read(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
                this(remoteActionCompatParcelizer);
            }

            /* synthetic */ read(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
                this(setslidescount, setsteptype);
            }

            @Override // kotlin.BookReference
            public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
                return onCustomAction();
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaMetadataCompat();
            }

            private read(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super((byte) 0);
                this.write = (byte) -1;
                this.read = -1;
                this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
            }

            private read() {
                this.write = (byte) -1;
                this.read = -1;
                this.AudioAttributesImplBaseParcelizer = setVideoAspectRatio.write;
            }

            public static read AudioAttributesCompatParcelizer() {
                return RemoteActionCompatParcelizer;
            }

            private static read MediaMetadataCompat() {
                return RemoteActionCompatParcelizer;
            }

            private read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                this.write = (byte) -1;
                this.read = -1;
                MediaBrowserCompatMediaItem();
                setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
                setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                                if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                    if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                        int iWrite = setslidescount.write();
                                        write writeVarWrite = write.write(iWrite);
                                        if (writeVarWrite == null) {
                                            setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                            setresumeexplanation.MediaMetadataCompat(iWrite);
                                        } else {
                                            this.IconCompatParcelizer |= 1;
                                            this.AudioAttributesImplApi21Parcelizer = writeVarWrite;
                                        }
                                    } else if (iHandleMediaPlayPauseIfPendingOnHandler == 18) {
                                        write writeVarRatingCompat = (this.IconCompatParcelizer & 2) == 2 ? this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat() : null;
                                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                        this.MediaBrowserCompatCustomActionResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                        if (writeVarRatingCompat != null) {
                                            writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                            this.MediaBrowserCompatCustomActionResultReceiver = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                        }
                                        this.IconCompatParcelizer |= 2;
                                    } else if (iHandleMediaPlayPauseIfPendingOnHandler == 24) {
                                        this.IconCompatParcelizer |= 4;
                                        this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                    } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                    }
                                }
                                z = true;
                            } catch (IOException e) {
                                throw new LessonTabItem(e.getMessage()).write(this);
                            }
                        } catch (LessonTabItem e2) {
                            throw e2.write(this);
                        }
                    } catch (Throwable th) {
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                }
                try {
                    setresumeexplanation.IconCompatParcelizer();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    throw th3;
                }
                this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                onStop();
            }

            static {
                read readVar = new read();
                RemoteActionCompatParcelizer = readVar;
                readVar.MediaBrowserCompatMediaItem();
            }

            public enum write implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                private final int AudioAttributesImplApi21Parcelizer;

                static {
                    new LessonSpinnerItem.RemoteActionCompatParcelizer<write>() { // from class: o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.write.4
                        @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                        public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                            return read(i);
                        }

                        private static write read(int i) {
                            return write.write(i);
                        }
                    };
                }

                @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
                public final int RemoteActionCompatParcelizer() {
                    return this.AudioAttributesImplApi21Parcelizer;
                }

                public static write write(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                write(int i) {
                    this.AudioAttributesImplApi21Parcelizer = i;
                }
            }

            public final boolean MediaBrowserCompatItemReceiver() {
                return (this.IconCompatParcelizer & 1) == 1;
            }

            public final write RemoteActionCompatParcelizer() {
                return this.AudioAttributesImplApi21Parcelizer;
            }

            public final boolean AudioAttributesImplBaseParcelizer() {
                return (this.IconCompatParcelizer & 2) == 2;
            }

            public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer() {
                return this.MediaBrowserCompatCustomActionResultReceiver;
            }

            public final boolean MediaDescriptionCompat() {
                return (this.IconCompatParcelizer & 4) == 4;
            }

            public final int write() {
                return this.MediaBrowserCompatItemReceiver;
            }

            private void MediaBrowserCompatMediaItem() {
                this.AudioAttributesImplApi21Parcelizer = write.INV;
                this.MediaBrowserCompatCustomActionResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
                this.MediaBrowserCompatItemReceiver = 0;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                byte b = this.write;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (AudioAttributesImplBaseParcelizer() && !IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                    this.write = (byte) 0;
                    return false;
                }
                this.write = (byte) 1;
                return true;
            }

            @Override // kotlin.BookReference
            public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
                AudioAttributesImplApi21Parcelizer();
                if ((this.IconCompatParcelizer & 1) == 1) {
                    setresumeexplanation.RemoteActionCompatParcelizer(1, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
                }
                if ((this.IconCompatParcelizer & 2) == 2) {
                    setresumeexplanation.IconCompatParcelizer(2, this.MediaBrowserCompatCustomActionResultReceiver);
                }
                if ((this.IconCompatParcelizer & 4) == 4) {
                    setresumeexplanation.write(3, this.MediaBrowserCompatItemReceiver);
                }
                setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            }

            @Override // kotlin.BookReference
            public final int AudioAttributesImplApi21Parcelizer() {
                int i = this.read;
                if (i != -1) {
                    return i;
                }
                int iIconCompatParcelizer = (this.IconCompatParcelizer & 1) == 1 ? setResumeExplanation.IconCompatParcelizer(1, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()) : 0;
                if ((this.IconCompatParcelizer & 2) == 2) {
                    iIconCompatParcelizer += setResumeExplanation.read(2, this.MediaBrowserCompatCustomActionResultReceiver);
                }
                if ((this.IconCompatParcelizer & 4) == 4) {
                    iIconCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(3, this.MediaBrowserCompatItemReceiver);
                }
                int iMediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer + this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                this.read = iMediaBrowserCompatCustomActionResultReceiver;
                return iMediaBrowserCompatCustomActionResultReceiver;
            }

            private static RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
                return RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
            }

            private static RemoteActionCompatParcelizer onCustomAction() {
                return MediaBrowserCompatSearchResultReceiver();
            }

            private static RemoteActionCompatParcelizer IconCompatParcelizer(read readVar) {
                return MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(readVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.BookReference
            /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
            public RemoteActionCompatParcelizer RatingCompat() {
                return IconCompatParcelizer(this);
            }

            public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<read, RemoteActionCompatParcelizer> implements setLessonReadTimeText {
                private int AudioAttributesCompatParcelizer;
                private write IconCompatParcelizer = write.INV;
                private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
                private int read;

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
                public final /* synthetic */ HomeLessonIndexV2 read() {
                    return MediaDescriptionCompat();
                }

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
                public final /* synthetic */ BookReference read() {
                    return MediaDescriptionCompat();
                }

                private RemoteActionCompatParcelizer() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver() {
                    return new RemoteActionCompatParcelizer();
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
                /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
                public RemoteActionCompatParcelizer clone() {
                    return MediaBrowserCompatItemReceiver().IconCompatParcelizer(AudioAttributesImplBaseParcelizer());
                }

                private static read MediaDescriptionCompat() {
                    return read.AudioAttributesCompatParcelizer();
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // o.BookReference.write
                /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
                public read write() {
                    read readVarAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                    if (readVarAudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                        return readVarAudioAttributesImplBaseParcelizer;
                    }
                    throw MediaBrowserCompatMediaItem();
                }

                /* JADX WARN: Multi-variable type inference failed */
                private read AudioAttributesImplBaseParcelizer() {
                    read readVar = new read((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                    int i = this.read;
                    int i2 = (i & 1) == 1 ? 1 : 0;
                    readVar.AudioAttributesImplApi21Parcelizer = this.IconCompatParcelizer;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    readVar.MediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    readVar.MediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer;
                    readVar.IconCompatParcelizer = i2;
                    return readVar;
                }

                @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public final RemoteActionCompatParcelizer IconCompatParcelizer(read readVar) {
                    if (readVar == read.AudioAttributesCompatParcelizer()) {
                        return this;
                    }
                    if (readVar.MediaBrowserCompatItemReceiver()) {
                        read(readVar.RemoteActionCompatParcelizer());
                    }
                    if (readVar.AudioAttributesImplBaseParcelizer()) {
                        AudioAttributesCompatParcelizer(readVar.IconCompatParcelizer());
                    }
                    if (readVar.MediaDescriptionCompat()) {
                        read(readVar.write());
                    }
                    AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(readVar.AudioAttributesImplBaseParcelizer));
                    return this;
                }

                @Override // kotlin.getSelectedAnswerIndex
                public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                    return !handleMediaPlayPauseIfPendingOnHandler() || RatingCompat().MediaBrowserCompatCustomActionResultReceiver();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // o.setNotesCount.write
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.RemoteActionCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                    /*
                        r1 = this;
                        o.getParentMcqId<o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$read> r0 = o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$read r2 = (o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                        if (r2 == 0) goto Ld
                        r1.IconCompatParcelizer(r2)
                    Ld:
                        return r1
                    Le:
                        r2 = move-exception
                        goto L1a
                    L10:
                        r2 = move-exception
                        o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                        o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$read r3 = (o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read) r3     // Catch: java.lang.Throwable -> Le
                        throw r2     // Catch: java.lang.Throwable -> L18
                    L18:
                        r2 = move-exception
                        goto L1b
                    L1a:
                        r3 = 0
                    L1b:
                        if (r3 == 0) goto L20
                        r1.IconCompatParcelizer(r3)
                    L20:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.RemoteActionCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$read$RemoteActionCompatParcelizer");
                }

                private RemoteActionCompatParcelizer read(write writeVar) {
                    this.read |= 1;
                    this.IconCompatParcelizer = writeVar;
                    return this;
                }

                private boolean handleMediaPlayPauseIfPendingOnHandler() {
                    return (this.read & 2) == 2;
                }

                private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RatingCompat() {
                    return this.RemoteActionCompatParcelizer;
                }

                private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    if ((this.read & 2) == 2 && this.RemoteActionCompatParcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                        this.RemoteActionCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                    } else {
                        this.RemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    }
                    this.read |= 2;
                    return this;
                }

                private RemoteActionCompatParcelizer read(int i) {
                    this.read |= 4;
                    this.AudioAttributesCompatParcelizer = i;
                    return this;
                }
            }
        }

        public final List<read> MediaBrowserCompatItemReceiver() {
            return this.read;
        }

        public final int IconCompatParcelizer() {
            return this.read.size();
        }

        private read IconCompatParcelizer(int i) {
            return this.read.get(i);
        }

        public final boolean onPlayFromUri() {
            return (this.AudioAttributesImplApi26Parcelizer & 1) == 1;
        }

        public final boolean onCommand() {
            return this.MediaMetadataCompat;
        }

        public final boolean onPrepareFromMediaId() {
            return (this.AudioAttributesImplApi26Parcelizer & 2) == 2;
        }

        public final int MediaMetadataCompat() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean onPrepare() {
            return (this.AudioAttributesImplApi26Parcelizer & 4) == 4;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaDescriptionCompat() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final boolean onPlayFromSearch() {
            return (this.AudioAttributesImplApi26Parcelizer & 8) == 8;
        }

        public final int MediaBrowserCompatSearchResultReceiver() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final boolean onMediaButtonEvent() {
            return (this.AudioAttributesImplApi26Parcelizer & 16) == 16;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean onPrepareFromUri() {
            return (this.AudioAttributesImplApi26Parcelizer & 32) == 32;
        }

        public final int onAddQueueItem() {
            return this.onAddQueueItem;
        }

        public final boolean onRemoveQueueItem() {
            return (this.AudioAttributesImplApi26Parcelizer & 64) == 64;
        }

        public final int onPause() {
            return this.onCustomAction;
        }

        public final boolean onSeekTo() {
            return (this.AudioAttributesImplApi26Parcelizer & 128) == 128;
        }

        public final int handleMediaPlayPauseIfPendingOnHandler() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final boolean onPrepareFromSearch() {
            return (this.AudioAttributesImplApi26Parcelizer & 256) == 256;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final boolean onRemoveQueueItemAt() {
            return (this.AudioAttributesImplApi26Parcelizer & 512) == 512;
        }

        public final int onCustomAction() {
            return this.RatingCompat;
        }

        public final boolean onPlayFromMediaId() {
            return (this.AudioAttributesImplApi26Parcelizer & 1024) == 1024;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write() {
            return this.write;
        }

        public final boolean onFastForward() {
            return (this.AudioAttributesImplApi26Parcelizer & 2048) == 2048;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean onPlay() {
            return (this.AudioAttributesImplApi26Parcelizer & 4096) == 4096;
        }

        public final int MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        private void onSetRepeatMode() {
            this.read = Collections.emptyList();
            this.MediaMetadataCompat = false;
            this.MediaBrowserCompatItemReceiver = 0;
            this.MediaBrowserCompatMediaItem = RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.AudioAttributesImplBaseParcelizer = 0;
            this.onAddQueueItem = 0;
            this.onCustomAction = 0;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
            this.handleMediaPlayPauseIfPendingOnHandler = RemoteActionCompatParcelizer();
            this.RatingCompat = 0;
            this.write = RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.MediaDescriptionCompat;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < IconCompatParcelizer(); i++) {
                if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.MediaDescriptionCompat = (byte) 0;
                    return false;
                }
            }
            if (onPrepare() && !MediaDescriptionCompat().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaDescriptionCompat = (byte) 0;
                return false;
            }
            if (onPrepareFromSearch() && !MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaDescriptionCompat = (byte) 0;
                return false;
            }
            if (onPlayFromMediaId() && !write().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaDescriptionCompat = (byte) 0;
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.MediaDescriptionCompat = (byte) 0;
                return false;
            }
            this.MediaDescriptionCompat = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.AudioAttributesImplApi26Parcelizer & 4096) == 4096) {
                setresumeexplanation.write(1, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            for (int i = 0; i < this.read.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(2, this.read.get(i));
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 1) == 1) {
                setresumeexplanation.write(this.MediaMetadataCompat);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 2) == 2) {
                setresumeexplanation.write(4, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 4) == 4) {
                setresumeexplanation.IconCompatParcelizer(5, this.MediaBrowserCompatMediaItem);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 16) == 16) {
                setresumeexplanation.write(6, this.AudioAttributesImplBaseParcelizer);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 32) == 32) {
                setresumeexplanation.write(7, this.onAddQueueItem);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 8) == 8) {
                setresumeexplanation.write(8, this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 64) == 64) {
                setresumeexplanation.write(9, this.onCustomAction);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 256) == 256) {
                setresumeexplanation.IconCompatParcelizer(10, this.handleMediaPlayPauseIfPendingOnHandler);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 512) == 512) {
                setresumeexplanation.write(11, this.RatingCompat);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 128) == 128) {
                setresumeexplanation.write(12, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 1024) == 1024) {
                setresumeexplanation.IconCompatParcelizer(13, this.write);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 2048) == 2048) {
                setresumeexplanation.write(14, this.AudioAttributesCompatParcelizer);
            }
            sessionImpl.read(200, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.onCommand);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.MediaBrowserCompatSearchResultReceiver;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.AudioAttributesImplApi26Parcelizer & 4096) == 4096 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.MediaBrowserCompatCustomActionResultReceiver) : 0;
            for (int i2 = 0; i2 < this.read.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(2, this.read.get(i2));
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 1) == 1) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer();
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 2) == 2) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(4, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(5, this.MediaBrowserCompatMediaItem);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(6, this.AudioAttributesImplBaseParcelizer);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 32) == 32) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(7, this.onAddQueueItem);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(8, this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 64) == 64) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(9, this.onCustomAction);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 256) == 256) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(10, this.handleMediaPlayPauseIfPendingOnHandler);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 512) == 512) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(11, this.RatingCompat);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 128) == 128) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(12, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 1024) == 1024) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(13, this.write);
            }
            if ((this.AudioAttributesImplApi26Parcelizer & 2048) == 2048) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(14, this.AudioAttributesCompatParcelizer);
            }
            int iOnSkipToPrevious = iAudioAttributesCompatParcelizer + onSkipToPrevious() + this.onCommand.MediaBrowserCompatCustomActionResultReceiver();
            this.MediaBrowserCompatSearchResultReceiver = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        private static write onSetPlaybackSpeed() {
            return write.MediaDescriptionCompat();
        }

        private static write onSetRating() {
            return onSetPlaybackSpeed();
        }

        public static write IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return onSetPlaybackSpeed().IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onRewind, reason: merged with bridge method [inline-methods] */
        public final write RatingCompat() {
            return IconCompatParcelizer(this);
        }

        public static final class write extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, write> implements setMCQCount {
            private int AudioAttributesImplApi21Parcelizer;
            private boolean AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatMediaItem;
            private int MediaBrowserCompatSearchResultReceiver;
            private int MediaDescriptionCompat;
            private int MediaMetadataCompat;
            private int RemoteActionCompatParcelizer;
            private int read;
            private List<read> write = Collections.emptyList();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatItemReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCustomAction();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCustomAction();
            }

            private write() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static write MediaDescriptionCompat() {
                return new write();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
            public write clone() {
                return MediaDescriptionCompat().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onCustomAction() {
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            }

            @Override // o.BookReference.write
            /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
            public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write() {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi26Parcelizer() {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.RemoteActionCompatParcelizer;
                if ((i & 1) == 1) {
                    this.write = Collections.unmodifiableList(this.write);
                    this.RemoteActionCompatParcelizer &= -2;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read = this.write;
                int i2 = (i & 2) == 2 ? 1 : 0;
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaMetadataCompat = this.AudioAttributesImplApi26Parcelizer;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatMediaItem = this.MediaBrowserCompatItemReceiver;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi21Parcelizer;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer = this.read;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onAddQueueItem = this.MediaMetadataCompat;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCustomAction = this.MediaBrowserCompatSearchResultReceiver;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaDescriptionCompat;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.handleMediaPlayPauseIfPendingOnHandler = this.RatingCompat;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RatingCompat = this.MediaBrowserCompatMediaItem;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write = this.AudioAttributesCompatParcelizer;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer = this.IconCompatParcelizer;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatCustomActionResultReceiver;
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi26Parcelizer = i2;
                return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            public final write IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read.isEmpty()) {
                    if (this.write.isEmpty()) {
                        this.write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read;
                        this.RemoteActionCompatParcelizer &= -2;
                    } else {
                        RatingCompat();
                        this.write.addAll(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read);
                    }
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromUri()) {
                    AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCommand());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepareFromMediaId()) {
                    write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaMetadataCompat());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepare()) {
                    write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaDescriptionCompat());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromSearch()) {
                    AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatSearchResultReceiver());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onMediaButtonEvent()) {
                    IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepareFromUri()) {
                    MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onAddQueueItem());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onRemoveQueueItem()) {
                    AudioAttributesImplBaseParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPause());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onSeekTo()) {
                    MediaBrowserCompatItemReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.handleMediaPlayPauseIfPendingOnHandler());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepareFromSearch()) {
                    RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onRemoveQueueItemAt()) {
                    AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCustomAction());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromMediaId()) {
                    AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onFastForward()) {
                    RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer());
                }
                if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlay()) {
                    read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatMediaItem());
                }
                write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCommand));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < handleMediaPlayPauseIfPendingOnHandler(); i++) {
                    if (!AudioAttributesCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                if (onFastForward() && !onAddQueueItem().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                if (!onPause() || onMediaButtonEvent().MediaBrowserCompatCustomActionResultReceiver()) {
                    return (!onPlay() || MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatSearchResultReceiver();
                }
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> r0 = o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r2 = (o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r3 = (o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$write");
            }

            private void RatingCompat() {
                if ((this.RemoteActionCompatParcelizer & 1) != 1) {
                    this.write = new ArrayList(this.write);
                    this.RemoteActionCompatParcelizer |= 1;
                }
            }

            private int handleMediaPlayPauseIfPendingOnHandler() {
                return this.write.size();
            }

            private read AudioAttributesCompatParcelizer(int i) {
                return this.write.get(i);
            }

            public final write AudioAttributesCompatParcelizer(boolean z) {
                this.RemoteActionCompatParcelizer |= 2;
                this.AudioAttributesImplApi26Parcelizer = z;
                return this;
            }

            private write write(int i) {
                this.RemoteActionCompatParcelizer |= 4;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }

            private boolean onFastForward() {
                return (this.RemoteActionCompatParcelizer & 8) == 8;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onAddQueueItem() {
                return this.MediaBrowserCompatItemReceiver;
            }

            private write write(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.RemoteActionCompatParcelizer & 8) == 8 && this.MediaBrowserCompatItemReceiver != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.MediaBrowserCompatItemReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.MediaBrowserCompatItemReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.RemoteActionCompatParcelizer |= 8;
                return this;
            }

            private write AudioAttributesImplApi26Parcelizer(int i) {
                this.RemoteActionCompatParcelizer |= 16;
                this.AudioAttributesImplApi21Parcelizer = i;
                return this;
            }

            private write IconCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer |= 32;
                this.read = i;
                return this;
            }

            private write MediaBrowserCompatCustomActionResultReceiver(int i) {
                this.RemoteActionCompatParcelizer |= 64;
                this.MediaMetadataCompat = i;
                return this;
            }

            private write AudioAttributesImplBaseParcelizer(int i) {
                this.RemoteActionCompatParcelizer |= 128;
                this.MediaBrowserCompatSearchResultReceiver = i;
                return this;
            }

            private write MediaBrowserCompatItemReceiver(int i) {
                this.RemoteActionCompatParcelizer |= 256;
                this.MediaDescriptionCompat = i;
                return this;
            }

            private boolean onPause() {
                return (this.RemoteActionCompatParcelizer & 512) == 512;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onMediaButtonEvent() {
                return this.RatingCompat;
            }

            private write RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.RemoteActionCompatParcelizer & 512) == 512 && this.RatingCompat != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.RatingCompat).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.RatingCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.RemoteActionCompatParcelizer |= 512;
                return this;
            }

            private write AudioAttributesImplApi21Parcelizer(int i) {
                this.RemoteActionCompatParcelizer |= 1024;
                this.MediaBrowserCompatMediaItem = i;
                return this;
            }

            private boolean onPlay() {
                return (this.RemoteActionCompatParcelizer & 2048) == 2048;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return this.AudioAttributesCompatParcelizer;
            }

            private write AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.RemoteActionCompatParcelizer & 2048) == 2048 && this.AudioAttributesCompatParcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.AudioAttributesCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.AudioAttributesCompatParcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.AudioAttributesCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.RemoteActionCompatParcelizer |= 2048;
                return this;
            }

            private write RemoteActionCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer |= 4096;
                this.IconCompatParcelizer = i;
                return this;
            }

            private write read(int i) {
                this.RemoteActionCompatParcelizer |= 8192;
                this.MediaBrowserCompatCustomActionResultReceiver = i;
                return this;
            }
        }
    }

    public static final class onCustomAction extends HomeLessonIndexV2.read<onCustomAction> implements setOptional {
        private static final onCustomAction IconCompatParcelizer;
        public static getParentMcqId<onCustomAction> read = new setReadTime<onCustomAction>() { // from class: o.setActiveRecallQbankId.onCustomAction.2
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return IconCompatParcelizer(setslidescount, setsteptype);
            }

            private static onCustomAction IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new onCustomAction(setslidescount, setsteptype, (byte) 0);
            }
        };
        private int AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private final setVideoAspectRatio MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> MediaBrowserCompatMediaItem;
        private AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver;
        private List<Integer> MediaDescriptionCompat;
        private byte RemoteActionCompatParcelizer;
        private int write;

        /* synthetic */ onCustomAction(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ onCustomAction(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onPlay();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return handleMediaPlayPauseIfPendingOnHandler();
        }

        private onCustomAction(HomeLessonIndexV2.AudioAttributesCompatParcelizer<onCustomAction, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.RemoteActionCompatParcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private onCustomAction() {
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.RemoteActionCompatParcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = setVideoAspectRatio.write;
        }

        public static onCustomAction AudioAttributesCompatParcelizer() {
            return IconCompatParcelizer;
        }

        private static onCustomAction handleMediaPlayPauseIfPendingOnHandler() {
            return IconCompatParcelizer;
        }

        private onCustomAction(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.RemoteActionCompatParcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            onCustomAction();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                this.AudioAttributesCompatParcelizer |= 1;
                                this.write = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 16) {
                                this.AudioAttributesCompatParcelizer |= 2;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 24) {
                                this.AudioAttributesCompatParcelizer |= 4;
                                this.AudioAttributesImplApi21Parcelizer = setslidescount.read();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 32) {
                                int iWrite = setslidescount.write();
                                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(iWrite);
                                if (audioAttributesCompatParcelizerIconCompatParcelizer == null) {
                                    setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                    setresumeexplanation.MediaMetadataCompat(iWrite);
                                } else {
                                    this.AudioAttributesCompatParcelizer |= 8;
                                    this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizerIconCompatParcelizer;
                                }
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 42) {
                                if ((i & 16) != 16) {
                                    this.MediaBrowserCompatMediaItem = new ArrayList();
                                    i |= 16;
                                }
                                this.MediaBrowserCompatMediaItem.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 48) {
                                if ((i & 32) != 32) {
                                    this.MediaDescriptionCompat = new ArrayList();
                                    i |= 32;
                                }
                                this.MediaDescriptionCompat.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 50) {
                                int iRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 32) != 32 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.MediaDescriptionCompat = new ArrayList();
                                    i |= 32;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.MediaDescriptionCompat.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(this.MediaBrowserCompatMediaItem);
                    }
                    if ((i & 32) == 32) {
                        this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if ((i & 16) == 16) {
                this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(this.MediaBrowserCompatMediaItem);
            }
            if ((i & 32) == 32) {
                this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            onCustomAction oncustomaction = new onCustomAction();
            IconCompatParcelizer = oncustomaction;
            oncustomaction.onCustomAction();
        }

        public enum AudioAttributesCompatParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            IN(0),
            OUT(1),
            INV(2);

            private final int read;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer>() { // from class: o.setActiveRecallQbankId.onCustomAction.AudioAttributesCompatParcelizer.2
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return IconCompatParcelizer(i);
                    }

                    private static AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.read;
            }

            public static AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            AudioAttributesCompatParcelizer(int i) {
                this.read = i;
            }
        }

        public final boolean MediaDescriptionCompat() {
            return (this.AudioAttributesCompatParcelizer & 1) == 1;
        }

        public final int write() {
            return this.write;
        }

        public final boolean MediaBrowserCompatMediaItem() {
            return (this.AudioAttributesCompatParcelizer & 2) == 2;
        }

        public final int IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean MediaMetadataCompat() {
            return (this.AudioAttributesCompatParcelizer & 4) == 4;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return (this.AudioAttributesCompatParcelizer & 8) == 8;
        }

        public final AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> MediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatMediaItem;
        }

        private int onAddQueueItem() {
            return this.MediaBrowserCompatMediaItem.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(int i) {
            return this.MediaBrowserCompatMediaItem.get(i);
        }

        public final List<Integer> AudioAttributesImplBaseParcelizer() {
            return this.MediaDescriptionCompat;
        }

        private void onCustomAction() {
            this.write = 0;
            this.MediaBrowserCompatItemReceiver = 0;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.MediaBrowserCompatSearchResultReceiver = AudioAttributesCompatParcelizer.INV;
            this.MediaBrowserCompatMediaItem = Collections.emptyList();
            this.MediaDescriptionCompat = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.RemoteActionCompatParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!MediaDescriptionCompat()) {
                this.RemoteActionCompatParcelizer = (byte) 0;
                return false;
            }
            if (!MediaBrowserCompatMediaItem()) {
                this.RemoteActionCompatParcelizer = (byte) 0;
                return false;
            }
            for (int i = 0; i < onAddQueueItem(); i++) {
                if (!RemoteActionCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.RemoteActionCompatParcelizer = (byte) 0;
                    return false;
                }
            }
            if (!onSkipToQueueItem()) {
                this.RemoteActionCompatParcelizer = (byte) 0;
                return false;
            }
            this.RemoteActionCompatParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.AudioAttributesCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.write);
            }
            if ((this.AudioAttributesCompatParcelizer & 2) == 2) {
                setresumeexplanation.write(2, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.AudioAttributesCompatParcelizer & 4) == 4) {
                setresumeexplanation.write(this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.AudioAttributesCompatParcelizer & 8) == 8) {
                setresumeexplanation.RemoteActionCompatParcelizer(4, this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer());
            }
            for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(5, this.MediaBrowserCompatMediaItem.get(i));
            }
            if (AudioAttributesImplBaseParcelizer().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(50);
                setresumeexplanation.MediaMetadataCompat(this.AudioAttributesImplApi26Parcelizer);
            }
            for (int i2 = 0; i2 < this.MediaDescriptionCompat.size(); i2++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.MediaDescriptionCompat.get(i2).intValue());
            }
            sessionImpl.read(1000, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.AudioAttributesCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.write) : 0;
            if ((this.AudioAttributesCompatParcelizer & 2) == 2) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.AudioAttributesCompatParcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer();
            }
            if ((this.AudioAttributesCompatParcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.IconCompatParcelizer(4, this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer());
            }
            for (int i2 = 0; i2 < this.MediaBrowserCompatMediaItem.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(5, this.MediaBrowserCompatMediaItem.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.MediaDescriptionCompat.size(); i4++) {
                i3 += setResumeExplanation.read(this.MediaDescriptionCompat.get(i4).intValue());
            }
            int i5 = iAudioAttributesCompatParcelizer + i3;
            if (!AudioAttributesImplBaseParcelizer().isEmpty()) {
                i5 = i5 + 1 + setResumeExplanation.read(i3);
            }
            this.AudioAttributesImplApi26Parcelizer = i3;
            int iOnSkipToPrevious = i5 + onSkipToPrevious() + this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        private static read onCommand() {
            return read.AudioAttributesImplApi26Parcelizer();
        }

        private static read onPlay() {
            return onCommand();
        }

        private static read IconCompatParcelizer(onCustomAction oncustomaction) {
            return onCommand().IconCompatParcelizer(oncustomaction);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onPlayFromMediaId, reason: merged with bridge method [inline-methods] */
        public read RatingCompat() {
            return IconCompatParcelizer(this);
        }

        public static final class read extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<onCustomAction, read> implements setOptional {
            private int AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private boolean RemoteActionCompatParcelizer;
            private int write;
            private AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer = AudioAttributesCompatParcelizer.INV;
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesImplApi26Parcelizer = Collections.emptyList();
            private List<Integer> read = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return handleMediaPlayPauseIfPendingOnHandler();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return handleMediaPlayPauseIfPendingOnHandler();
            }

            private read() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static read AudioAttributesImplApi26Parcelizer() {
                return new read();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
            public read clone() {
                return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            }

            private static onCustomAction handleMediaPlayPauseIfPendingOnHandler() {
                return onCustomAction.AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public onCustomAction write() {
                onCustomAction oncustomactionMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                if (oncustomactionMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
                    return oncustomactionMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private onCustomAction MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                onCustomAction oncustomaction = new onCustomAction((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.IconCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                oncustomaction.write = this.write;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                oncustomaction.MediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                oncustomaction.AudioAttributesImplApi21Parcelizer = this.RemoteActionCompatParcelizer;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                oncustomaction.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplApi21Parcelizer;
                if ((this.IconCompatParcelizer & 16) == 16) {
                    this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer &= -17;
                }
                oncustomaction.MediaBrowserCompatMediaItem = this.AudioAttributesImplApi26Parcelizer;
                if ((this.IconCompatParcelizer & 32) == 32) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.IconCompatParcelizer &= -33;
                }
                oncustomaction.MediaDescriptionCompat = this.read;
                oncustomaction.AudioAttributesCompatParcelizer = i2;
                return oncustomaction;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final read IconCompatParcelizer(onCustomAction oncustomaction) {
                if (oncustomaction == onCustomAction.AudioAttributesCompatParcelizer()) {
                    return this;
                }
                if (oncustomaction.MediaDescriptionCompat()) {
                    AudioAttributesCompatParcelizer(oncustomaction.write());
                }
                if (oncustomaction.MediaBrowserCompatMediaItem()) {
                    RemoteActionCompatParcelizer(oncustomaction.IconCompatParcelizer());
                }
                if (oncustomaction.MediaMetadataCompat()) {
                    read(oncustomaction.RemoteActionCompatParcelizer());
                }
                if (oncustomaction.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    AudioAttributesCompatParcelizer(oncustomaction.MediaBrowserCompatSearchResultReceiver());
                }
                if (!oncustomaction.MediaBrowserCompatMediaItem.isEmpty()) {
                    if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                        this.AudioAttributesImplApi26Parcelizer = oncustomaction.MediaBrowserCompatMediaItem;
                        this.IconCompatParcelizer &= -17;
                    } else {
                        RatingCompat();
                        this.AudioAttributesImplApi26Parcelizer.addAll(oncustomaction.MediaBrowserCompatMediaItem);
                    }
                }
                if (!oncustomaction.MediaDescriptionCompat.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = oncustomaction.MediaDescriptionCompat;
                        this.IconCompatParcelizer &= -33;
                    } else {
                        AudioAttributesImplBaseParcelizer();
                        this.read.addAll(oncustomaction.MediaDescriptionCompat);
                    }
                }
                write(oncustomaction);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(oncustomaction.MediaBrowserCompatCustomActionResultReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onAddQueueItem() || !onPlayFromMediaId()) {
                    return false;
                }
                for (int i = 0; i < onCommand(); i++) {
                    if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.onCustomAction.read read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$onCustomAction> r0 = o.setActiveRecallQbankId.onCustomAction.read     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$onCustomAction r2 = (o.setActiveRecallQbankId.onCustomAction) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$onCustomAction r3 = (o.setActiveRecallQbankId.onCustomAction) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.onCustomAction.read.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$onCustomAction$read");
            }

            private boolean onAddQueueItem() {
                return (this.IconCompatParcelizer & 1) == 1;
            }

            private read AudioAttributesCompatParcelizer(int i) {
                this.IconCompatParcelizer |= 1;
                this.write = i;
                return this;
            }

            private boolean onPlayFromMediaId() {
                return (this.IconCompatParcelizer & 2) == 2;
            }

            private read RemoteActionCompatParcelizer(int i) {
                this.IconCompatParcelizer |= 2;
                this.AudioAttributesCompatParcelizer = i;
                return this;
            }

            private read read(boolean z) {
                this.IconCompatParcelizer |= 4;
                this.RemoteActionCompatParcelizer = z;
                return this;
            }

            private read AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                this.IconCompatParcelizer |= 8;
                this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer;
                return this;
            }

            private void RatingCompat() {
                if ((this.IconCompatParcelizer & 16) != 16) {
                    this.AudioAttributesImplApi26Parcelizer = new ArrayList(this.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer |= 16;
                }
            }

            private int onCommand() {
                return this.AudioAttributesImplApi26Parcelizer.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(int i) {
                return this.AudioAttributesImplApi26Parcelizer.get(i);
            }

            private void AudioAttributesImplBaseParcelizer() {
                if ((this.IconCompatParcelizer & 32) != 32) {
                    this.read = new ArrayList(this.read);
                    this.IconCompatParcelizer |= 32;
                }
            }
        }
    }

    public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2.read<RemoteActionCompatParcelizer> implements isIsServerContentUpdated {
        public static getParentMcqId<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new setReadTime<RemoteActionCompatParcelizer>() { // from class: o.setActiveRecallQbankId.RemoteActionCompatParcelizer.3
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return IconCompatParcelizer(setslidescount, setsteptype);
            }

            private static RemoteActionCompatParcelizer IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new RemoteActionCompatParcelizer(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final RemoteActionCompatParcelizer write;
        private List<Integer> AudioAttributesImplApi21Parcelizer;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesImplApi26Parcelizer;
        private List<AudioAttributesImplApi21Parcelizer> AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private List<AudioAttributesImplApi26Parcelizer> MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private int RatingCompat;
        private int RemoteActionCompatParcelizer;
        private List<Integer> handleMediaPlayPauseIfPendingOnHandler;
        private byte onAddQueueItem;
        private int onCommand;
        private int onCustomAction;
        private int onFastForward;
        private List<Integer> onMediaButtonEvent;
        private List<Integer> onPause;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> onPlay;
        private List<MediaBrowserCompatMediaItem> onPlayFromMediaId;
        private int onPlayFromSearch;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> onPlayFromUri;
        private List<Integer> onPrepare;
        private int onPrepareFromMediaId;
        private List<Integer> onPrepareFromSearch;
        private final setVideoAspectRatio onPrepareFromUri;
        private List<onCustomAction> onRemoveQueueItem;
        private onAddQueueItem onRemoveQueueItemAt;
        private List<onCommand> onRewind;
        private onPlay onSeekTo;
        private List<Integer> onSetRepeatMode;
        private List<write> read;

        /* synthetic */ RemoteActionCompatParcelizer(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return PlaybackStateCompat();
        }

        private RemoteActionCompatParcelizer(HomeLessonIndexV2.AudioAttributesCompatParcelizer<RemoteActionCompatParcelizer, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.onPrepareFromMediaId = -1;
            this.onFastForward = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.onPlayFromSearch = -1;
            this.onCommand = -1;
            this.onCustomAction = -1;
            this.onAddQueueItem = (byte) -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            this.onPrepareFromUri = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private RemoteActionCompatParcelizer() {
            this.onPrepareFromMediaId = -1;
            this.onFastForward = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.onPlayFromSearch = -1;
            this.onCommand = -1;
            this.onCustomAction = -1;
            this.onAddQueueItem = (byte) -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            this.onPrepareFromUri = setVideoAspectRatio.write;
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return write;
        }

        private static RemoteActionCompatParcelizer PlaybackStateCompat() {
            return write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v51, types: [o.setActiveRecallQbankId$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$write] */
        /* JADX WARN: Type inference failed for: r11v82, types: [o.setActiveRecallQbankId$onAddQueueItem$write] */
        /* JADX WARN: Type inference failed for: r15v23, types: [o.setActiveRecallQbankId$onPlay$IconCompatParcelizer] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
        private RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            boolean z;
            this.onPrepareFromMediaId = -1;
            this.onFastForward = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.onPlayFromSearch = -1;
            this.onCommand = -1;
            this.onCustomAction = -1;
            this.onAddQueueItem = (byte) -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            MediaSessionCompatQueueItem();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z2 = false;
            int i = 0;
            while (true) {
                ?? Write = 4194304;
                if (z2) {
                    if ((i & 32) == 32) {
                        this.onPrepare = Collections.unmodifiableList(this.onPrepare);
                    }
                    if ((i & 8) == 8) {
                        this.onRemoveQueueItem = Collections.unmodifiableList(this.onRemoveQueueItem);
                    }
                    if ((i & 16) == 16) {
                        this.onPlayFromUri = Collections.unmodifiableList(this.onPlayFromUri);
                    }
                    if ((i & 64) == 64) {
                        this.onPause = Collections.unmodifiableList(this.onPause);
                    }
                    if ((i & 512) == 512) {
                        this.read = Collections.unmodifiableList(this.read);
                    }
                    if ((i & 1024) == 1024) {
                        this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
                    }
                    if ((i & 2048) == 2048) {
                        this.onPlayFromMediaId = Collections.unmodifiableList(this.onPlayFromMediaId);
                    }
                    if ((i & 4096) == 4096) {
                        this.onRewind = Collections.unmodifiableList(this.onRewind);
                    }
                    if ((i & 8192) == 8192) {
                        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
                    }
                    if ((i & 16384) == 16384) {
                        this.onPrepareFromSearch = Collections.unmodifiableList(this.onPrepareFromSearch);
                    }
                    if ((i & 128) == 128) {
                        this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi26Parcelizer);
                    }
                    if ((i & 256) == 256) {
                        this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi21Parcelizer);
                    }
                    if ((i & 262144) == 262144) {
                        this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                    }
                    if ((i & 524288) == 524288) {
                        this.onPlay = Collections.unmodifiableList(this.onPlay);
                    }
                    if ((i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                        this.onMediaButtonEvent = Collections.unmodifiableList(this.onMediaButtonEvent);
                    }
                    if ((i & 4194304) == 4194304) {
                        this.onSetRepeatMode = Collections.unmodifiableList(this.onSetRepeatMode);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.onPrepareFromUri = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th;
                    }
                    this.onPrepareFromUri = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    return;
                }
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        switch (iHandleMediaPlayPauseIfPendingOnHandler) {
                            case 0:
                                z = true;
                                z2 = z;
                                break;
                            case 8:
                                z = true;
                                this.IconCompatParcelizer |= 1;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 16:
                                if ((i & 32) != 32) {
                                    this.onPrepare = new ArrayList();
                                    i |= 32;
                                }
                                this.onPrepare.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case 18:
                                int iRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 32) != 32 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPrepare = new ArrayList();
                                    i |= 32;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPrepare.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                                z = true;
                                break;
                            case 24:
                                this.IconCompatParcelizer |= 2;
                                this.RatingCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                z = true;
                                break;
                            case 32:
                                this.IconCompatParcelizer |= 4;
                                this.RemoteActionCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                z = true;
                                break;
                            case 42:
                                if ((i & 8) != 8) {
                                    this.onRemoveQueueItem = new ArrayList();
                                    i |= 8;
                                }
                                this.onRemoveQueueItem.add((onCustomAction) setslidescount.RemoteActionCompatParcelizer(onCustomAction.read, setsteptype));
                                z = true;
                                break;
                            case 50:
                                if ((i & 16) != 16) {
                                    this.onPlayFromUri = new ArrayList();
                                    i |= 16;
                                }
                                this.onPlayFromUri.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.onPause = new ArrayList();
                                    i |= 64;
                                }
                                this.onPause.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case 58:
                                int iRemoteActionCompatParcelizer2 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 64) != 64 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPause = new ArrayList();
                                    i |= 64;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPause.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2);
                                z = true;
                                break;
                            case 66:
                                if ((i & 512) != 512) {
                                    this.read = new ArrayList();
                                    i |= 512;
                                }
                                this.read.add((write) setslidescount.RemoteActionCompatParcelizer(write.write, setsteptype));
                                z = true;
                                break;
                            case 74:
                                if ((i & 1024) != 1024) {
                                    this.MediaDescriptionCompat = new ArrayList();
                                    i |= 1024;
                                }
                                this.MediaDescriptionCompat.add((AudioAttributesImplApi26Parcelizer) setslidescount.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case 82:
                                if ((i & 2048) != 2048) {
                                    this.onPlayFromMediaId = new ArrayList();
                                    i |= 2048;
                                }
                                this.onPlayFromMediaId.add((MediaBrowserCompatMediaItem) setslidescount.RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem.IconCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case 90:
                                if ((i & 4096) != 4096) {
                                    this.onRewind = new ArrayList();
                                    i |= 4096;
                                }
                                this.onRewind.add((onCommand) setslidescount.RemoteActionCompatParcelizer(onCommand.RemoteActionCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case 106:
                                if ((i & 8192) != 8192) {
                                    this.AudioAttributesImplBaseParcelizer = new ArrayList();
                                    i |= 8192;
                                }
                                this.AudioAttributesImplBaseParcelizer.add((AudioAttributesImplApi21Parcelizer) setslidescount.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case 128:
                                if ((i & 16384) != 16384) {
                                    this.onPrepareFromSearch = new ArrayList();
                                    i |= 16384;
                                }
                                this.onPrepareFromSearch.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                                int iRemoteActionCompatParcelizer3 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 16384) != 16384 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPrepareFromSearch = new ArrayList();
                                    i |= 16384;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPrepareFromSearch.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer3);
                                z = true;
                                break;
                            case 136:
                                this.IconCompatParcelizer |= 8;
                                this.MediaBrowserCompatSearchResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                z = true;
                                break;
                            case 146:
                                ?? RatingCompat = (this.IconCompatParcelizer & 16) == 16 ? this.MediaBrowserCompatMediaItem.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.MediaBrowserCompatMediaItem = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                if (RatingCompat != 0) {
                                    RatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                    this.MediaBrowserCompatMediaItem = RatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.IconCompatParcelizer |= 16;
                                z = true;
                                break;
                            case 152:
                                this.IconCompatParcelizer |= 32;
                                this.MediaMetadataCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                z = true;
                                break;
                            case 162:
                                if ((i & 128) != 128) {
                                    this.AudioAttributesImplApi26Parcelizer = new ArrayList();
                                    i |= 128;
                                }
                                this.AudioAttributesImplApi26Parcelizer.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case 168:
                                if ((i & 256) != 256) {
                                    this.AudioAttributesImplApi21Parcelizer = new ArrayList();
                                    i |= 256;
                                }
                                this.AudioAttributesImplApi21Parcelizer.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case 170:
                                int iRemoteActionCompatParcelizer4 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 256) != 256 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.AudioAttributesImplApi21Parcelizer = new ArrayList();
                                    i |= 256;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.AudioAttributesImplApi21Parcelizer.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer4);
                                z = true;
                                break;
                            case 176:
                                if ((i & 262144) != 262144) {
                                    this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
                                    i |= 262144;
                                }
                                this.handleMediaPlayPauseIfPendingOnHandler.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case 178:
                                int iRemoteActionCompatParcelizer5 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 262144) != 262144 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
                                    i |= 262144;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.handleMediaPlayPauseIfPendingOnHandler.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer5);
                                z = true;
                                break;
                            case 186:
                                if ((i & 524288) != 524288) {
                                    this.onPlay = new ArrayList();
                                    i |= 524288;
                                }
                                this.onPlay.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                                z = true;
                                break;
                            case PsExtractor.AUDIO_STREAM /* 192 */:
                                if ((i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                                    this.onMediaButtonEvent = new ArrayList();
                                    i |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                this.onMediaButtonEvent.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case 194:
                                int iRemoteActionCompatParcelizer6 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onMediaButtonEvent = new ArrayList();
                                    i |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onMediaButtonEvent.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer6);
                                z = true;
                                break;
                            case 242:
                                ?? RatingCompat2 = (this.IconCompatParcelizer & 64) == 64 ? this.onRemoveQueueItemAt.RatingCompat() : null;
                                onAddQueueItem onaddqueueitem = (onAddQueueItem) setslidescount.RemoteActionCompatParcelizer(onAddQueueItem.read, setsteptype);
                                this.onRemoveQueueItemAt = onaddqueueitem;
                                if (RatingCompat2 != 0) {
                                    RatingCompat2.IconCompatParcelizer(onaddqueueitem);
                                    this.onRemoveQueueItemAt = RatingCompat2.AudioAttributesImplBaseParcelizer();
                                }
                                this.IconCompatParcelizer |= 64;
                                z = true;
                                break;
                            case 248:
                                if ((i & 4194304) != 4194304) {
                                    this.onSetRepeatMode = new ArrayList();
                                    i |= 4194304;
                                }
                                this.onSetRepeatMode.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                z = true;
                                break;
                            case 250:
                                int iRemoteActionCompatParcelizer7 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 4194304) != 4194304 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onSetRepeatMode = new ArrayList();
                                    i |= 4194304;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onSetRepeatMode.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer7);
                                z = true;
                                break;
                            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                                ?? RatingCompat3 = (this.IconCompatParcelizer & 128) == 128 ? this.onSeekTo.RatingCompat() : null;
                                onPlay onplay = (onPlay) setslidescount.RemoteActionCompatParcelizer(onPlay.RemoteActionCompatParcelizer, setsteptype);
                                this.onSeekTo = onplay;
                                if (RatingCompat3 != 0) {
                                    RatingCompat3.IconCompatParcelizer(onplay);
                                    this.onSeekTo = RatingCompat3.AudioAttributesImplApi26Parcelizer();
                                }
                                this.IconCompatParcelizer |= 128;
                                z = true;
                                break;
                            default:
                                z = true;
                                Write = write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler);
                                if (Write == 0) {
                                    z2 = z;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        if ((i & 32) == 32) {
                            this.onPrepare = Collections.unmodifiableList(this.onPrepare);
                        }
                        if ((i & 8) == 8) {
                            this.onRemoveQueueItem = Collections.unmodifiableList(this.onRemoveQueueItem);
                        }
                        if ((i & 16) == 16) {
                            this.onPlayFromUri = Collections.unmodifiableList(this.onPlayFromUri);
                        }
                        if ((i & 64) == 64) {
                            this.onPause = Collections.unmodifiableList(this.onPause);
                        }
                        if ((i & 512) == 512) {
                            this.read = Collections.unmodifiableList(this.read);
                        }
                        if ((i & 1024) == 1024) {
                            this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
                        }
                        if ((i & 2048) == 2048) {
                            this.onPlayFromMediaId = Collections.unmodifiableList(this.onPlayFromMediaId);
                        }
                        if ((i & 4096) == 4096) {
                            this.onRewind = Collections.unmodifiableList(this.onRewind);
                        }
                        if ((i & 8192) == 8192) {
                            this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
                        }
                        if ((i & 16384) == 16384) {
                            this.onPrepareFromSearch = Collections.unmodifiableList(this.onPrepareFromSearch);
                        }
                        if ((i & 128) == 128) {
                            this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi26Parcelizer);
                        }
                        if ((i & 256) == 256) {
                            this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi21Parcelizer);
                        }
                        if ((i & 262144) == 262144) {
                            this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                        }
                        if ((i & 524288) == 524288) {
                            this.onPlay = Collections.unmodifiableList(this.onPlay);
                        }
                        if ((i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                            this.onMediaButtonEvent = Collections.unmodifiableList(this.onMediaButtonEvent);
                        }
                        if ((i & Write) == Write) {
                            this.onSetRepeatMode = Collections.unmodifiableList(this.onSetRepeatMode);
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.onPrepareFromUri = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th3;
                        }
                        this.onPrepareFromUri = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th2;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
        }

        static {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
            write = remoteActionCompatParcelizer;
            remoteActionCompatParcelizer.MediaSessionCompatQueueItem();
        }

        public enum write implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);

            private final int AudioAttributesImplBaseParcelizer;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<write>() { // from class: o.setActiveRecallQbankId.RemoteActionCompatParcelizer.write.2
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer(i);
                    }

                    private static write AudioAttributesCompatParcelizer(int i) {
                        return write.IconCompatParcelizer(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.AudioAttributesImplBaseParcelizer;
            }

            public static write IconCompatParcelizer(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            write(int i) {
                this.AudioAttributesImplBaseParcelizer = i;
            }
        }

        public final boolean onRewind() {
            return (this.IconCompatParcelizer & 1) == 1;
        }

        public final int MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean onRemoveQueueItem() {
            return (this.IconCompatParcelizer & 2) == 2;
        }

        public final int MediaMetadataCompat() {
            return this.RatingCompat;
        }

        public final boolean onRemoveQueueItemAt() {
            return (this.IconCompatParcelizer & 4) == 4;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final List<onCustomAction> onPrepareFromSearch() {
            return this.onRemoveQueueItem;
        }

        private int _init_lambda2() {
            return this.onRemoveQueueItem.size();
        }

        private onCustomAction AudioAttributesImplBaseParcelizer(int i) {
            return this.onRemoveQueueItem.get(i);
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> onPrepareFromMediaId() {
            return this.onPlayFromUri;
        }

        private int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
            return this.onPlayFromUri.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatItemReceiver(int i) {
            return this.onPlayFromUri.get(i);
        }

        public final List<Integer> onPrepare() {
            return this.onPrepare;
        }

        public final List<Integer> onFastForward() {
            return this.onPause;
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        private int MediaSessionCompatToken() {
            return this.AudioAttributesImplApi26Parcelizer.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer(int i) {
            return this.AudioAttributesImplApi26Parcelizer.get(i);
        }

        public final List<Integer> write() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final List<write> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        private int MediaSessionCompatResultReceiverWrapper() {
            return this.read.size();
        }

        private write RemoteActionCompatParcelizer(int i) {
            return this.read.get(i);
        }

        public final List<AudioAttributesImplApi26Parcelizer> MediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        private int PlaybackStateCompatCustomAction() {
            return this.MediaDescriptionCompat.size();
        }

        private AudioAttributesImplApi26Parcelizer read(int i) {
            return this.MediaDescriptionCompat.get(i);
        }

        public final List<MediaBrowserCompatMediaItem> onPause() {
            return this.onPlayFromMediaId;
        }

        private int ResultReceiver() {
            return this.onPlayFromMediaId.size();
        }

        private MediaBrowserCompatMediaItem AudioAttributesImplApi26Parcelizer(int i) {
            return this.onPlayFromMediaId.get(i);
        }

        public final List<onCommand> onPlayFromUri() {
            return this.onRewind;
        }

        private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
            return this.onRewind.size();
        }

        private onCommand AudioAttributesImplApi21Parcelizer(int i) {
            return this.onRewind.get(i);
        }

        public final List<AudioAttributesImplApi21Parcelizer> AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        private int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
            return this.AudioAttributesImplBaseParcelizer.size();
        }

        private AudioAttributesImplApi21Parcelizer write(int i) {
            return this.AudioAttributesImplBaseParcelizer.get(i);
        }

        public final List<Integer> onPlayFromSearch() {
            return this.onPrepareFromSearch;
        }

        public final boolean onSetCaptioningEnabled() {
            return (this.IconCompatParcelizer & 8) == 8;
        }

        public final int MediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final boolean onSetRating() {
            return (this.IconCompatParcelizer & 16) == 16;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onCustomAction() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final boolean onSetPlaybackSpeed() {
            return (this.IconCompatParcelizer & 32) == 32;
        }

        public final int onCommand() {
            return this.MediaMetadataCompat;
        }

        public final List<Integer> onAddQueueItem() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final int handleMediaPlayPauseIfPendingOnHandler() {
            return this.handleMediaPlayPauseIfPendingOnHandler.size();
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> onMediaButtonEvent() {
            return this.onPlay;
        }

        public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.onPlay.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(int i) {
            return this.onPlay.get(i);
        }

        public final List<Integer> onPlayFromMediaId() {
            return this.onMediaButtonEvent;
        }

        public final int onPlay() {
            return this.onMediaButtonEvent.size();
        }

        public final boolean onSetShuffleMode() {
            return (this.IconCompatParcelizer & 64) == 64;
        }

        public final onAddQueueItem onPrepareFromUri() {
            return this.onRemoveQueueItemAt;
        }

        private List<Integer> r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
            return this.onSetRepeatMode;
        }

        public final boolean onSetRepeatMode() {
            return (this.IconCompatParcelizer & 128) == 128;
        }

        public final onPlay onSeekTo() {
            return this.onSeekTo;
        }

        private void MediaSessionCompatQueueItem() {
            this.MediaBrowserCompatItemReceiver = 6;
            this.RatingCompat = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.onRemoveQueueItem = Collections.emptyList();
            this.onPlayFromUri = Collections.emptyList();
            this.onPrepare = Collections.emptyList();
            this.onPause = Collections.emptyList();
            this.AudioAttributesImplApi26Parcelizer = Collections.emptyList();
            this.AudioAttributesImplApi21Parcelizer = Collections.emptyList();
            this.read = Collections.emptyList();
            this.MediaDescriptionCompat = Collections.emptyList();
            this.onPlayFromMediaId = Collections.emptyList();
            this.onRewind = Collections.emptyList();
            this.AudioAttributesImplBaseParcelizer = Collections.emptyList();
            this.onPrepareFromSearch = Collections.emptyList();
            this.MediaBrowserCompatSearchResultReceiver = 0;
            this.MediaBrowserCompatMediaItem = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaMetadataCompat = 0;
            this.handleMediaPlayPauseIfPendingOnHandler = Collections.emptyList();
            this.onPlay = Collections.emptyList();
            this.onMediaButtonEvent = Collections.emptyList();
            this.onRemoveQueueItemAt = onAddQueueItem.AudioAttributesCompatParcelizer();
            this.onSetRepeatMode = Collections.emptyList();
            this.onSeekTo = onPlay.IconCompatParcelizer();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.onAddQueueItem;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!onRemoveQueueItem()) {
                this.onAddQueueItem = (byte) 0;
                return false;
            }
            for (int i = 0; i < _init_lambda2(); i++) {
                if (!AudioAttributesImplBaseParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(); i2++) {
                if (!MediaBrowserCompatItemReceiver(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < MediaSessionCompatToken(); i3++) {
                if (!AudioAttributesCompatParcelizer(i3).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < MediaSessionCompatResultReceiverWrapper(); i4++) {
                if (!RemoteActionCompatParcelizer(i4).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < PlaybackStateCompatCustomAction(); i5++) {
                if (!read(i5).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < ResultReceiver(); i6++) {
                if (!AudioAttributesImplApi26Parcelizer(i6).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(); i7++) {
                if (!AudioAttributesImplApi21Parcelizer(i7).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(); i8++) {
                if (!write(i8).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            if (onSetRating() && !onCustomAction().MediaBrowserCompatCustomActionResultReceiver()) {
                this.onAddQueueItem = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(); i9++) {
                if (!IconCompatParcelizer(i9).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.onAddQueueItem = (byte) 0;
                    return false;
                }
            }
            if (onSetShuffleMode() && !onPrepareFromUri().MediaBrowserCompatCustomActionResultReceiver()) {
                this.onAddQueueItem = (byte) 0;
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.onAddQueueItem = (byte) 0;
                return false;
            }
            this.onAddQueueItem = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.IconCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.MediaBrowserCompatItemReceiver);
            }
            if (onPrepare().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(18);
                setresumeexplanation.MediaMetadataCompat(this.onPrepareFromMediaId);
            }
            for (int i = 0; i < this.onPrepare.size(); i++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.onPrepare.get(i).intValue());
            }
            if ((this.IconCompatParcelizer & 2) == 2) {
                setresumeexplanation.write(3, this.RatingCompat);
            }
            if ((this.IconCompatParcelizer & 4) == 4) {
                setresumeexplanation.write(4, this.RemoteActionCompatParcelizer);
            }
            for (int i2 = 0; i2 < this.onRemoveQueueItem.size(); i2++) {
                setresumeexplanation.IconCompatParcelizer(5, this.onRemoveQueueItem.get(i2));
            }
            for (int i3 = 0; i3 < this.onPlayFromUri.size(); i3++) {
                setresumeexplanation.IconCompatParcelizer(6, this.onPlayFromUri.get(i3));
            }
            if (onFastForward().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(58);
                setresumeexplanation.MediaMetadataCompat(this.onFastForward);
            }
            for (int i4 = 0; i4 < this.onPause.size(); i4++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.onPause.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.read.size(); i5++) {
                setresumeexplanation.IconCompatParcelizer(8, this.read.get(i5));
            }
            for (int i6 = 0; i6 < this.MediaDescriptionCompat.size(); i6++) {
                setresumeexplanation.IconCompatParcelizer(9, this.MediaDescriptionCompat.get(i6));
            }
            for (int i7 = 0; i7 < this.onPlayFromMediaId.size(); i7++) {
                setresumeexplanation.IconCompatParcelizer(10, this.onPlayFromMediaId.get(i7));
            }
            for (int i8 = 0; i8 < this.onRewind.size(); i8++) {
                setresumeexplanation.IconCompatParcelizer(11, this.onRewind.get(i8));
            }
            for (int i9 = 0; i9 < this.AudioAttributesImplBaseParcelizer.size(); i9++) {
                setresumeexplanation.IconCompatParcelizer(13, this.AudioAttributesImplBaseParcelizer.get(i9));
            }
            if (onPlayFromSearch().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                setresumeexplanation.MediaMetadataCompat(this.onPlayFromSearch);
            }
            for (int i10 = 0; i10 < this.onPrepareFromSearch.size(); i10++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.onPrepareFromSearch.get(i10).intValue());
            }
            if ((this.IconCompatParcelizer & 8) == 8) {
                setresumeexplanation.write(17, this.MediaBrowserCompatSearchResultReceiver);
            }
            if ((this.IconCompatParcelizer & 16) == 16) {
                setresumeexplanation.IconCompatParcelizer(18, this.MediaBrowserCompatMediaItem);
            }
            if ((this.IconCompatParcelizer & 32) == 32) {
                setresumeexplanation.write(19, this.MediaMetadataCompat);
            }
            for (int i11 = 0; i11 < this.AudioAttributesImplApi26Parcelizer.size(); i11++) {
                setresumeexplanation.IconCompatParcelizer(20, this.AudioAttributesImplApi26Parcelizer.get(i11));
            }
            if (write().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(170);
                setresumeexplanation.MediaMetadataCompat(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            for (int i12 = 0; i12 < this.AudioAttributesImplApi21Parcelizer.size(); i12++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi21Parcelizer.get(i12).intValue());
            }
            if (onAddQueueItem().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(178);
                setresumeexplanation.MediaMetadataCompat(this.onCommand);
            }
            for (int i13 = 0; i13 < this.handleMediaPlayPauseIfPendingOnHandler.size(); i13++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.handleMediaPlayPauseIfPendingOnHandler.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.onPlay.size(); i14++) {
                setresumeexplanation.IconCompatParcelizer(23, this.onPlay.get(i14));
            }
            if (onPlayFromMediaId().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(194);
                setresumeexplanation.MediaMetadataCompat(this.onCustomAction);
            }
            for (int i15 = 0; i15 < this.onMediaButtonEvent.size(); i15++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.onMediaButtonEvent.get(i15).intValue());
            }
            if ((this.IconCompatParcelizer & 64) == 64) {
                setresumeexplanation.IconCompatParcelizer(30, this.onRemoveQueueItemAt);
            }
            for (int i16 = 0; i16 < this.onSetRepeatMode.size(); i16++) {
                setresumeexplanation.write(31, this.onSetRepeatMode.get(i16).intValue());
            }
            if ((this.IconCompatParcelizer & 128) == 128) {
                setresumeexplanation.IconCompatParcelizer(32, this.onSeekTo);
            }
            sessionImpl.read(19000, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.onPrepareFromUri);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.IconCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.MediaBrowserCompatItemReceiver) : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.onPrepare.size(); i3++) {
                i2 += setResumeExplanation.read(this.onPrepare.get(i3).intValue());
            }
            int iAudioAttributesCompatParcelizer2 = iAudioAttributesCompatParcelizer + i2;
            if (!onPrepare().isEmpty()) {
                iAudioAttributesCompatParcelizer2 = iAudioAttributesCompatParcelizer2 + 1 + setResumeExplanation.read(i2);
            }
            this.onPrepareFromMediaId = i2;
            if ((this.IconCompatParcelizer & 2) == 2) {
                iAudioAttributesCompatParcelizer2 += setResumeExplanation.AudioAttributesCompatParcelizer(3, this.RatingCompat);
            }
            if ((this.IconCompatParcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer2 += setResumeExplanation.AudioAttributesCompatParcelizer(4, this.RemoteActionCompatParcelizer);
            }
            for (int i4 = 0; i4 < this.onRemoveQueueItem.size(); i4++) {
                iAudioAttributesCompatParcelizer2 += setResumeExplanation.read(5, this.onRemoveQueueItem.get(i4));
            }
            for (int i5 = 0; i5 < this.onPlayFromUri.size(); i5++) {
                iAudioAttributesCompatParcelizer2 += setResumeExplanation.read(6, this.onPlayFromUri.get(i5));
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.onPause.size(); i7++) {
                i6 += setResumeExplanation.read(this.onPause.get(i7).intValue());
            }
            int i8 = iAudioAttributesCompatParcelizer2 + i6;
            if (!onFastForward().isEmpty()) {
                i8 = i8 + 1 + setResumeExplanation.read(i6);
            }
            this.onFastForward = i6;
            for (int i9 = 0; i9 < this.read.size(); i9++) {
                i8 += setResumeExplanation.read(8, this.read.get(i9));
            }
            for (int i10 = 0; i10 < this.MediaDescriptionCompat.size(); i10++) {
                i8 += setResumeExplanation.read(9, this.MediaDescriptionCompat.get(i10));
            }
            for (int i11 = 0; i11 < this.onPlayFromMediaId.size(); i11++) {
                i8 += setResumeExplanation.read(10, this.onPlayFromMediaId.get(i11));
            }
            for (int i12 = 0; i12 < this.onRewind.size(); i12++) {
                i8 += setResumeExplanation.read(11, this.onRewind.get(i12));
            }
            for (int i13 = 0; i13 < this.AudioAttributesImplBaseParcelizer.size(); i13++) {
                i8 += setResumeExplanation.read(13, this.AudioAttributesImplBaseParcelizer.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.onPrepareFromSearch.size(); i15++) {
                i14 += setResumeExplanation.read(this.onPrepareFromSearch.get(i15).intValue());
            }
            int iAudioAttributesCompatParcelizer3 = i8 + i14;
            if (!onPlayFromSearch().isEmpty()) {
                iAudioAttributesCompatParcelizer3 = iAudioAttributesCompatParcelizer3 + 2 + setResumeExplanation.read(i14);
            }
            this.onPlayFromSearch = i14;
            if ((this.IconCompatParcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer3 += setResumeExplanation.AudioAttributesCompatParcelizer(17, this.MediaBrowserCompatSearchResultReceiver);
            }
            if ((this.IconCompatParcelizer & 16) == 16) {
                iAudioAttributesCompatParcelizer3 += setResumeExplanation.read(18, this.MediaBrowserCompatMediaItem);
            }
            if ((this.IconCompatParcelizer & 32) == 32) {
                iAudioAttributesCompatParcelizer3 += setResumeExplanation.AudioAttributesCompatParcelizer(19, this.MediaMetadataCompat);
            }
            for (int i16 = 0; i16 < this.AudioAttributesImplApi26Parcelizer.size(); i16++) {
                iAudioAttributesCompatParcelizer3 += setResumeExplanation.read(20, this.AudioAttributesImplApi26Parcelizer.get(i16));
            }
            int i17 = 0;
            for (int i18 = 0; i18 < this.AudioAttributesImplApi21Parcelizer.size(); i18++) {
                i17 += setResumeExplanation.read(this.AudioAttributesImplApi21Parcelizer.get(i18).intValue());
            }
            int i19 = iAudioAttributesCompatParcelizer3 + i17;
            if (!write().isEmpty()) {
                i19 = i19 + 2 + setResumeExplanation.read(i17);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = i17;
            int i20 = 0;
            for (int i21 = 0; i21 < this.handleMediaPlayPauseIfPendingOnHandler.size(); i21++) {
                i20 += setResumeExplanation.read(this.handleMediaPlayPauseIfPendingOnHandler.get(i21).intValue());
            }
            int i22 = i19 + i20;
            if (!onAddQueueItem().isEmpty()) {
                i22 = i22 + 2 + setResumeExplanation.read(i20);
            }
            this.onCommand = i20;
            for (int i23 = 0; i23 < this.onPlay.size(); i23++) {
                i22 += setResumeExplanation.read(23, this.onPlay.get(i23));
            }
            int i24 = 0;
            for (int i25 = 0; i25 < this.onMediaButtonEvent.size(); i25++) {
                i24 += setResumeExplanation.read(this.onMediaButtonEvent.get(i25).intValue());
            }
            int i26 = i22 + i24;
            if (!onPlayFromMediaId().isEmpty()) {
                i26 = i26 + 2 + setResumeExplanation.read(i24);
            }
            this.onCustomAction = i24;
            if ((this.IconCompatParcelizer & 64) == 64) {
                i26 += setResumeExplanation.read(30, this.onRemoveQueueItemAt);
            }
            int i27 = 0;
            for (int i28 = 0; i28 < this.onSetRepeatMode.size(); i28++) {
                i27 += setResumeExplanation.read(this.onSetRepeatMode.get(i28).intValue());
            }
            int size = i26 + i27 + (r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().size() << 1);
            if ((this.IconCompatParcelizer & 128) == 128) {
                size += setResumeExplanation.read(32, this.onSeekTo);
            }
            int iOnSkipToPrevious = size + onSkipToPrevious() + this.onPrepareFromUri.MediaBrowserCompatCustomActionResultReceiver();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        public static RemoteActionCompatParcelizer write(InputStream inputStream, setStepType setsteptype) throws IOException {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(inputStream, setsteptype);
        }

        private static AudioAttributesCompatParcelizer ParcelableVolumeInfo() {
            return AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        private static AudioAttributesCompatParcelizer r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
            return ParcelableVolumeInfo();
        }

        private static AudioAttributesCompatParcelizer onCustomAction(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return ParcelableVolumeInfo().IconCompatParcelizer(remoteActionCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: _init_lambda3, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer RatingCompat() {
            return onCustomAction(this);
        }

        public static final class AudioAttributesCompatParcelizer extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer> implements isIsServerContentUpdated {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi26Parcelizer;
            private int IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private int MediaDescriptionCompat;
            private int AudioAttributesImplBaseParcelizer = 6;
            private List<onCustomAction> onPause = Collections.emptyList();
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> handleMediaPlayPauseIfPendingOnHandler = Collections.emptyList();
            private List<Integer> onAddQueueItem = Collections.emptyList();
            private List<Integer> onCommand = Collections.emptyList();
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> read = Collections.emptyList();
            private List<Integer> write = Collections.emptyList();
            private List<write> RemoteActionCompatParcelizer = Collections.emptyList();
            private List<AudioAttributesImplApi26Parcelizer> MediaBrowserCompatItemReceiver = Collections.emptyList();
            private List<MediaBrowserCompatMediaItem> onCustomAction = Collections.emptyList();
            private List<onCommand> onPlay = Collections.emptyList();
            private List<AudioAttributesImplApi21Parcelizer> AudioAttributesImplApi21Parcelizer = Collections.emptyList();
            private List<Integer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Collections.emptyList();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<Integer> MediaBrowserCompatMediaItem = Collections.emptyList();
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> MediaMetadataCompat = Collections.emptyList();
            private List<Integer> MediaBrowserCompatSearchResultReceiver = Collections.emptyList();
            private onAddQueueItem onPlayFromMediaId = onAddQueueItem.AudioAttributesCompatParcelizer();
            private List<Integer> onFastForward = Collections.emptyList();
            private onPlay onMediaButtonEvent = onPlay.IconCompatParcelizer();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onSeekTo();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onSeekTo();
            }

            private AudioAttributesCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                return new AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: onRewind, reason: merged with bridge method [inline-methods] */
            public AudioAttributesCompatParcelizer clone() {
                return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(onPlayFromUri());
            }

            private static RemoteActionCompatParcelizer onSeekTo() {
                return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: onPrepareFromMediaId, reason: merged with bridge method [inline-methods] */
            public RemoteActionCompatParcelizer write() {
                RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPlayFromUri = onPlayFromUri();
                if (remoteActionCompatParcelizerOnPlayFromUri.MediaBrowserCompatCustomActionResultReceiver()) {
                    return remoteActionCompatParcelizerOnPlayFromUri;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private RemoteActionCompatParcelizer onPlayFromUri() {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.AudioAttributesCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                remoteActionCompatParcelizer.RatingCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 8) == 8) {
                    this.onPause = Collections.unmodifiableList(this.onPause);
                    this.AudioAttributesCompatParcelizer &= -9;
                }
                remoteActionCompatParcelizer.onRemoveQueueItem = this.onPause;
                if ((this.AudioAttributesCompatParcelizer & 16) == 16) {
                    this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                    this.AudioAttributesCompatParcelizer &= -17;
                }
                remoteActionCompatParcelizer.onPlayFromUri = this.handleMediaPlayPauseIfPendingOnHandler;
                if ((this.AudioAttributesCompatParcelizer & 32) == 32) {
                    this.onAddQueueItem = Collections.unmodifiableList(this.onAddQueueItem);
                    this.AudioAttributesCompatParcelizer &= -33;
                }
                remoteActionCompatParcelizer.onPrepare = this.onAddQueueItem;
                if ((this.AudioAttributesCompatParcelizer & 64) == 64) {
                    this.onCommand = Collections.unmodifiableList(this.onCommand);
                    this.AudioAttributesCompatParcelizer &= -65;
                }
                remoteActionCompatParcelizer.onPause = this.onCommand;
                if ((this.AudioAttributesCompatParcelizer & 128) == 128) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.AudioAttributesCompatParcelizer &= -129;
                }
                remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer = this.read;
                if ((this.AudioAttributesCompatParcelizer & 256) == 256) {
                    this.write = Collections.unmodifiableList(this.write);
                    this.AudioAttributesCompatParcelizer &= -257;
                }
                remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = this.write;
                if ((this.AudioAttributesCompatParcelizer & 512) == 512) {
                    this.RemoteActionCompatParcelizer = Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer &= -513;
                }
                remoteActionCompatParcelizer.read = this.RemoteActionCompatParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 1024) == 1024) {
                    this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(this.MediaBrowserCompatItemReceiver);
                    this.AudioAttributesCompatParcelizer &= -1025;
                }
                remoteActionCompatParcelizer.MediaDescriptionCompat = this.MediaBrowserCompatItemReceiver;
                if ((this.AudioAttributesCompatParcelizer & 2048) == 2048) {
                    this.onCustomAction = Collections.unmodifiableList(this.onCustomAction);
                    this.AudioAttributesCompatParcelizer &= -2049;
                }
                remoteActionCompatParcelizer.onPlayFromMediaId = this.onCustomAction;
                if ((this.AudioAttributesCompatParcelizer & 4096) == 4096) {
                    this.onPlay = Collections.unmodifiableList(this.onPlay);
                    this.AudioAttributesCompatParcelizer &= -4097;
                }
                remoteActionCompatParcelizer.onRewind = this.onPlay;
                if ((this.AudioAttributesCompatParcelizer & 8192) == 8192) {
                    this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi21Parcelizer);
                    this.AudioAttributesCompatParcelizer &= -8193;
                }
                remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer;
                if ((this.AudioAttributesCompatParcelizer & 16384) == 16384) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Collections.unmodifiableList(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    this.AudioAttributesCompatParcelizer &= -16385;
                }
                remoteActionCompatParcelizer.onPrepareFromSearch = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplApi26Parcelizer;
                if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 65536) {
                    i2 |= 16;
                }
                remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = this.RatingCompat;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                remoteActionCompatParcelizer.MediaMetadataCompat = this.MediaDescriptionCompat;
                if ((this.AudioAttributesCompatParcelizer & 262144) == 262144) {
                    this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(this.MediaBrowserCompatMediaItem);
                    this.AudioAttributesCompatParcelizer &= -262145;
                }
                remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatMediaItem;
                if ((this.AudioAttributesCompatParcelizer & 524288) == 524288) {
                    this.MediaMetadataCompat = Collections.unmodifiableList(this.MediaMetadataCompat);
                    this.AudioAttributesCompatParcelizer &= -524289;
                }
                remoteActionCompatParcelizer.onPlay = this.MediaMetadataCompat;
                if ((this.AudioAttributesCompatParcelizer & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                    this.MediaBrowserCompatSearchResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatSearchResultReceiver);
                    this.AudioAttributesCompatParcelizer &= -1048577;
                }
                remoteActionCompatParcelizer.onMediaButtonEvent = this.MediaBrowserCompatSearchResultReceiver;
                if ((2097152 & i) == 2097152) {
                    i2 |= 64;
                }
                remoteActionCompatParcelizer.onRemoveQueueItemAt = this.onPlayFromMediaId;
                if ((this.AudioAttributesCompatParcelizer & 4194304) == 4194304) {
                    this.onFastForward = Collections.unmodifiableList(this.onFastForward);
                    this.AudioAttributesCompatParcelizer &= -4194305;
                }
                remoteActionCompatParcelizer.onSetRepeatMode = this.onFastForward;
                if ((i & 8388608) == 8388608) {
                    i2 |= 128;
                }
                remoteActionCompatParcelizer.onSeekTo = this.onMediaButtonEvent;
                remoteActionCompatParcelizer.IconCompatParcelizer = i2;
                return remoteActionCompatParcelizer;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final AudioAttributesCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                if (remoteActionCompatParcelizer == RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (remoteActionCompatParcelizer.onRewind()) {
                    MediaBrowserCompatMediaItem(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
                }
                if (remoteActionCompatParcelizer.onRemoveQueueItem()) {
                    MediaMetadataCompat(remoteActionCompatParcelizer.MediaMetadataCompat());
                }
                if (remoteActionCompatParcelizer.onRemoveQueueItemAt()) {
                    MediaBrowserCompatItemReceiver(remoteActionCompatParcelizer.IconCompatParcelizer());
                }
                if (!remoteActionCompatParcelizer.onRemoveQueueItem.isEmpty()) {
                    if (this.onPause.isEmpty()) {
                        this.onPause = remoteActionCompatParcelizer.onRemoveQueueItem;
                        this.AudioAttributesCompatParcelizer &= -9;
                    } else {
                        onPlayFromSearch();
                        this.onPause.addAll(remoteActionCompatParcelizer.onRemoveQueueItem);
                    }
                }
                if (!remoteActionCompatParcelizer.onPlayFromUri.isEmpty()) {
                    if (this.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
                        this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizer.onPlayFromUri;
                        this.AudioAttributesCompatParcelizer &= -17;
                    } else {
                        onMediaButtonEvent();
                        this.handleMediaPlayPauseIfPendingOnHandler.addAll(remoteActionCompatParcelizer.onPlayFromUri);
                    }
                }
                if (!remoteActionCompatParcelizer.onPrepare.isEmpty()) {
                    if (this.onAddQueueItem.isEmpty()) {
                        this.onAddQueueItem = remoteActionCompatParcelizer.onPrepare;
                        this.AudioAttributesCompatParcelizer &= -33;
                    } else {
                        onPause();
                        this.onAddQueueItem.addAll(remoteActionCompatParcelizer.onPrepare);
                    }
                }
                if (!remoteActionCompatParcelizer.onPause.isEmpty()) {
                    if (this.onCommand.isEmpty()) {
                        this.onCommand = remoteActionCompatParcelizer.onPause;
                        this.AudioAttributesCompatParcelizer &= -65;
                    } else {
                        onFastForward();
                        this.onCommand.addAll(remoteActionCompatParcelizer.onPause);
                    }
                }
                if (!remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
                        this.AudioAttributesCompatParcelizer &= -129;
                    } else {
                        MediaDescriptionCompat();
                        this.read.addAll(remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer);
                    }
                }
                if (!remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.isEmpty()) {
                    if (this.write.isEmpty()) {
                        this.write = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                        this.AudioAttributesCompatParcelizer &= -257;
                    } else {
                        RatingCompat();
                        this.write.addAll(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer);
                    }
                }
                if (!remoteActionCompatParcelizer.read.isEmpty()) {
                    if (this.RemoteActionCompatParcelizer.isEmpty()) {
                        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.read;
                        this.AudioAttributesCompatParcelizer &= -513;
                    } else {
                        AudioAttributesImplBaseParcelizer();
                        this.RemoteActionCompatParcelizer.addAll(remoteActionCompatParcelizer.read);
                    }
                }
                if (!remoteActionCompatParcelizer.MediaDescriptionCompat.isEmpty()) {
                    if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
                        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.MediaDescriptionCompat;
                        this.AudioAttributesCompatParcelizer &= -1025;
                    } else {
                        onCommand();
                        this.MediaBrowserCompatItemReceiver.addAll(remoteActionCompatParcelizer.MediaDescriptionCompat);
                    }
                }
                if (!remoteActionCompatParcelizer.onPlayFromMediaId.isEmpty()) {
                    if (this.onCustomAction.isEmpty()) {
                        this.onCustomAction = remoteActionCompatParcelizer.onPlayFromMediaId;
                        this.AudioAttributesCompatParcelizer &= -2049;
                    } else {
                        onPlay();
                        this.onCustomAction.addAll(remoteActionCompatParcelizer.onPlayFromMediaId);
                    }
                }
                if (!remoteActionCompatParcelizer.onRewind.isEmpty()) {
                    if (this.onPlay.isEmpty()) {
                        this.onPlay = remoteActionCompatParcelizer.onRewind;
                        this.AudioAttributesCompatParcelizer &= -4097;
                    } else {
                        onPrepareFromSearch();
                        this.onPlay.addAll(remoteActionCompatParcelizer.onRewind);
                    }
                }
                if (!remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer.isEmpty()) {
                    if (this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
                        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                        this.AudioAttributesCompatParcelizer &= -8193;
                    } else {
                        onCustomAction();
                        this.AudioAttributesImplApi21Parcelizer.addAll(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer);
                    }
                }
                if (!remoteActionCompatParcelizer.onPrepareFromSearch.isEmpty()) {
                    if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer.onPrepareFromSearch;
                        this.AudioAttributesCompatParcelizer &= -16385;
                    } else {
                        onPlayFromMediaId();
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.addAll(remoteActionCompatParcelizer.onPrepareFromSearch);
                    }
                }
                if (remoteActionCompatParcelizer.onSetCaptioningEnabled()) {
                    RatingCompat(remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
                }
                if (remoteActionCompatParcelizer.onSetRating()) {
                    IconCompatParcelizer(remoteActionCompatParcelizer.onCustomAction());
                }
                if (remoteActionCompatParcelizer.onSetPlaybackSpeed()) {
                    MediaDescriptionCompat(remoteActionCompatParcelizer.onCommand());
                }
                if (!remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
                    if (this.MediaBrowserCompatMediaItem.isEmpty()) {
                        this.MediaBrowserCompatMediaItem = remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
                        this.AudioAttributesCompatParcelizer &= -262145;
                    } else {
                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        this.MediaBrowserCompatMediaItem.addAll(remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler);
                    }
                }
                if (!remoteActionCompatParcelizer.onPlay.isEmpty()) {
                    if (this.MediaMetadataCompat.isEmpty()) {
                        this.MediaMetadataCompat = remoteActionCompatParcelizer.onPlay;
                        this.AudioAttributesCompatParcelizer &= -524289;
                    } else {
                        handleMediaPlayPauseIfPendingOnHandler();
                        this.MediaMetadataCompat.addAll(remoteActionCompatParcelizer.onPlay);
                    }
                }
                if (!remoteActionCompatParcelizer.onMediaButtonEvent.isEmpty()) {
                    if (this.MediaBrowserCompatSearchResultReceiver.isEmpty()) {
                        this.MediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizer.onMediaButtonEvent;
                        this.AudioAttributesCompatParcelizer &= -1048577;
                    } else {
                        onAddQueueItem();
                        this.MediaBrowserCompatSearchResultReceiver.addAll(remoteActionCompatParcelizer.onMediaButtonEvent);
                    }
                }
                if (remoteActionCompatParcelizer.onSetShuffleMode()) {
                    write(remoteActionCompatParcelizer.onPrepareFromUri());
                }
                if (!remoteActionCompatParcelizer.onSetRepeatMode.isEmpty()) {
                    if (this.onFastForward.isEmpty()) {
                        this.onFastForward = remoteActionCompatParcelizer.onSetRepeatMode;
                        this.AudioAttributesCompatParcelizer &= -4194305;
                    } else {
                        onPrepare();
                        this.onFastForward.addAll(remoteActionCompatParcelizer.onSetRepeatMode);
                    }
                }
                if (remoteActionCompatParcelizer.onSetRepeatMode()) {
                    AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.onSeekTo());
                }
                write(remoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(remoteActionCompatParcelizer.onPrepareFromUri));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onSkipToNext()) {
                    return false;
                }
                for (int i = 0; i < onSkipToPrevious(); i++) {
                    if (!AudioAttributesImplBaseParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < onSetCaptioningEnabled(); i2++) {
                    if (!AudioAttributesImplApi21Parcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < onRemoveQueueItemAt(); i3++) {
                    if (!RemoteActionCompatParcelizer(i3).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < onPrepareFromUri(); i4++) {
                    if (!IconCompatParcelizer(i4).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < onSetRepeatMode(); i5++) {
                    if (!write(i5).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < onSetShuffleMode(); i6++) {
                    if (!MediaBrowserCompatCustomActionResultReceiver(i6).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < setSessionImpl(); i7++) {
                    if (!AudioAttributesImplApi26Parcelizer(i7).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i8 = 0; i8 < onRemoveQueueItem(); i8++) {
                    if (!AudioAttributesCompatParcelizer(i8).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                if (onSkipToQueueItem() && !onSetPlaybackSpeed().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i9 = 0; i9 < onSetRating(); i9++) {
                    if (!read(i9).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return (!MediaSessionCompatQueueItem() || onStop().MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$RemoteActionCompatParcelizer> r0 = o.setActiveRecallQbankId.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$RemoteActionCompatParcelizer r2 = (o.setActiveRecallQbankId.RemoteActionCompatParcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$RemoteActionCompatParcelizer r3 = (o.setActiveRecallQbankId.RemoteActionCompatParcelizer) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$RemoteActionCompatParcelizer$AudioAttributesCompatParcelizer");
            }

            private AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem(int i) {
                this.AudioAttributesCompatParcelizer |= 1;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }

            private boolean onSkipToNext() {
                return (this.AudioAttributesCompatParcelizer & 2) == 2;
            }

            private AudioAttributesCompatParcelizer MediaMetadataCompat(int i) {
                this.AudioAttributesCompatParcelizer |= 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i;
                return this;
            }

            private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver(int i) {
                this.AudioAttributesCompatParcelizer |= 4;
                this.IconCompatParcelizer = i;
                return this;
            }

            private void onPlayFromSearch() {
                if ((this.AudioAttributesCompatParcelizer & 8) != 8) {
                    this.onPause = new ArrayList(this.onPause);
                    this.AudioAttributesCompatParcelizer |= 8;
                }
            }

            private int onSkipToPrevious() {
                return this.onPause.size();
            }

            private onCustomAction AudioAttributesImplBaseParcelizer(int i) {
                return this.onPause.get(i);
            }

            private void onMediaButtonEvent() {
                if ((this.AudioAttributesCompatParcelizer & 16) != 16) {
                    this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList(this.handleMediaPlayPauseIfPendingOnHandler);
                    this.AudioAttributesCompatParcelizer |= 16;
                }
            }

            private int onSetCaptioningEnabled() {
                return this.handleMediaPlayPauseIfPendingOnHandler.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi21Parcelizer(int i) {
                return this.handleMediaPlayPauseIfPendingOnHandler.get(i);
            }

            private void onPause() {
                if ((this.AudioAttributesCompatParcelizer & 32) != 32) {
                    this.onAddQueueItem = new ArrayList(this.onAddQueueItem);
                    this.AudioAttributesCompatParcelizer |= 32;
                }
            }

            private void onFastForward() {
                if ((this.AudioAttributesCompatParcelizer & 64) != 64) {
                    this.onCommand = new ArrayList(this.onCommand);
                    this.AudioAttributesCompatParcelizer |= 64;
                }
            }

            private void MediaDescriptionCompat() {
                if ((this.AudioAttributesCompatParcelizer & 128) != 128) {
                    this.read = new ArrayList(this.read);
                    this.AudioAttributesCompatParcelizer |= 128;
                }
            }

            private int onRemoveQueueItemAt() {
                return this.read.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(int i) {
                return this.read.get(i);
            }

            private void RatingCompat() {
                if ((this.AudioAttributesCompatParcelizer & 256) != 256) {
                    this.write = new ArrayList(this.write);
                    this.AudioAttributesCompatParcelizer |= 256;
                }
            }

            private void AudioAttributesImplBaseParcelizer() {
                if ((this.AudioAttributesCompatParcelizer & 512) != 512) {
                    this.RemoteActionCompatParcelizer = new ArrayList(this.RemoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer |= 512;
                }
            }

            private int onPrepareFromUri() {
                return this.RemoteActionCompatParcelizer.size();
            }

            private write IconCompatParcelizer(int i) {
                return this.RemoteActionCompatParcelizer.get(i);
            }

            private void onCommand() {
                if ((this.AudioAttributesCompatParcelizer & 1024) != 1024) {
                    this.MediaBrowserCompatItemReceiver = new ArrayList(this.MediaBrowserCompatItemReceiver);
                    this.AudioAttributesCompatParcelizer |= 1024;
                }
            }

            private int onSetRepeatMode() {
                return this.MediaBrowserCompatItemReceiver.size();
            }

            private AudioAttributesImplApi26Parcelizer write(int i) {
                return this.MediaBrowserCompatItemReceiver.get(i);
            }

            private void onPlay() {
                if ((this.AudioAttributesCompatParcelizer & 2048) != 2048) {
                    this.onCustomAction = new ArrayList(this.onCustomAction);
                    this.AudioAttributesCompatParcelizer |= 2048;
                }
            }

            private int onSetShuffleMode() {
                return this.onCustomAction.size();
            }

            private MediaBrowserCompatMediaItem MediaBrowserCompatCustomActionResultReceiver(int i) {
                return this.onCustomAction.get(i);
            }

            private void onPrepareFromSearch() {
                if ((this.AudioAttributesCompatParcelizer & 4096) != 4096) {
                    this.onPlay = new ArrayList(this.onPlay);
                    this.AudioAttributesCompatParcelizer |= 4096;
                }
            }

            private int setSessionImpl() {
                return this.onPlay.size();
            }

            private onCommand AudioAttributesImplApi26Parcelizer(int i) {
                return this.onPlay.get(i);
            }

            private void onCustomAction() {
                if ((this.AudioAttributesCompatParcelizer & 8192) != 8192) {
                    this.AudioAttributesImplApi21Parcelizer = new ArrayList(this.AudioAttributesImplApi21Parcelizer);
                    this.AudioAttributesCompatParcelizer |= 8192;
                }
            }

            private int onRemoveQueueItem() {
                return this.AudioAttributesImplApi21Parcelizer.size();
            }

            private AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer(int i) {
                return this.AudioAttributesImplApi21Parcelizer.get(i);
            }

            private void onPlayFromMediaId() {
                if ((this.AudioAttributesCompatParcelizer & 16384) != 16384) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    this.AudioAttributesCompatParcelizer |= 16384;
                }
            }

            private AudioAttributesCompatParcelizer RatingCompat(int i) {
                this.AudioAttributesCompatParcelizer |= 32768;
                this.AudioAttributesImplApi26Parcelizer = i;
                return this;
            }

            private boolean onSkipToQueueItem() {
                return (this.AudioAttributesCompatParcelizer & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 65536;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onSetPlaybackSpeed() {
                return this.RatingCompat;
            }

            private AudioAttributesCompatParcelizer IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 65536 && this.RatingCompat != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.RatingCompat).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.RatingCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                return this;
            }

            private AudioAttributesCompatParcelizer MediaDescriptionCompat(int i) {
                this.AudioAttributesCompatParcelizer |= 131072;
                this.MediaDescriptionCompat = i;
                return this;
            }

            private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                if ((this.AudioAttributesCompatParcelizer & 262144) != 262144) {
                    this.MediaBrowserCompatMediaItem = new ArrayList(this.MediaBrowserCompatMediaItem);
                    this.AudioAttributesCompatParcelizer |= 262144;
                }
            }

            private void handleMediaPlayPauseIfPendingOnHandler() {
                if ((this.AudioAttributesCompatParcelizer & 524288) != 524288) {
                    this.MediaMetadataCompat = new ArrayList(this.MediaMetadataCompat);
                    this.AudioAttributesCompatParcelizer |= 524288;
                }
            }

            private int onSetRating() {
                return this.MediaMetadataCompat.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver read(int i) {
                return this.MediaMetadataCompat.get(i);
            }

            private void onAddQueueItem() {
                if ((this.AudioAttributesCompatParcelizer & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                    this.MediaBrowserCompatSearchResultReceiver = new ArrayList(this.MediaBrowserCompatSearchResultReceiver);
                    this.AudioAttributesCompatParcelizer |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
            }

            private boolean MediaSessionCompatQueueItem() {
                return (this.AudioAttributesCompatParcelizer & 2097152) == 2097152;
            }

            private onAddQueueItem onStop() {
                return this.onPlayFromMediaId;
            }

            private AudioAttributesCompatParcelizer write(onAddQueueItem onaddqueueitem) {
                if ((this.AudioAttributesCompatParcelizer & 2097152) == 2097152 && this.onPlayFromMediaId != onAddQueueItem.AudioAttributesCompatParcelizer()) {
                    this.onPlayFromMediaId = onAddQueueItem.IconCompatParcelizer(this.onPlayFromMediaId).IconCompatParcelizer(onaddqueueitem).AudioAttributesImplBaseParcelizer();
                } else {
                    this.onPlayFromMediaId = onaddqueueitem;
                }
                this.AudioAttributesCompatParcelizer |= 2097152;
                return this;
            }

            private void onPrepare() {
                if ((this.AudioAttributesCompatParcelizer & 4194304) != 4194304) {
                    this.onFastForward = new ArrayList(this.onFastForward);
                    this.AudioAttributesCompatParcelizer |= 4194304;
                }
            }

            private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(onPlay onplay) {
                if ((this.AudioAttributesCompatParcelizer & 8388608) == 8388608 && this.onMediaButtonEvent != onPlay.IconCompatParcelizer()) {
                    this.onMediaButtonEvent = onPlay.write(this.onMediaButtonEvent).IconCompatParcelizer(onplay).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.onMediaButtonEvent = onplay;
                }
                this.AudioAttributesCompatParcelizer |= 8388608;
                return this;
            }
        }
    }

    public static final class RatingCompat extends HomeLessonIndexV2.read<RatingCompat> implements setIntro {
        public static getParentMcqId<RatingCompat> AudioAttributesCompatParcelizer = new setReadTime<RatingCompat>() { // from class: o.setActiveRecallQbankId.RatingCompat.2
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return IconCompatParcelizer(setslidescount, setsteptype);
            }

            private static RatingCompat IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new RatingCompat(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final RatingCompat IconCompatParcelizer;
        private final setVideoAspectRatio AudioAttributesImplApi21Parcelizer;
        private onAddQueueItem AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private List<MediaBrowserCompatMediaItem> MediaBrowserCompatCustomActionResultReceiver;
        private List<onCommand> MediaBrowserCompatItemReceiver;
        private onPlay RatingCompat;
        private List<AudioAttributesImplApi26Parcelizer> RemoteActionCompatParcelizer;
        private int read;
        private byte write;

        /* synthetic */ RatingCompat(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ RatingCompat(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onFastForward();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onCustomAction();
        }

        private RatingCompat(HomeLessonIndexV2.AudioAttributesCompatParcelizer<RatingCompat, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.write = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private RatingCompat() {
            this.write = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.AudioAttributesImplApi21Parcelizer = setVideoAspectRatio.write;
        }

        public static RatingCompat AudioAttributesCompatParcelizer() {
            return IconCompatParcelizer;
        }

        private static RatingCompat onCustomAction() {
            return IconCompatParcelizer;
        }

        private RatingCompat(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.write = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            MediaBrowserCompatMediaItem();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.RemoteActionCompatParcelizer = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.RemoteActionCompatParcelizer.add((AudioAttributesImplApi26Parcelizer) setslidescount.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer, setsteptype));
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.MediaBrowserCompatCustomActionResultReceiver.add((MediaBrowserCompatMediaItem) setslidescount.RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem.IconCompatParcelizer, setsteptype));
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler != 42) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 242) {
                                    onAddQueueItem.write writeVarRatingCompat = (this.read & 1) == 1 ? this.AudioAttributesImplApi26Parcelizer.RatingCompat() : null;
                                    onAddQueueItem onaddqueueitem = (onAddQueueItem) setslidescount.RemoteActionCompatParcelizer(onAddQueueItem.read, setsteptype);
                                    this.AudioAttributesImplApi26Parcelizer = onaddqueueitem;
                                    if (writeVarRatingCompat != null) {
                                        writeVarRatingCompat.IconCompatParcelizer(onaddqueueitem);
                                        this.AudioAttributesImplApi26Parcelizer = writeVarRatingCompat.AudioAttributesImplBaseParcelizer();
                                    }
                                    this.read |= 1;
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 258) {
                                    onPlay.IconCompatParcelizer iconCompatParcelizerRatingCompat = (this.read & 2) == 2 ? this.RatingCompat.RatingCompat() : null;
                                    onPlay onplay = (onPlay) setslidescount.RemoteActionCompatParcelizer(onPlay.RemoteActionCompatParcelizer, setsteptype);
                                    this.RatingCompat = onplay;
                                    if (iconCompatParcelizerRatingCompat != null) {
                                        iconCompatParcelizerRatingCompat.IconCompatParcelizer(onplay);
                                        this.RatingCompat = iconCompatParcelizerRatingCompat.AudioAttributesImplApi26Parcelizer();
                                    }
                                    this.read |= 2;
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            } else {
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 != 4) {
                                    this.MediaBrowserCompatItemReceiver = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.MediaBrowserCompatItemReceiver.add((onCommand) setslidescount.RemoteActionCompatParcelizer(onCommand.RemoteActionCompatParcelizer, setsteptype));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((i == true ? 1 : 0) & 1) == 1) {
                            this.RemoteActionCompatParcelizer = Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
                        }
                        if (((i == true ? 1 : 0) & 2) == 2) {
                            this.MediaBrowserCompatCustomActionResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatCustomActionResultReceiver);
                        }
                        if (((i == true ? 1 : 0) & 4) == 4) {
                            this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(this.MediaBrowserCompatItemReceiver);
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
            if (((i == true ? 1 : 0) & 1) == 1) {
                this.RemoteActionCompatParcelizer = Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
            }
            if (((i == true ? 1 : 0) & 2) == 2) {
                this.MediaBrowserCompatCustomActionResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if (((i == true ? 1 : 0) & 4) == 4) {
                this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(this.MediaBrowserCompatItemReceiver);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            RatingCompat ratingCompat = new RatingCompat();
            IconCompatParcelizer = ratingCompat;
            ratingCompat.MediaBrowserCompatMediaItem();
        }

        public final List<AudioAttributesImplApi26Parcelizer> write() {
            return this.RemoteActionCompatParcelizer;
        }

        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.RemoteActionCompatParcelizer.size();
        }

        private AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer(int i) {
            return this.RemoteActionCompatParcelizer.get(i);
        }

        public final List<MediaBrowserCompatMediaItem> RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        private int handleMediaPlayPauseIfPendingOnHandler() {
            return this.MediaBrowserCompatCustomActionResultReceiver.size();
        }

        private MediaBrowserCompatMediaItem IconCompatParcelizer(int i) {
            return this.MediaBrowserCompatCustomActionResultReceiver.get(i);
        }

        public final List<onCommand> IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private int onAddQueueItem() {
            return this.MediaBrowserCompatItemReceiver.size();
        }

        private onCommand read(int i) {
            return this.MediaBrowserCompatItemReceiver.get(i);
        }

        public final boolean MediaBrowserCompatSearchResultReceiver() {
            return (this.read & 1) == 1;
        }

        public final onAddQueueItem AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean MediaMetadataCompat() {
            return (this.read & 2) == 2;
        }

        public final onPlay MediaBrowserCompatItemReceiver() {
            return this.RatingCompat;
        }

        private void MediaBrowserCompatMediaItem() {
            this.RemoteActionCompatParcelizer = Collections.emptyList();
            this.MediaBrowserCompatCustomActionResultReceiver = Collections.emptyList();
            this.MediaBrowserCompatItemReceiver = Collections.emptyList();
            this.AudioAttributesImplApi26Parcelizer = onAddQueueItem.AudioAttributesCompatParcelizer();
            this.RatingCompat = onPlay.IconCompatParcelizer();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.write;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(); i++) {
                if (!AudioAttributesCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.write = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < handleMediaPlayPauseIfPendingOnHandler(); i2++) {
                if (!IconCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.write = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < onAddQueueItem(); i3++) {
                if (!read(i3).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.write = (byte) 0;
                    return false;
                }
            }
            if (MediaBrowserCompatSearchResultReceiver() && !AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                this.write = (byte) 0;
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.write = (byte) 0;
                return false;
            }
            this.write = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(3, this.RemoteActionCompatParcelizer.get(i));
            }
            for (int i2 = 0; i2 < this.MediaBrowserCompatCustomActionResultReceiver.size(); i2++) {
                setresumeexplanation.IconCompatParcelizer(4, this.MediaBrowserCompatCustomActionResultReceiver.get(i2));
            }
            for (int i3 = 0; i3 < this.MediaBrowserCompatItemReceiver.size(); i3++) {
                setresumeexplanation.IconCompatParcelizer(5, this.MediaBrowserCompatItemReceiver.get(i3));
            }
            if ((this.read & 1) == 1) {
                setresumeexplanation.IconCompatParcelizer(30, this.AudioAttributesImplApi26Parcelizer);
            }
            if ((this.read & 2) == 2) {
                setresumeexplanation.IconCompatParcelizer(32, this.RatingCompat);
            }
            sessionImpl.read(200, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.RemoteActionCompatParcelizer.size(); i3++) {
                i2 += setResumeExplanation.read(3, this.RemoteActionCompatParcelizer.get(i3));
            }
            for (int i4 = 0; i4 < this.MediaBrowserCompatCustomActionResultReceiver.size(); i4++) {
                i2 += setResumeExplanation.read(4, this.MediaBrowserCompatCustomActionResultReceiver.get(i4));
            }
            for (int i5 = 0; i5 < this.MediaBrowserCompatItemReceiver.size(); i5++) {
                i2 += setResumeExplanation.read(5, this.MediaBrowserCompatItemReceiver.get(i5));
            }
            if ((this.read & 1) == 1) {
                i2 += setResumeExplanation.read(30, this.AudioAttributesImplApi26Parcelizer);
            }
            if ((this.read & 2) == 2) {
                i2 += setResumeExplanation.read(32, this.RatingCompat);
            }
            int iOnSkipToPrevious = i2 + onSkipToPrevious() + this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        public static RatingCompat AudioAttributesCompatParcelizer(InputStream inputStream, setStepType setsteptype) throws IOException {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(inputStream, setsteptype);
        }

        private static write onCommand() {
            return write.AudioAttributesImplBaseParcelizer();
        }

        private static write onFastForward() {
            return onCommand();
        }

        public static write write(RatingCompat ratingCompat) {
            return onCommand().IconCompatParcelizer(ratingCompat);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
        public final write RatingCompat() {
            return write(this);
        }

        public static final class write extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<RatingCompat, write> implements setIntro {
            private int IconCompatParcelizer;
            private List<AudioAttributesImplApi26Parcelizer> read = Collections.emptyList();
            private List<MediaBrowserCompatMediaItem> RemoteActionCompatParcelizer = Collections.emptyList();
            private List<onCommand> write = Collections.emptyList();
            private onAddQueueItem AudioAttributesCompatParcelizer = onAddQueueItem.AudioAttributesCompatParcelizer();
            private onPlay MediaBrowserCompatCustomActionResultReceiver = onPlay.IconCompatParcelizer();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCustomAction();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCustomAction();
            }

            private write() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static write AudioAttributesImplBaseParcelizer() {
                return new write();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: merged with bridge method [inline-methods] */
            public write clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static RatingCompat onCustomAction() {
                return RatingCompat.AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: merged with bridge method [inline-methods] */
            public RatingCompat write() {
                RatingCompat ratingCompatAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (ratingCompatAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return ratingCompatAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final RatingCompat AudioAttributesImplApi26Parcelizer() {
                RatingCompat ratingCompat = new RatingCompat((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.IconCompatParcelizer;
                if ((i & 1) == 1) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.IconCompatParcelizer &= -2;
                }
                ratingCompat.RemoteActionCompatParcelizer = this.read;
                if ((this.IconCompatParcelizer & 2) == 2) {
                    this.RemoteActionCompatParcelizer = Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
                    this.IconCompatParcelizer &= -3;
                }
                ratingCompat.MediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer;
                if ((this.IconCompatParcelizer & 4) == 4) {
                    this.write = Collections.unmodifiableList(this.write);
                    this.IconCompatParcelizer &= -5;
                }
                ratingCompat.MediaBrowserCompatItemReceiver = this.write;
                int i2 = (i & 8) == 8 ? 1 : 0;
                ratingCompat.AudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                ratingCompat.RatingCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                ratingCompat.read = i2;
                return ratingCompat;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final write IconCompatParcelizer(RatingCompat ratingCompat) {
                if (ratingCompat == RatingCompat.AudioAttributesCompatParcelizer()) {
                    return this;
                }
                if (!ratingCompat.RemoteActionCompatParcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = ratingCompat.RemoteActionCompatParcelizer;
                        this.IconCompatParcelizer &= -2;
                    } else {
                        RatingCompat();
                        this.read.addAll(ratingCompat.RemoteActionCompatParcelizer);
                    }
                }
                if (!ratingCompat.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                    if (this.RemoteActionCompatParcelizer.isEmpty()) {
                        this.RemoteActionCompatParcelizer = ratingCompat.MediaBrowserCompatCustomActionResultReceiver;
                        this.IconCompatParcelizer &= -3;
                    } else {
                        MediaDescriptionCompat();
                        this.RemoteActionCompatParcelizer.addAll(ratingCompat.MediaBrowserCompatCustomActionResultReceiver);
                    }
                }
                if (!ratingCompat.MediaBrowserCompatItemReceiver.isEmpty()) {
                    if (this.write.isEmpty()) {
                        this.write = ratingCompat.MediaBrowserCompatItemReceiver;
                        this.IconCompatParcelizer &= -5;
                    } else {
                        onAddQueueItem();
                        this.write.addAll(ratingCompat.MediaBrowserCompatItemReceiver);
                    }
                }
                if (ratingCompat.MediaBrowserCompatSearchResultReceiver()) {
                    AudioAttributesCompatParcelizer(ratingCompat.AudioAttributesImplBaseParcelizer());
                }
                if (ratingCompat.MediaMetadataCompat()) {
                    AudioAttributesCompatParcelizer(ratingCompat.MediaBrowserCompatItemReceiver());
                }
                write(ratingCompat);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(ratingCompat.AudioAttributesImplApi21Parcelizer));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < onCommand(); i++) {
                    if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < onMediaButtonEvent(); i2++) {
                    if (!write(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < onPlayFromMediaId(); i3++) {
                    if (!AudioAttributesCompatParcelizer(i3).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return (!onFastForward() || onPause().MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.RatingCompat.write read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$RatingCompat> r0 = o.setActiveRecallQbankId.RatingCompat.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$RatingCompat r2 = (o.setActiveRecallQbankId.RatingCompat) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$RatingCompat r3 = (o.setActiveRecallQbankId.RatingCompat) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.RatingCompat.write.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$RatingCompat$write");
            }

            private void RatingCompat() {
                if ((this.IconCompatParcelizer & 1) != 1) {
                    this.read = new ArrayList(this.read);
                    this.IconCompatParcelizer |= 1;
                }
            }

            private int onCommand() {
                return this.read.size();
            }

            private AudioAttributesImplApi26Parcelizer read(int i) {
                return this.read.get(i);
            }

            private void MediaDescriptionCompat() {
                if ((this.IconCompatParcelizer & 2) != 2) {
                    this.RemoteActionCompatParcelizer = new ArrayList(this.RemoteActionCompatParcelizer);
                    this.IconCompatParcelizer |= 2;
                }
            }

            private int onMediaButtonEvent() {
                return this.RemoteActionCompatParcelizer.size();
            }

            private MediaBrowserCompatMediaItem write(int i) {
                return this.RemoteActionCompatParcelizer.get(i);
            }

            private void onAddQueueItem() {
                if ((this.IconCompatParcelizer & 4) != 4) {
                    this.write = new ArrayList(this.write);
                    this.IconCompatParcelizer |= 4;
                }
            }

            private int onPlayFromMediaId() {
                return this.write.size();
            }

            private onCommand AudioAttributesCompatParcelizer(int i) {
                return this.write.get(i);
            }

            private boolean onFastForward() {
                return (this.IconCompatParcelizer & 8) == 8;
            }

            private onAddQueueItem onPause() {
                return this.AudioAttributesCompatParcelizer;
            }

            private write AudioAttributesCompatParcelizer(onAddQueueItem onaddqueueitem) {
                if ((this.IconCompatParcelizer & 8) == 8 && this.AudioAttributesCompatParcelizer != onAddQueueItem.AudioAttributesCompatParcelizer()) {
                    this.AudioAttributesCompatParcelizer = onAddQueueItem.IconCompatParcelizer(this.AudioAttributesCompatParcelizer).IconCompatParcelizer(onaddqueueitem).AudioAttributesImplBaseParcelizer();
                } else {
                    this.AudioAttributesCompatParcelizer = onaddqueueitem;
                }
                this.IconCompatParcelizer |= 8;
                return this;
            }

            private write AudioAttributesCompatParcelizer(onPlay onplay) {
                if ((this.IconCompatParcelizer & 16) == 16 && this.MediaBrowserCompatCustomActionResultReceiver != onPlay.IconCompatParcelizer()) {
                    this.MediaBrowserCompatCustomActionResultReceiver = onPlay.write(this.MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer(onplay).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver = onplay;
                }
                this.IconCompatParcelizer |= 16;
                return this;
            }
        }
    }

    public static final class onAddQueueItem extends HomeLessonIndexV2 implements setNewTagToShow {
        public static getParentMcqId<onAddQueueItem> read = new setReadTime<onAddQueueItem>() { // from class: o.setActiveRecallQbankId.onAddQueueItem.1
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return AudioAttributesCompatParcelizer(setslidescount, setsteptype);
            }

            private static onAddQueueItem AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new onAddQueueItem(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final onAddQueueItem write;
        private byte AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private final setVideoAspectRatio MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;

        /* synthetic */ onAddQueueItem(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ onAddQueueItem(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaDescriptionCompat();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaMetadataCompat();
        }

        private onAddQueueItem(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private onAddQueueItem() {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = setVideoAspectRatio.write;
        }

        public static onAddQueueItem AudioAttributesCompatParcelizer() {
            return write;
        }

        private static onAddQueueItem MediaMetadataCompat() {
            return write;
        }

        private onAddQueueItem(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            AudioAttributesImplBaseParcelizer();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 10) {
                                    if (!z2) {
                                        this.AudioAttributesImplBaseParcelizer = new ArrayList();
                                        z2 = true;
                                    }
                                    this.AudioAttributesImplBaseParcelizer.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 16) {
                                    this.RemoteActionCompatParcelizer |= 1;
                                    this.IconCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new LessonTabItem(e.getMessage()).write(this);
                        }
                    } catch (LessonTabItem e2) {
                        throw e2.write(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if (z2) {
                this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            onAddQueueItem onaddqueueitem = new onAddQueueItem();
            write = onaddqueueitem;
            onaddqueueitem.AudioAttributesImplBaseParcelizer();
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> write() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        private int MediaBrowserCompatMediaItem() {
            return this.AudioAttributesImplBaseParcelizer.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(int i) {
            return this.AudioAttributesImplBaseParcelizer.get(i);
        }

        public final boolean RemoteActionCompatParcelizer() {
            return (this.RemoteActionCompatParcelizer & 1) == 1;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        private void AudioAttributesImplBaseParcelizer() {
            this.AudioAttributesImplBaseParcelizer = Collections.emptyList();
            this.IconCompatParcelizer = -1;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesCompatParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < MediaBrowserCompatMediaItem(); i++) {
                if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesCompatParcelizer = (byte) 0;
                    return false;
                }
            }
            this.AudioAttributesCompatParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(1, this.AudioAttributesImplBaseParcelizer.get(i));
            }
            if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(2, this.IconCompatParcelizer);
            }
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = 0;
            for (int i2 = 0; i2 < this.AudioAttributesImplBaseParcelizer.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(1, this.AudioAttributesImplBaseParcelizer.get(i2));
            }
            if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.IconCompatParcelizer);
            }
            int iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer + this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi26Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static write MediaBrowserCompatSearchResultReceiver() {
            return write.AudioAttributesImplApi26Parcelizer();
        }

        private static write MediaDescriptionCompat() {
            return MediaBrowserCompatSearchResultReceiver();
        }

        public static write IconCompatParcelizer(onAddQueueItem onaddqueueitem) {
            return MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(onaddqueueitem);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
        public final write RatingCompat() {
            return IconCompatParcelizer(this);
        }

        public static final class write extends HomeLessonIndexV2.RemoteActionCompatParcelizer<onAddQueueItem, write> implements setNewTagToShow {
            private int write;
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> IconCompatParcelizer = Collections.emptyList();
            private int AudioAttributesCompatParcelizer = -1;

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return RatingCompat();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return RatingCompat();
            }

            private write() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static write AudioAttributesImplApi26Parcelizer() {
                return new write();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
            public write clone() {
                return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(AudioAttributesImplBaseParcelizer());
            }

            private static onAddQueueItem RatingCompat() {
                return onAddQueueItem.AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public onAddQueueItem write() {
                onAddQueueItem onaddqueueitemAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                if (onaddqueueitemAudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return onaddqueueitemAudioAttributesImplBaseParcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            public final onAddQueueItem AudioAttributesImplBaseParcelizer() {
                onAddQueueItem onaddqueueitem = new onAddQueueItem((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) 0);
                int i = this.write;
                if ((i & 1) == 1) {
                    this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                    this.write &= -2;
                }
                onaddqueueitem.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer;
                byte b = (i & 2) == 2 ? (byte) 1 : (byte) 0;
                onaddqueueitem.IconCompatParcelizer = this.AudioAttributesCompatParcelizer;
                onaddqueueitem.RemoteActionCompatParcelizer = b;
                return onaddqueueitem;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final write IconCompatParcelizer(onAddQueueItem onaddqueueitem) {
                if (onaddqueueitem == onAddQueueItem.AudioAttributesCompatParcelizer()) {
                    return this;
                }
                if (!onaddqueueitem.AudioAttributesImplBaseParcelizer.isEmpty()) {
                    if (this.IconCompatParcelizer.isEmpty()) {
                        this.IconCompatParcelizer = onaddqueueitem.AudioAttributesImplBaseParcelizer;
                        this.write &= -2;
                    } else {
                        MediaBrowserCompatItemReceiver();
                        this.IconCompatParcelizer.addAll(onaddqueueitem.AudioAttributesImplBaseParcelizer);
                    }
                }
                if (onaddqueueitem.RemoteActionCompatParcelizer()) {
                    write(onaddqueueitem.IconCompatParcelizer());
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(onaddqueueitem.MediaBrowserCompatItemReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < handleMediaPlayPauseIfPendingOnHandler(); i++) {
                    if (!RemoteActionCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.onAddQueueItem.write read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$onAddQueueItem> r0 = o.setActiveRecallQbankId.onAddQueueItem.read     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$onAddQueueItem r2 = (o.setActiveRecallQbankId.onAddQueueItem) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$onAddQueueItem r3 = (o.setActiveRecallQbankId.onAddQueueItem) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.onAddQueueItem.write.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$onAddQueueItem$write");
            }

            private void MediaBrowserCompatItemReceiver() {
                if ((this.write & 1) != 1) {
                    this.IconCompatParcelizer = new ArrayList(this.IconCompatParcelizer);
                    this.write |= 1;
                }
            }

            private int handleMediaPlayPauseIfPendingOnHandler() {
                return this.IconCompatParcelizer.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(int i) {
                return this.IconCompatParcelizer.get(i);
            }

            private write write(int i) {
                this.write |= 2;
                this.AudioAttributesCompatParcelizer = i;
                return this;
            }
        }
    }

    public static final class write extends HomeLessonIndexV2.read<write> implements setBooleanFlags {
        private static final write RemoteActionCompatParcelizer;
        public static getParentMcqId<write> write = new setReadTime<write>() { // from class: o.setActiveRecallQbankId.write.2
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return AudioAttributesCompatParcelizer(setslidescount, setsteptype);
            }

            private static write AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new write(setslidescount, setsteptype, (byte) 0);
            }
        };
        private int AudioAttributesCompatParcelizer;
        private List<handleMediaPlayPauseIfPendingOnHandler> AudioAttributesImplApi21Parcelizer;
        private List<Integer> AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private final setVideoAspectRatio MediaBrowserCompatItemReceiver;
        private byte read;

        /* synthetic */ write(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ write(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaMetadataCompat();
        }

        private write(HomeLessonIndexV2.AudioAttributesCompatParcelizer<write, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.read = (byte) -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private write() {
            this.read = (byte) -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.MediaBrowserCompatItemReceiver = setVideoAspectRatio.write;
        }

        public static write RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }

        private static write MediaMetadataCompat() {
            return RemoteActionCompatParcelizer;
        }

        private write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.read = (byte) -1;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            MediaBrowserCompatItemReceiver();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                    this.IconCompatParcelizer |= 1;
                                    this.AudioAttributesCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 18) {
                                    if ((i & 2) != 2) {
                                        this.AudioAttributesImplApi21Parcelizer = new ArrayList();
                                        i |= 2;
                                    }
                                    this.AudioAttributesImplApi21Parcelizer.add((handleMediaPlayPauseIfPendingOnHandler) setslidescount.RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler.write, setsteptype));
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 248) {
                                    if ((i & 4) != 4) {
                                        this.AudioAttributesImplBaseParcelizer = new ArrayList();
                                        i |= 4;
                                    }
                                    this.AudioAttributesImplBaseParcelizer.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 250) {
                                    int iRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                    if ((i & 4) != 4 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                        this.AudioAttributesImplBaseParcelizer = new ArrayList();
                                        i |= 4;
                                    }
                                    while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                        this.AudioAttributesImplBaseParcelizer.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                    }
                                    setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (LessonTabItem e) {
                            throw e.write(this);
                        }
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi21Parcelizer);
                    }
                    if ((i & 4) == 4) {
                        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if ((i & 2) == 2) {
                this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi21Parcelizer);
            }
            if ((i & 4) == 4) {
                this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            write writeVar = new write();
            RemoteActionCompatParcelizer = writeVar;
            writeVar.MediaBrowserCompatItemReceiver();
        }

        public final boolean IconCompatParcelizer() {
            return (this.IconCompatParcelizer & 1) == 1;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final List<handleMediaPlayPauseIfPendingOnHandler> write() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        private int MediaDescriptionCompat() {
            return this.AudioAttributesImplApi21Parcelizer.size();
        }

        private handleMediaPlayPauseIfPendingOnHandler IconCompatParcelizer(int i) {
            return this.AudioAttributesImplApi21Parcelizer.get(i);
        }

        private List<Integer> MediaBrowserCompatSearchResultReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        private void MediaBrowserCompatItemReceiver() {
            this.AudioAttributesCompatParcelizer = 6;
            this.AudioAttributesImplApi21Parcelizer = Collections.emptyList();
            this.AudioAttributesImplBaseParcelizer = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.read;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < MediaDescriptionCompat(); i++) {
                if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.read = (byte) 0;
                    return false;
                }
            }
            if (!onSkipToQueueItem()) {
                this.read = (byte) 0;
                return false;
            }
            this.read = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.IconCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.AudioAttributesCompatParcelizer);
            }
            for (int i = 0; i < this.AudioAttributesImplApi21Parcelizer.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(2, this.AudioAttributesImplApi21Parcelizer.get(i));
            }
            for (int i2 = 0; i2 < this.AudioAttributesImplBaseParcelizer.size(); i2++) {
                setresumeexplanation.write(31, this.AudioAttributesImplBaseParcelizer.get(i2).intValue());
            }
            sessionImpl.read(19000, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.IconCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.AudioAttributesCompatParcelizer) : 0;
            for (int i2 = 0; i2 < this.AudioAttributesImplApi21Parcelizer.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(2, this.AudioAttributesImplApi21Parcelizer.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.AudioAttributesImplBaseParcelizer.size(); i4++) {
                i3 += setResumeExplanation.read(this.AudioAttributesImplBaseParcelizer.get(i4).intValue());
            }
            int size = iAudioAttributesCompatParcelizer + i3 + (MediaBrowserCompatSearchResultReceiver().size() << 1) + onSkipToPrevious() + this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.MediaBrowserCompatCustomActionResultReceiver = size;
            return size;
        }

        private static read AudioAttributesImplBaseParcelizer() {
            return read.AudioAttributesImplBaseParcelizer();
        }

        private static read MediaBrowserCompatMediaItem() {
            return AudioAttributesImplBaseParcelizer();
        }

        private static read read(write writeVar) {
            return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(writeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
        public read RatingCompat() {
            return read(this);
        }

        public static final class read extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<write, read> implements setBooleanFlags {
            private int AudioAttributesCompatParcelizer;
            private int write = 6;
            private List<handleMediaPlayPauseIfPendingOnHandler> read = Collections.emptyList();
            private List<Integer> IconCompatParcelizer = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCustomAction();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCustomAction();
            }

            private read() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static read AudioAttributesImplBaseParcelizer() {
                return new read();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: merged with bridge method [inline-methods] */
            public read clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(onCommand());
            }

            private static write onCustomAction() {
                return write.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public write write() {
                write writeVarOnCommand = onCommand();
                if (writeVarOnCommand.MediaBrowserCompatCustomActionResultReceiver()) {
                    return writeVarOnCommand;
                }
                throw MediaBrowserCompatMediaItem();
            }

            private write onCommand() {
                write writeVar = new write((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) 0);
                byte b = (this.AudioAttributesCompatParcelizer & 1) == 1 ? (byte) 1 : (byte) 0;
                writeVar.AudioAttributesCompatParcelizer = this.write;
                if ((this.AudioAttributesCompatParcelizer & 2) == 2) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.AudioAttributesCompatParcelizer &= -3;
                }
                writeVar.AudioAttributesImplApi21Parcelizer = this.read;
                if ((this.AudioAttributesCompatParcelizer & 4) == 4) {
                    this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                    this.AudioAttributesCompatParcelizer &= -5;
                }
                writeVar.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer;
                writeVar.IconCompatParcelizer = b;
                return writeVar;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final read IconCompatParcelizer(write writeVar) {
                if (writeVar == write.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (writeVar.IconCompatParcelizer()) {
                    write(writeVar.AudioAttributesCompatParcelizer());
                }
                if (!writeVar.AudioAttributesImplApi21Parcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = writeVar.AudioAttributesImplApi21Parcelizer;
                        this.AudioAttributesCompatParcelizer &= -3;
                    } else {
                        AudioAttributesImplApi26Parcelizer();
                        this.read.addAll(writeVar.AudioAttributesImplApi21Parcelizer);
                    }
                }
                if (!writeVar.AudioAttributesImplBaseParcelizer.isEmpty()) {
                    if (this.IconCompatParcelizer.isEmpty()) {
                        this.IconCompatParcelizer = writeVar.AudioAttributesImplBaseParcelizer;
                        this.AudioAttributesCompatParcelizer &= -5;
                    } else {
                        RatingCompat();
                        this.IconCompatParcelizer.addAll(writeVar.AudioAttributesImplBaseParcelizer);
                    }
                }
                write(writeVar);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(writeVar.MediaBrowserCompatItemReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < onAddQueueItem(); i++) {
                    if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.write.read read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$write> r0 = o.setActiveRecallQbankId.write.write     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$write r2 = (o.setActiveRecallQbankId.write) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$write r3 = (o.setActiveRecallQbankId.write) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.write.read.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$write$read");
            }

            private read write(int i) {
                this.AudioAttributesCompatParcelizer |= 1;
                this.write = i;
                return this;
            }

            private void AudioAttributesImplApi26Parcelizer() {
                if ((this.AudioAttributesCompatParcelizer & 2) != 2) {
                    this.read = new ArrayList(this.read);
                    this.AudioAttributesCompatParcelizer |= 2;
                }
            }

            private int onAddQueueItem() {
                return this.read.size();
            }

            private handleMediaPlayPauseIfPendingOnHandler IconCompatParcelizer(int i) {
                return this.read.get(i);
            }

            private void RatingCompat() {
                if ((this.AudioAttributesCompatParcelizer & 4) != 4) {
                    this.IconCompatParcelizer = new ArrayList(this.IconCompatParcelizer);
                    this.AudioAttributesCompatParcelizer |= 4;
                }
            }
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends HomeLessonIndexV2.read<AudioAttributesImplApi26Parcelizer> implements setHighYieldIds {
        public static getParentMcqId<AudioAttributesImplApi26Parcelizer> AudioAttributesCompatParcelizer = new setReadTime<AudioAttributesImplApi26Parcelizer>() { // from class: o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer.4
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return IconCompatParcelizer(setslidescount, setsteptype);
            }

            private static AudioAttributesImplApi26Parcelizer IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new AudioAttributesImplApi26Parcelizer(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final AudioAttributesImplApi26Parcelizer RemoteActionCompatParcelizer;
        private byte AudioAttributesImplApi21Parcelizer;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private List<Integer> IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatSearchResultReceiver;
        private List<handleMediaPlayPauseIfPendingOnHandler> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private int RatingCompat;
        private List<onCustomAction> handleMediaPlayPauseIfPendingOnHandler;
        private final setVideoAspectRatio onAddQueueItem;
        private onAddQueueItem onCommand;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onCustomAction;
        private List<Integer> onMediaButtonEvent;
        private int read;
        private int write;

        /* synthetic */ AudioAttributesImplApi26Parcelizer(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ AudioAttributesImplApi26Parcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onSetPlaybackSpeed();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onPrepareFromUri();
        }

        private AudioAttributesImplApi26Parcelizer(HomeLessonIndexV2.AudioAttributesCompatParcelizer<AudioAttributesImplApi26Parcelizer, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.write = -1;
            this.AudioAttributesImplApi21Parcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.onAddQueueItem = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private AudioAttributesImplApi26Parcelizer() {
            this.write = -1;
            this.AudioAttributesImplApi21Parcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.onAddQueueItem = setVideoAspectRatio.write;
        }

        public static AudioAttributesImplApi26Parcelizer RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }

        private static AudioAttributesImplApi26Parcelizer onPrepareFromUri() {
            return RemoteActionCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private AudioAttributesImplApi26Parcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.write = -1;
            this.AudioAttributesImplApi21Parcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            onPrepareFromSearch();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? Write = 1024;
                if (z) {
                    if (((i == true ? 1 : 0) & 32) == 32) {
                        this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                    }
                    if (((i == true ? 1 : 0) & 1024) == 1024) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Collections.unmodifiableList(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    }
                    if (((i == true ? 1 : 0) & 256) == 256) {
                        this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi26Parcelizer);
                    }
                    if (((i == true ? 1 : 0) & 512) == 512) {
                        this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                    }
                    if (((i == true ? 1 : 0) & 4096) == 4096) {
                        this.onMediaButtonEvent = Collections.unmodifiableList(this.onMediaButtonEvent);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.onAddQueueItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th;
                    }
                    this.onAddQueueItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    return;
                }
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        switch (iHandleMediaPlayPauseIfPendingOnHandler) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.read |= 2;
                                this.MediaBrowserCompatMediaItem = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 16:
                                this.read |= 4;
                                this.RatingCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 26:
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat = (this.read & 8) == 8 ? this.onCustomAction.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.onCustomAction = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                    this.onCustomAction = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.read |= 8;
                                break;
                            case 34:
                                int i2 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i2 != 32) {
                                    this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.handleMediaPlayPauseIfPendingOnHandler.add((onCustomAction) setslidescount.RemoteActionCompatParcelizer(onCustomAction.read, setsteptype));
                                break;
                            case 42:
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat2 = (this.read & 32) == 32 ? this.MediaBrowserCompatSearchResultReceiver.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.MediaBrowserCompatSearchResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                                if (writeVarRatingCompat2 != null) {
                                    writeVarRatingCompat2.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2);
                                    this.MediaBrowserCompatSearchResultReceiver = writeVarRatingCompat2.AudioAttributesImplApi26Parcelizer();
                                }
                                this.read |= 32;
                                break;
                            case 50:
                                int i3 = (i == true ? 1 : 0) & 1024;
                                i = i;
                                if (i3 != 1024) {
                                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1024;
                                }
                                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add((handleMediaPlayPauseIfPendingOnHandler) setslidescount.RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler.write, setsteptype));
                                break;
                            case 56:
                                this.read |= 16;
                                this.MediaMetadataCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 64:
                                this.read |= 64;
                                this.MediaDescriptionCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 72:
                                this.read |= 1;
                                this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 82:
                                int i4 = (i == true ? 1 : 0) & 256;
                                i = i;
                                if (i4 != 256) {
                                    this.AudioAttributesImplApi26Parcelizer = new ArrayList();
                                    i = (i == true ? 1 : 0) | 256;
                                }
                                this.AudioAttributesImplApi26Parcelizer.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                                break;
                            case 88:
                                int i5 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i5 != 512) {
                                    this.IconCompatParcelizer = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                this.IconCompatParcelizer.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                break;
                            case 90:
                                int iRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                int i6 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i6 != 512) {
                                    i = i;
                                    if (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                        this.IconCompatParcelizer = new ArrayList();
                                        i = (i == true ? 1 : 0) | 512;
                                    }
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.IconCompatParcelizer.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                                break;
                            case 242:
                                onAddQueueItem.write writeVarRatingCompat3 = (this.read & 128) == 128 ? this.onCommand.RatingCompat() : null;
                                onAddQueueItem onaddqueueitem = (onAddQueueItem) setslidescount.RemoteActionCompatParcelizer(onAddQueueItem.read, setsteptype);
                                this.onCommand = onaddqueueitem;
                                if (writeVarRatingCompat3 != null) {
                                    writeVarRatingCompat3.IconCompatParcelizer(onaddqueueitem);
                                    this.onCommand = writeVarRatingCompat3.AudioAttributesImplBaseParcelizer();
                                }
                                this.read |= 128;
                                break;
                            case 248:
                                int i7 = (i == true ? 1 : 0) & 4096;
                                i = i;
                                if (i7 != 4096) {
                                    this.onMediaButtonEvent = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4096;
                                }
                                this.onMediaButtonEvent.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                break;
                            case 250:
                                int iRemoteActionCompatParcelizer2 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                int i8 = (i == true ? 1 : 0) & 4096;
                                i = i;
                                if (i8 != 4096) {
                                    i = i;
                                    if (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                        this.onMediaButtonEvent = new ArrayList();
                                        i = (i == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onMediaButtonEvent.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2);
                                break;
                            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                                AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizerRatingCompat = (this.read & 256) == 256 ? this.MediaBrowserCompatItemReceiver.RatingCompat() : null;
                                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer.read, setsteptype);
                                this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer;
                                if (iconCompatParcelizerRatingCompat != null) {
                                    iconCompatParcelizerRatingCompat.IconCompatParcelizer(audioAttributesCompatParcelizer);
                                    this.MediaBrowserCompatItemReceiver = iconCompatParcelizerRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.read |= 256;
                                break;
                            default:
                                Write = write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler);
                                if (Write == 0) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        if (((i == true ? 1 : 0) & 32) == 32) {
                            this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                        }
                        if (((i == true ? 1 : 0) & 1024) == Write) {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Collections.unmodifiableList(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        }
                        if (((i == true ? 1 : 0) & 256) == 256) {
                            this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(this.AudioAttributesImplApi26Parcelizer);
                        }
                        if (((i == true ? 1 : 0) & 512) == 512) {
                            this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                        }
                        if (((i == true ? 1 : 0) & 4096) == 4096) {
                            this.onMediaButtonEvent = Collections.unmodifiableList(this.onMediaButtonEvent);
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.onAddQueueItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th3;
                        }
                        this.onAddQueueItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th2;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
        }

        static {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer = audioAttributesImplApi26Parcelizer;
            audioAttributesImplApi26Parcelizer.onPrepareFromSearch();
        }

        public final boolean onPause() {
            return (this.read & 1) == 1;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean onMediaButtonEvent() {
            return (this.read & 2) == 2;
        }

        public final int MediaDescriptionCompat() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final boolean onPlayFromMediaId() {
            return (this.read & 4) == 4;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.RatingCompat;
        }

        public final boolean onPlayFromSearch() {
            return (this.read & 8) == 8;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaMetadataCompat() {
            return this.onCustomAction;
        }

        public final boolean onPlayFromUri() {
            return (this.read & 16) == 16;
        }

        public final int handleMediaPlayPauseIfPendingOnHandler() {
            return this.MediaMetadataCompat;
        }

        public final List<onCustomAction> onCommand() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        private int onSeekTo() {
            return this.handleMediaPlayPauseIfPendingOnHandler.size();
        }

        private onCustomAction read(int i) {
            return this.handleMediaPlayPauseIfPendingOnHandler.get(i);
        }

        public final boolean onPlay() {
            return (this.read & 32) == 32;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final boolean onFastForward() {
            return (this.read & 64) == 64;
        }

        public final int MediaBrowserCompatMediaItem() {
            return this.MediaDescriptionCompat;
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        private int onRewind() {
            return this.AudioAttributesImplApi26Parcelizer.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(int i) {
            return this.AudioAttributesImplApi26Parcelizer.get(i);
        }

        public final List<Integer> IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<handleMediaPlayPauseIfPendingOnHandler> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        private int onRemoveQueueItemAt() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size();
        }

        private handleMediaPlayPauseIfPendingOnHandler IconCompatParcelizer(int i) {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i);
        }

        public final boolean onPrepare() {
            return (this.read & 128) == 128;
        }

        public final onAddQueueItem onCustomAction() {
            return this.onCommand;
        }

        private List<Integer> onRemoveQueueItem() {
            return this.onMediaButtonEvent;
        }

        public final boolean onAddQueueItem() {
            return (this.read & 256) == 256;
        }

        public final AudioAttributesCompatParcelizer write() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private void onPrepareFromSearch() {
            this.MediaBrowserCompatCustomActionResultReceiver = 6;
            this.MediaBrowserCompatMediaItem = 6;
            this.RatingCompat = 0;
            this.onCustomAction = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaMetadataCompat = 0;
            this.handleMediaPlayPauseIfPendingOnHandler = Collections.emptyList();
            this.MediaBrowserCompatSearchResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaDescriptionCompat = 0;
            this.AudioAttributesImplApi26Parcelizer = Collections.emptyList();
            this.IconCompatParcelizer = Collections.emptyList();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Collections.emptyList();
            this.onCommand = onAddQueueItem.AudioAttributesCompatParcelizer();
            this.onMediaButtonEvent = Collections.emptyList();
            this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesImplApi21Parcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!onPlayFromMediaId()) {
                this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                return false;
            }
            if (onPlayFromSearch() && !MediaMetadataCompat().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                return false;
            }
            for (int i = 0; i < onSeekTo(); i++) {
                if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                    return false;
                }
            }
            if (onPlay() && !MediaBrowserCompatSearchResultReceiver().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < onRewind(); i2++) {
                if (!RemoteActionCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < onRemoveQueueItemAt(); i3++) {
                if (!IconCompatParcelizer(i3).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                    return false;
                }
            }
            if (onPrepare() && !onCustomAction().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                return false;
            }
            if (onAddQueueItem() && !write().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.AudioAttributesImplApi21Parcelizer = (byte) 0;
                return false;
            }
            this.AudioAttributesImplApi21Parcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.read & 2) == 2) {
                setresumeexplanation.write(1, this.MediaBrowserCompatMediaItem);
            }
            if ((this.read & 4) == 4) {
                setresumeexplanation.write(2, this.RatingCompat);
            }
            if ((this.read & 8) == 8) {
                setresumeexplanation.IconCompatParcelizer(3, this.onCustomAction);
            }
            for (int i = 0; i < this.handleMediaPlayPauseIfPendingOnHandler.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(4, this.handleMediaPlayPauseIfPendingOnHandler.get(i));
            }
            if ((this.read & 32) == 32) {
                setresumeexplanation.IconCompatParcelizer(5, this.MediaBrowserCompatSearchResultReceiver);
            }
            for (int i2 = 0; i2 < this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size(); i2++) {
                setresumeexplanation.IconCompatParcelizer(6, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i2));
            }
            if ((this.read & 16) == 16) {
                setresumeexplanation.write(7, this.MediaMetadataCompat);
            }
            if ((this.read & 64) == 64) {
                setresumeexplanation.write(8, this.MediaDescriptionCompat);
            }
            if ((this.read & 1) == 1) {
                setresumeexplanation.write(9, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            for (int i3 = 0; i3 < this.AudioAttributesImplApi26Parcelizer.size(); i3++) {
                setresumeexplanation.IconCompatParcelizer(10, this.AudioAttributesImplApi26Parcelizer.get(i3));
            }
            if (IconCompatParcelizer().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(90);
                setresumeexplanation.MediaMetadataCompat(this.write);
            }
            for (int i4 = 0; i4 < this.IconCompatParcelizer.size(); i4++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer.get(i4).intValue());
            }
            if ((this.read & 128) == 128) {
                setresumeexplanation.IconCompatParcelizer(30, this.onCommand);
            }
            for (int i5 = 0; i5 < this.onMediaButtonEvent.size(); i5++) {
                setresumeexplanation.write(31, this.onMediaButtonEvent.get(i5).intValue());
            }
            if ((this.read & 256) == 256) {
                setresumeexplanation.IconCompatParcelizer(32, this.MediaBrowserCompatItemReceiver);
            }
            sessionImpl.read(19000, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.onAddQueueItem);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.read & 2) == 2 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.MediaBrowserCompatMediaItem) : 0;
            if ((this.read & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.RatingCompat);
            }
            if ((this.read & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(3, this.onCustomAction);
            }
            for (int i2 = 0; i2 < this.handleMediaPlayPauseIfPendingOnHandler.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(4, this.handleMediaPlayPauseIfPendingOnHandler.get(i2));
            }
            if ((this.read & 32) == 32) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(5, this.MediaBrowserCompatSearchResultReceiver);
            }
            for (int i3 = 0; i3 < this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size(); i3++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(6, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i3));
            }
            if ((this.read & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(7, this.MediaMetadataCompat);
            }
            if ((this.read & 64) == 64) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(8, this.MediaDescriptionCompat);
            }
            if ((this.read & 1) == 1) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(9, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            for (int i4 = 0; i4 < this.AudioAttributesImplApi26Parcelizer.size(); i4++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(10, this.AudioAttributesImplApi26Parcelizer.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.IconCompatParcelizer.size(); i6++) {
                i5 += setResumeExplanation.read(this.IconCompatParcelizer.get(i6).intValue());
            }
            int i7 = iAudioAttributesCompatParcelizer + i5;
            if (!IconCompatParcelizer().isEmpty()) {
                i7 = i7 + 1 + setResumeExplanation.read(i5);
            }
            this.write = i5;
            if ((this.read & 128) == 128) {
                i7 += setResumeExplanation.read(30, this.onCommand);
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.onMediaButtonEvent.size(); i9++) {
                i8 += setResumeExplanation.read(this.onMediaButtonEvent.get(i9).intValue());
            }
            int size = i7 + i8 + (onRemoveQueueItem().size() << 1);
            if ((this.read & 256) == 256) {
                size += setResumeExplanation.read(32, this.MediaBrowserCompatItemReceiver);
            }
            int iOnSkipToPrevious = size + onSkipToPrevious() + this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        public static AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer(InputStream inputStream, setStepType setsteptype) throws IOException {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(inputStream, setsteptype);
        }

        private static RemoteActionCompatParcelizer onPrepareFromMediaId() {
            return RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        private static RemoteActionCompatParcelizer onSetPlaybackSpeed() {
            return onPrepareFromMediaId();
        }

        private static RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            return onPrepareFromMediaId().IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onSetRepeatMode, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer RatingCompat() {
            return AudioAttributesImplApi21Parcelizer(this);
        }

        public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<AudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer> implements setHighYieldIds {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int MediaBrowserCompatItemReceiver;
            private int write = 6;
            private int MediaBrowserCompatCustomActionResultReceiver = 6;
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<onCustomAction> MediaBrowserCompatSearchResultReceiver = Collections.emptyList();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi21Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> read = Collections.emptyList();
            private List<Integer> RemoteActionCompatParcelizer = Collections.emptyList();
            private List<handleMediaPlayPauseIfPendingOnHandler> MediaMetadataCompat = Collections.emptyList();
            private onAddQueueItem MediaBrowserCompatMediaItem = onAddQueueItem.AudioAttributesCompatParcelizer();
            private List<Integer> MediaDescriptionCompat = Collections.emptyList();
            private AudioAttributesCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onPlay();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onPlay();
            }

            private RemoteActionCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                return new RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public RemoteActionCompatParcelizer clone() {
                return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
            }

            private static AudioAttributesImplApi26Parcelizer onPlay() {
                return AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
            public AudioAttributesImplApi26Parcelizer write() {
                AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
                if (audioAttributesImplApi26ParcelizerHandleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatCustomActionResultReceiver()) {
                    return audioAttributesImplApi26ParcelizerHandleMediaPlayPauseIfPendingOnHandler;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private AudioAttributesImplApi26Parcelizer handleMediaPlayPauseIfPendingOnHandler() {
                AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.AudioAttributesCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                audioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver = this.write;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                audioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem = this.MediaBrowserCompatCustomActionResultReceiver;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                audioAttributesImplApi26Parcelizer.RatingCompat = this.AudioAttributesImplApi26Parcelizer;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                audioAttributesImplApi26Parcelizer.onCustomAction = this.RatingCompat;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                audioAttributesImplApi26Parcelizer.MediaMetadataCompat = this.MediaBrowserCompatItemReceiver;
                if ((this.AudioAttributesCompatParcelizer & 32) == 32) {
                    this.MediaBrowserCompatSearchResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatSearchResultReceiver);
                    this.AudioAttributesCompatParcelizer &= -33;
                }
                audioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatSearchResultReceiver;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                audioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplApi21Parcelizer;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                audioAttributesImplApi26Parcelizer.MediaDescriptionCompat = this.AudioAttributesImplBaseParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 256) == 256) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.AudioAttributesCompatParcelizer &= -257;
                }
                audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer = this.read;
                if ((this.AudioAttributesCompatParcelizer & 512) == 512) {
                    this.RemoteActionCompatParcelizer = Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer &= -513;
                }
                audioAttributesImplApi26Parcelizer.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 1024) == 1024) {
                    this.MediaMetadataCompat = Collections.unmodifiableList(this.MediaMetadataCompat);
                    this.AudioAttributesCompatParcelizer &= -1025;
                }
                audioAttributesImplApi26Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaMetadataCompat;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                audioAttributesImplApi26Parcelizer.onCommand = this.MediaBrowserCompatMediaItem;
                if ((this.AudioAttributesCompatParcelizer & 4096) == 4096) {
                    this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
                    this.AudioAttributesCompatParcelizer &= -4097;
                }
                audioAttributesImplApi26Parcelizer.onMediaButtonEvent = this.MediaDescriptionCompat;
                if ((i & 8192) == 8192) {
                    i2 |= 256;
                }
                audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver = this.IconCompatParcelizer;
                audioAttributesImplApi26Parcelizer.read = i2;
                return audioAttributesImplApi26Parcelizer;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final RemoteActionCompatParcelizer IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
                if (audioAttributesImplApi26Parcelizer == AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (audioAttributesImplApi26Parcelizer.onPause()) {
                    write(audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver());
                }
                if (audioAttributesImplApi26Parcelizer.onMediaButtonEvent()) {
                    AudioAttributesImplBaseParcelizer(audioAttributesImplApi26Parcelizer.MediaDescriptionCompat());
                }
                if (audioAttributesImplApi26Parcelizer.onPlayFromMediaId()) {
                    IconCompatParcelizer(audioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer());
                }
                if (audioAttributesImplApi26Parcelizer.onPlayFromSearch()) {
                    RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer.MediaMetadataCompat());
                }
                if (audioAttributesImplApi26Parcelizer.onPlayFromUri()) {
                    MediaBrowserCompatItemReceiver(audioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler());
                }
                if (!audioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
                    if (this.MediaBrowserCompatSearchResultReceiver.isEmpty()) {
                        this.MediaBrowserCompatSearchResultReceiver = audioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler;
                        this.AudioAttributesCompatParcelizer &= -33;
                    } else {
                        RatingCompat();
                        this.MediaBrowserCompatSearchResultReceiver.addAll(audioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler);
                    }
                }
                if (audioAttributesImplApi26Parcelizer.onPlay()) {
                    AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver());
                }
                if (audioAttributesImplApi26Parcelizer.onFastForward()) {
                    AudioAttributesImplApi26Parcelizer(audioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem());
                }
                if (!audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer;
                        this.AudioAttributesCompatParcelizer &= -257;
                    } else {
                        MediaDescriptionCompat();
                        this.read.addAll(audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer);
                    }
                }
                if (!audioAttributesImplApi26Parcelizer.IconCompatParcelizer.isEmpty()) {
                    if (this.RemoteActionCompatParcelizer.isEmpty()) {
                        this.RemoteActionCompatParcelizer = audioAttributesImplApi26Parcelizer.IconCompatParcelizer;
                        this.AudioAttributesCompatParcelizer &= -513;
                    } else {
                        AudioAttributesImplBaseParcelizer();
                        this.RemoteActionCompatParcelizer.addAll(audioAttributesImplApi26Parcelizer.IconCompatParcelizer);
                    }
                }
                if (!audioAttributesImplApi26Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
                    if (this.MediaMetadataCompat.isEmpty()) {
                        this.MediaMetadataCompat = audioAttributesImplApi26Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                        this.AudioAttributesCompatParcelizer &= -1025;
                    } else {
                        onAddQueueItem();
                        this.MediaMetadataCompat.addAll(audioAttributesImplApi26Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    }
                }
                if (audioAttributesImplApi26Parcelizer.onPrepare()) {
                    IconCompatParcelizer(audioAttributesImplApi26Parcelizer.onCustomAction());
                }
                if (!audioAttributesImplApi26Parcelizer.onMediaButtonEvent.isEmpty()) {
                    if (this.MediaDescriptionCompat.isEmpty()) {
                        this.MediaDescriptionCompat = audioAttributesImplApi26Parcelizer.onMediaButtonEvent;
                        this.AudioAttributesCompatParcelizer &= -4097;
                    } else {
                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        this.MediaDescriptionCompat.addAll(audioAttributesImplApi26Parcelizer.onMediaButtonEvent);
                    }
                }
                if (audioAttributesImplApi26Parcelizer.onAddQueueItem()) {
                    read(audioAttributesImplApi26Parcelizer.write());
                }
                write(audioAttributesImplApi26Parcelizer);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer.onAddQueueItem));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onPlayFromUri()) {
                    return false;
                }
                if (onRewind() && !onFastForward().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i = 0; i < onPlayFromSearch(); i++) {
                    if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                if (onRemoveQueueItem() && !onPause().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i2 = 0; i2 < onPlayFromMediaId(); i2++) {
                    if (!AudioAttributesCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < onPrepare(); i3++) {
                    if (!RemoteActionCompatParcelizer(i3).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                if (!onSeekTo() || onPrepareFromMediaId().MediaBrowserCompatCustomActionResultReceiver()) {
                    return (!onPrepareFromSearch() || onMediaButtonEvent().MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatSearchResultReceiver();
                }
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$AudioAttributesImplApi26Parcelizer> r0 = o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$AudioAttributesImplApi26Parcelizer r2 = (o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$AudioAttributesImplApi26Parcelizer r3 = (o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$AudioAttributesImplApi26Parcelizer$RemoteActionCompatParcelizer");
            }

            private RemoteActionCompatParcelizer write(int i) {
                this.AudioAttributesCompatParcelizer |= 1;
                this.write = i;
                return this;
            }

            private RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i;
                return this;
            }

            private boolean onPlayFromUri() {
                return (this.AudioAttributesCompatParcelizer & 4) == 4;
            }

            private RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 4;
                this.AudioAttributesImplApi26Parcelizer = i;
                return this;
            }

            private boolean onRewind() {
                return (this.AudioAttributesCompatParcelizer & 8) == 8;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onFastForward() {
                return this.RatingCompat;
            }

            private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 8) == 8 && this.RatingCompat != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.RatingCompat).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.RatingCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 8;
                return this;
            }

            private RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(int i) {
                this.AudioAttributesCompatParcelizer |= 16;
                this.MediaBrowserCompatItemReceiver = i;
                return this;
            }

            private void RatingCompat() {
                if ((this.AudioAttributesCompatParcelizer & 32) != 32) {
                    this.MediaBrowserCompatSearchResultReceiver = new ArrayList(this.MediaBrowserCompatSearchResultReceiver);
                    this.AudioAttributesCompatParcelizer |= 32;
                }
            }

            private int onPlayFromSearch() {
                return this.MediaBrowserCompatSearchResultReceiver.size();
            }

            private onCustomAction read(int i) {
                return this.MediaBrowserCompatSearchResultReceiver.get(i);
            }

            private boolean onRemoveQueueItem() {
                return (this.AudioAttributesCompatParcelizer & 64) == 64;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onPause() {
                return this.AudioAttributesImplApi21Parcelizer;
            }

            private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 64) == 64 && this.AudioAttributesImplApi21Parcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.AudioAttributesImplApi21Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.AudioAttributesImplApi21Parcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 64;
                return this;
            }

            private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 128;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }

            private void MediaDescriptionCompat() {
                if ((this.AudioAttributesCompatParcelizer & 256) != 256) {
                    this.read = new ArrayList(this.read);
                    this.AudioAttributesCompatParcelizer |= 256;
                }
            }

            private int onPlayFromMediaId() {
                return this.read.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer(int i) {
                return this.read.get(i);
            }

            private void AudioAttributesImplBaseParcelizer() {
                if ((this.AudioAttributesCompatParcelizer & 512) != 512) {
                    this.RemoteActionCompatParcelizer = new ArrayList(this.RemoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer |= 512;
                }
            }

            private void onAddQueueItem() {
                if ((this.AudioAttributesCompatParcelizer & 1024) != 1024) {
                    this.MediaMetadataCompat = new ArrayList(this.MediaMetadataCompat);
                    this.AudioAttributesCompatParcelizer |= 1024;
                }
            }

            private int onPrepare() {
                return this.MediaMetadataCompat.size();
            }

            private handleMediaPlayPauseIfPendingOnHandler RemoteActionCompatParcelizer(int i) {
                return this.MediaMetadataCompat.get(i);
            }

            private boolean onSeekTo() {
                return (this.AudioAttributesCompatParcelizer & 2048) == 2048;
            }

            private onAddQueueItem onPrepareFromMediaId() {
                return this.MediaBrowserCompatMediaItem;
            }

            private RemoteActionCompatParcelizer IconCompatParcelizer(onAddQueueItem onaddqueueitem) {
                if ((this.AudioAttributesCompatParcelizer & 2048) == 2048 && this.MediaBrowserCompatMediaItem != onAddQueueItem.AudioAttributesCompatParcelizer()) {
                    this.MediaBrowserCompatMediaItem = onAddQueueItem.IconCompatParcelizer(this.MediaBrowserCompatMediaItem).IconCompatParcelizer(onaddqueueitem).AudioAttributesImplBaseParcelizer();
                } else {
                    this.MediaBrowserCompatMediaItem = onaddqueueitem;
                }
                this.AudioAttributesCompatParcelizer |= 2048;
                return this;
            }

            private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                if ((this.AudioAttributesCompatParcelizer & 4096) != 4096) {
                    this.MediaDescriptionCompat = new ArrayList(this.MediaDescriptionCompat);
                    this.AudioAttributesCompatParcelizer |= 4096;
                }
            }

            private boolean onPrepareFromSearch() {
                return (this.AudioAttributesCompatParcelizer & 8192) == 8192;
            }

            private AudioAttributesCompatParcelizer onMediaButtonEvent() {
                return this.IconCompatParcelizer;
            }

            private RemoteActionCompatParcelizer read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                if ((this.AudioAttributesCompatParcelizer & 8192) == 8192 && this.IconCompatParcelizer != AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                    this.IconCompatParcelizer = AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer).IconCompatParcelizer(audioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                }
                this.AudioAttributesCompatParcelizer |= 8192;
                return this;
            }
        }
    }

    public static final class MediaBrowserCompatMediaItem extends HomeLessonIndexV2.read<MediaBrowserCompatMediaItem> implements setLessonActivityStatus {
        public static getParentMcqId<MediaBrowserCompatMediaItem> IconCompatParcelizer = new setReadTime<MediaBrowserCompatMediaItem>() { // from class: o.setActiveRecallQbankId.MediaBrowserCompatMediaItem.1
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return write(setslidescount, setsteptype);
            }

            private static MediaBrowserCompatMediaItem write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new MediaBrowserCompatMediaItem(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final MediaBrowserCompatMediaItem read;
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesImplBaseParcelizer;
        private byte MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatSearchResultReceiver;
        private final setVideoAspectRatio MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private int RatingCompat;
        private int RemoteActionCompatParcelizer;
        private List<onCustomAction> handleMediaPlayPauseIfPendingOnHandler;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onAddQueueItem;
        private handleMediaPlayPauseIfPendingOnHandler onCommand;
        private int onCustomAction;
        private List<Integer> onPlay;
        private List<Integer> write;

        /* synthetic */ MediaBrowserCompatMediaItem(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ MediaBrowserCompatMediaItem(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onSetRepeatMode();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onSeekTo();
        }

        private MediaBrowserCompatMediaItem(HomeLessonIndexV2.AudioAttributesCompatParcelizer<MediaBrowserCompatMediaItem, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private MediaBrowserCompatMediaItem() {
            this.RemoteActionCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setVideoAspectRatio.write;
        }

        public static MediaBrowserCompatMediaItem RemoteActionCompatParcelizer() {
            return read;
        }

        private static MediaBrowserCompatMediaItem onSeekTo() {
            return read;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private MediaBrowserCompatMediaItem(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.RemoteActionCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            onPrepare();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? Write = 256;
                if (z) {
                    if (((i == true ? 1 : 0) & 32) == 32) {
                        this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                    }
                    if (((i == true ? 1 : 0) & 256) == 256) {
                        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
                    }
                    if (((i == true ? 1 : 0) & 512) == 512) {
                        this.write = Collections.unmodifiableList(this.write);
                    }
                    if (((i == true ? 1 : 0) & 8192) == 8192) {
                        this.onPlay = Collections.unmodifiableList(this.onPlay);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th;
                    }
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    return;
                }
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        switch (iHandleMediaPlayPauseIfPendingOnHandler) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.AudioAttributesCompatParcelizer |= 2;
                                this.RatingCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 16:
                                this.AudioAttributesCompatParcelizer |= 4;
                                this.MediaBrowserCompatMediaItem = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 26:
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat = (this.AudioAttributesCompatParcelizer & 8) == 8 ? this.onAddQueueItem.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.onAddQueueItem = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                    this.onAddQueueItem = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.AudioAttributesCompatParcelizer |= 8;
                                break;
                            case 34:
                                int i2 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i2 != 32) {
                                    this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.handleMediaPlayPauseIfPendingOnHandler.add((onCustomAction) setslidescount.RemoteActionCompatParcelizer(onCustomAction.read, setsteptype));
                                break;
                            case 42:
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat2 = (this.AudioAttributesCompatParcelizer & 32) == 32 ? this.MediaBrowserCompatSearchResultReceiver.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.MediaBrowserCompatSearchResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                                if (writeVarRatingCompat2 != null) {
                                    writeVarRatingCompat2.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2);
                                    this.MediaBrowserCompatSearchResultReceiver = writeVarRatingCompat2.AudioAttributesImplApi26Parcelizer();
                                }
                                this.AudioAttributesCompatParcelizer |= 32;
                                break;
                            case 50:
                                handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRatingCompat = (this.AudioAttributesCompatParcelizer & 128) == 128 ? this.onCommand.RatingCompat() : null;
                                handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler = (handleMediaPlayPauseIfPendingOnHandler) setslidescount.RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler.write, setsteptype);
                                this.onCommand = handlemediaplaypauseifpendingonhandler;
                                if (audioAttributesCompatParcelizerRatingCompat != null) {
                                    audioAttributesCompatParcelizerRatingCompat.IconCompatParcelizer(handlemediaplaypauseifpendingonhandler);
                                    this.onCommand = audioAttributesCompatParcelizerRatingCompat.AudioAttributesImplBaseParcelizer();
                                }
                                this.AudioAttributesCompatParcelizer |= 128;
                                break;
                            case 56:
                                this.AudioAttributesCompatParcelizer |= 256;
                                this.AudioAttributesImplApi21Parcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 64:
                                this.AudioAttributesCompatParcelizer |= 512;
                                this.onCustomAction = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 72:
                                this.AudioAttributesCompatParcelizer |= 16;
                                this.MediaDescriptionCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 80:
                                this.AudioAttributesCompatParcelizer |= 64;
                                this.MediaMetadataCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 88:
                                this.AudioAttributesCompatParcelizer |= 1;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 98:
                                int i3 = (i == true ? 1 : 0) & 256;
                                i = i;
                                if (i3 != 256) {
                                    this.AudioAttributesImplBaseParcelizer = new ArrayList();
                                    i = (i == true ? 1 : 0) | 256;
                                }
                                this.AudioAttributesImplBaseParcelizer.add((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype));
                                break;
                            case 104:
                                int i4 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i4 != 512) {
                                    this.write = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                this.write.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                break;
                            case 106:
                                int iRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                int i5 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i5 != 512) {
                                    i = i;
                                    if (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                        this.write = new ArrayList();
                                        i = (i == true ? 1 : 0) | 512;
                                    }
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.write.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                                break;
                            case 248:
                                int i6 = (i == true ? 1 : 0) & 8192;
                                i = i;
                                if (i6 != 8192) {
                                    this.onPlay = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8192;
                                }
                                this.onPlay.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                break;
                            case 250:
                                int iRemoteActionCompatParcelizer2 = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                int i7 = (i == true ? 1 : 0) & 8192;
                                i = i;
                                if (i7 != 8192) {
                                    i = i;
                                    if (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                        this.onPlay = new ArrayList();
                                        i = (i == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.onPlay.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2);
                                break;
                            default:
                                Write = write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler);
                                if (Write == 0) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        if (((i == true ? 1 : 0) & 32) == 32) {
                            this.handleMediaPlayPauseIfPendingOnHandler = Collections.unmodifiableList(this.handleMediaPlayPauseIfPendingOnHandler);
                        }
                        if (((i == true ? 1 : 0) & 256) == Write) {
                            this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableList(this.AudioAttributesImplBaseParcelizer);
                        }
                        if (((i == true ? 1 : 0) & 512) == 512) {
                            this.write = Collections.unmodifiableList(this.write);
                        }
                        if (((i == true ? 1 : 0) & 8192) == 8192) {
                            this.onPlay = Collections.unmodifiableList(this.onPlay);
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th3;
                        }
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th2;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
        }

        static {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem();
            read = mediaBrowserCompatMediaItem;
            mediaBrowserCompatMediaItem.onPrepare();
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return (this.AudioAttributesCompatParcelizer & 1) == 1;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean onFastForward() {
            return (this.AudioAttributesCompatParcelizer & 2) == 2;
        }

        public final int MediaDescriptionCompat() {
            return this.RatingCompat;
        }

        public final boolean onMediaButtonEvent() {
            return (this.AudioAttributesCompatParcelizer & 4) == 4;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final boolean onPlayFromSearch() {
            return (this.AudioAttributesCompatParcelizer & 8) == 8;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatMediaItem() {
            return this.onAddQueueItem;
        }

        public final boolean onPlayFromUri() {
            return (this.AudioAttributesCompatParcelizer & 16) == 16;
        }

        public final int onAddQueueItem() {
            return this.MediaDescriptionCompat;
        }

        public final List<onCustomAction> onCustomAction() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        private int onRewind() {
            return this.handleMediaPlayPauseIfPendingOnHandler.size();
        }

        private onCustomAction read(int i) {
            return this.handleMediaPlayPauseIfPendingOnHandler.get(i);
        }

        public final boolean onPause() {
            return (this.AudioAttributesCompatParcelizer & 32) == 32;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final boolean onPlay() {
            return (this.AudioAttributesCompatParcelizer & 64) == 64;
        }

        public final int MediaMetadataCompat() {
            return this.MediaMetadataCompat;
        }

        public final List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> IconCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        private int onRemoveQueueItemAt() {
            return this.AudioAttributesImplBaseParcelizer.size();
        }

        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(int i) {
            return this.AudioAttributesImplBaseParcelizer.get(i);
        }

        public final List<Integer> write() {
            return this.write;
        }

        public final boolean onPrepareFromSearch() {
            return (this.AudioAttributesCompatParcelizer & 128) == 128;
        }

        public final handleMediaPlayPauseIfPendingOnHandler handleMediaPlayPauseIfPendingOnHandler() {
            return this.onCommand;
        }

        public final boolean onPlayFromMediaId() {
            return (this.AudioAttributesCompatParcelizer & 256) == 256;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final boolean onPrepareFromMediaId() {
            return (this.AudioAttributesCompatParcelizer & 512) == 512;
        }

        public final int onCommand() {
            return this.onCustomAction;
        }

        private List<Integer> onRemoveQueueItem() {
            return this.onPlay;
        }

        private void onPrepare() {
            this.MediaBrowserCompatItemReceiver = 518;
            this.RatingCompat = 2054;
            this.MediaBrowserCompatMediaItem = 0;
            this.onAddQueueItem = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaDescriptionCompat = 0;
            this.handleMediaPlayPauseIfPendingOnHandler = Collections.emptyList();
            this.MediaBrowserCompatSearchResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaMetadataCompat = 0;
            this.AudioAttributesImplBaseParcelizer = Collections.emptyList();
            this.write = Collections.emptyList();
            this.onCommand = handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.onCustomAction = 0;
            this.onPlay = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.MediaBrowserCompatCustomActionResultReceiver;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!onMediaButtonEvent()) {
                this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                return false;
            }
            if (onPlayFromSearch() && !MediaBrowserCompatMediaItem().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                return false;
            }
            for (int i = 0; i < onRewind(); i++) {
                if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                    return false;
                }
            }
            if (onPause() && !MediaBrowserCompatSearchResultReceiver().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < onRemoveQueueItemAt(); i2++) {
                if (!IconCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                    return false;
                }
            }
            if (onPrepareFromSearch() && !handleMediaPlayPauseIfPendingOnHandler().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.MediaBrowserCompatCustomActionResultReceiver = (byte) 0;
                return false;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.AudioAttributesCompatParcelizer & 2) == 2) {
                setresumeexplanation.write(1, this.RatingCompat);
            }
            if ((this.AudioAttributesCompatParcelizer & 4) == 4) {
                setresumeexplanation.write(2, this.MediaBrowserCompatMediaItem);
            }
            if ((this.AudioAttributesCompatParcelizer & 8) == 8) {
                setresumeexplanation.IconCompatParcelizer(3, this.onAddQueueItem);
            }
            for (int i = 0; i < this.handleMediaPlayPauseIfPendingOnHandler.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(4, this.handleMediaPlayPauseIfPendingOnHandler.get(i));
            }
            if ((this.AudioAttributesCompatParcelizer & 32) == 32) {
                setresumeexplanation.IconCompatParcelizer(5, this.MediaBrowserCompatSearchResultReceiver);
            }
            if ((this.AudioAttributesCompatParcelizer & 128) == 128) {
                setresumeexplanation.IconCompatParcelizer(6, this.onCommand);
            }
            if ((this.AudioAttributesCompatParcelizer & 256) == 256) {
                setresumeexplanation.write(7, this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.AudioAttributesCompatParcelizer & 512) == 512) {
                setresumeexplanation.write(8, this.onCustomAction);
            }
            if ((this.AudioAttributesCompatParcelizer & 16) == 16) {
                setresumeexplanation.write(9, this.MediaDescriptionCompat);
            }
            if ((this.AudioAttributesCompatParcelizer & 64) == 64) {
                setresumeexplanation.write(10, this.MediaMetadataCompat);
            }
            if ((this.AudioAttributesCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(11, this.MediaBrowserCompatItemReceiver);
            }
            for (int i2 = 0; i2 < this.AudioAttributesImplBaseParcelizer.size(); i2++) {
                setresumeexplanation.IconCompatParcelizer(12, this.AudioAttributesImplBaseParcelizer.get(i2));
            }
            if (write().size() > 0) {
                setresumeexplanation.MediaMetadataCompat(106);
                setresumeexplanation.MediaMetadataCompat(this.RemoteActionCompatParcelizer);
            }
            for (int i3 = 0; i3 < this.write.size(); i3++) {
                setresumeexplanation.AudioAttributesImplApi26Parcelizer(this.write.get(i3).intValue());
            }
            for (int i4 = 0; i4 < this.onPlay.size(); i4++) {
                setresumeexplanation.write(31, this.onPlay.get(i4).intValue());
            }
            sessionImpl.read(19000, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.AudioAttributesCompatParcelizer & 2) == 2 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.RatingCompat) : 0;
            if ((this.AudioAttributesCompatParcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.MediaBrowserCompatMediaItem);
            }
            if ((this.AudioAttributesCompatParcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(3, this.onAddQueueItem);
            }
            for (int i2 = 0; i2 < this.handleMediaPlayPauseIfPendingOnHandler.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(4, this.handleMediaPlayPauseIfPendingOnHandler.get(i2));
            }
            if ((this.AudioAttributesCompatParcelizer & 32) == 32) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(5, this.MediaBrowserCompatSearchResultReceiver);
            }
            if ((this.AudioAttributesCompatParcelizer & 128) == 128) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(6, this.onCommand);
            }
            if ((this.AudioAttributesCompatParcelizer & 256) == 256) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(7, this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.AudioAttributesCompatParcelizer & 512) == 512) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(8, this.onCustomAction);
            }
            if ((this.AudioAttributesCompatParcelizer & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(9, this.MediaDescriptionCompat);
            }
            if ((this.AudioAttributesCompatParcelizer & 64) == 64) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(10, this.MediaMetadataCompat);
            }
            if ((this.AudioAttributesCompatParcelizer & 1) == 1) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(11, this.MediaBrowserCompatItemReceiver);
            }
            for (int i3 = 0; i3 < this.AudioAttributesImplBaseParcelizer.size(); i3++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(12, this.AudioAttributesImplBaseParcelizer.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.write.size(); i5++) {
                i4 += setResumeExplanation.read(this.write.get(i5).intValue());
            }
            int i6 = iAudioAttributesCompatParcelizer + i4;
            if (!write().isEmpty()) {
                i6 = i6 + 1 + setResumeExplanation.read(i4);
            }
            this.RemoteActionCompatParcelizer = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.onPlay.size(); i8++) {
                i7 += setResumeExplanation.read(this.onPlay.get(i8).intValue());
            }
            int size = i6 + i7 + (onRemoveQueueItem().size() << 1) + onSkipToPrevious() + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi26Parcelizer = size;
            return size;
        }

        private static AudioAttributesCompatParcelizer onPrepareFromUri() {
            return AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static AudioAttributesCompatParcelizer onSetRepeatMode() {
            return onPrepareFromUri();
        }

        private static AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            return onPrepareFromUri().IconCompatParcelizer(mediaBrowserCompatMediaItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onSetShuffleMode, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer RatingCompat() {
            return AudioAttributesImplApi21Parcelizer(this);
        }

        public static final class AudioAttributesCompatParcelizer extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<MediaBrowserCompatMediaItem, AudioAttributesCompatParcelizer> implements setLessonActivityStatus {
            private int AudioAttributesImplApi21Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatSearchResultReceiver;
            private int RemoteActionCompatParcelizer;
            private int write;
            private int AudioAttributesCompatParcelizer = 518;
            private int MediaBrowserCompatItemReceiver = 2054;
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<onCustomAction> MediaMetadataCompat = Collections.emptyList();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi26Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> IconCompatParcelizer = Collections.emptyList();
            private List<Integer> read = Collections.emptyList();
            private handleMediaPlayPauseIfPendingOnHandler MediaDescriptionCompat = handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer();
            private List<Integer> MediaBrowserCompatMediaItem = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onPlayFromMediaId();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onPlayFromMediaId();
            }

            private AudioAttributesCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: merged with bridge method [inline-methods] */
            public AudioAttributesCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(onCustomAction());
            }

            private static MediaBrowserCompatMediaItem onPlayFromMediaId() {
                return MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
            public MediaBrowserCompatMediaItem write() {
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemOnCustomAction = onCustomAction();
                if (mediaBrowserCompatMediaItemOnCustomAction.MediaBrowserCompatCustomActionResultReceiver()) {
                    return mediaBrowserCompatMediaItemOnCustomAction;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private MediaBrowserCompatMediaItem onCustomAction() {
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.write;
                int i2 = (i & 1) == 1 ? 1 : 0;
                mediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                mediaBrowserCompatMediaItem.RatingCompat = this.MediaBrowserCompatItemReceiver;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                mediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem = this.AudioAttributesImplBaseParcelizer;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                mediaBrowserCompatMediaItem.onAddQueueItem = this.RatingCompat;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                mediaBrowserCompatMediaItem.MediaDescriptionCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                if ((this.write & 32) == 32) {
                    this.MediaMetadataCompat = Collections.unmodifiableList(this.MediaMetadataCompat);
                    this.write &= -33;
                }
                mediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler = this.MediaMetadataCompat;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                mediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplApi26Parcelizer;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                mediaBrowserCompatMediaItem.MediaMetadataCompat = this.AudioAttributesImplApi21Parcelizer;
                if ((this.write & 256) == 256) {
                    this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                    this.write &= -257;
                }
                mediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer;
                if ((this.write & 512) == 512) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.write &= -513;
                }
                mediaBrowserCompatMediaItem.write = this.read;
                if ((i & 1024) == 1024) {
                    i2 |= 128;
                }
                mediaBrowserCompatMediaItem.onCommand = this.MediaDescriptionCompat;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                mediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer = this.RemoteActionCompatParcelizer;
                if ((i & 4096) == 4096) {
                    i2 |= 512;
                }
                mediaBrowserCompatMediaItem.onCustomAction = this.MediaBrowserCompatSearchResultReceiver;
                if ((this.write & 8192) == 8192) {
                    this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(this.MediaBrowserCompatMediaItem);
                    this.write &= -8193;
                }
                mediaBrowserCompatMediaItem.onPlay = this.MediaBrowserCompatMediaItem;
                mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer = i2;
                return mediaBrowserCompatMediaItem;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final AudioAttributesCompatParcelizer IconCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
                if (mediaBrowserCompatMediaItem == MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (mediaBrowserCompatMediaItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    read(mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
                }
                if (mediaBrowserCompatMediaItem.onFastForward()) {
                    AudioAttributesImplApi21Parcelizer(mediaBrowserCompatMediaItem.MediaDescriptionCompat());
                }
                if (mediaBrowserCompatMediaItem.onMediaButtonEvent()) {
                    AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver());
                }
                if (mediaBrowserCompatMediaItem.onPlayFromSearch()) {
                    RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem());
                }
                if (mediaBrowserCompatMediaItem.onPlayFromUri()) {
                    MediaBrowserCompatCustomActionResultReceiver(mediaBrowserCompatMediaItem.onAddQueueItem());
                }
                if (!mediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
                    if (this.MediaMetadataCompat.isEmpty()) {
                        this.MediaMetadataCompat = mediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler;
                        this.write &= -33;
                    } else {
                        RatingCompat();
                        this.MediaMetadataCompat.addAll(mediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler);
                    }
                }
                if (mediaBrowserCompatMediaItem.onPause()) {
                    read(mediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver());
                }
                if (mediaBrowserCompatMediaItem.onPlay()) {
                    AudioAttributesImplApi26Parcelizer(mediaBrowserCompatMediaItem.MediaMetadataCompat());
                }
                if (!mediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer.isEmpty()) {
                    if (this.IconCompatParcelizer.isEmpty()) {
                        this.IconCompatParcelizer = mediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer;
                        this.write &= -257;
                    } else {
                        MediaDescriptionCompat();
                        this.IconCompatParcelizer.addAll(mediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer);
                    }
                }
                if (!mediaBrowserCompatMediaItem.write.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = mediaBrowserCompatMediaItem.write;
                        this.write &= -513;
                    } else {
                        AudioAttributesImplApi26Parcelizer();
                        this.read.addAll(mediaBrowserCompatMediaItem.write);
                    }
                }
                if (mediaBrowserCompatMediaItem.onPrepareFromSearch()) {
                    write(mediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler());
                }
                if (mediaBrowserCompatMediaItem.onPlayFromMediaId()) {
                    write(mediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer());
                }
                if (mediaBrowserCompatMediaItem.onPrepareFromMediaId()) {
                    MediaBrowserCompatItemReceiver(mediaBrowserCompatMediaItem.onCommand());
                }
                if (!mediaBrowserCompatMediaItem.onPlay.isEmpty()) {
                    if (this.MediaBrowserCompatMediaItem.isEmpty()) {
                        this.MediaBrowserCompatMediaItem = mediaBrowserCompatMediaItem.onPlay;
                        this.write &= -8193;
                    } else {
                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        this.MediaBrowserCompatMediaItem.addAll(mediaBrowserCompatMediaItem.onPlay);
                    }
                }
                write(mediaBrowserCompatMediaItem);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onPlayFromSearch()) {
                    return false;
                }
                if (onPrepareFromSearch() && !onPause().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i = 0; i < onMediaButtonEvent(); i++) {
                    if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                if (onPlayFromUri() && !onFastForward().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i2 = 0; i2 < onAddQueueItem(); i2++) {
                    if (!RemoteActionCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return (!onPrepare() || onPlay().MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$MediaBrowserCompatMediaItem> r0 = o.setActiveRecallQbankId.MediaBrowserCompatMediaItem.IconCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$MediaBrowserCompatMediaItem r2 = (o.setActiveRecallQbankId.MediaBrowserCompatMediaItem) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$MediaBrowserCompatMediaItem r3 = (o.setActiveRecallQbankId.MediaBrowserCompatMediaItem) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaBrowserCompatMediaItem$AudioAttributesCompatParcelizer");
            }

            private AudioAttributesCompatParcelizer read(int i) {
                this.write |= 1;
                this.AudioAttributesCompatParcelizer = i;
                return this;
            }

            private AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer(int i) {
                this.write |= 2;
                this.MediaBrowserCompatItemReceiver = i;
                return this;
            }

            private boolean onPlayFromSearch() {
                return (this.write & 4) == 4;
            }

            private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                this.write |= 4;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }

            private boolean onPrepareFromSearch() {
                return (this.write & 8) == 8;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onPause() {
                return this.RatingCompat;
            }

            private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.write & 8) == 8 && this.RatingCompat != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.RatingCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.RatingCompat).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.RatingCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.write |= 8;
                return this;
            }

            private AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(int i) {
                this.write |= 16;
                this.MediaBrowserCompatCustomActionResultReceiver = i;
                return this;
            }

            private void RatingCompat() {
                if ((this.write & 32) != 32) {
                    this.MediaMetadataCompat = new ArrayList(this.MediaMetadataCompat);
                    this.write |= 32;
                }
            }

            private int onMediaButtonEvent() {
                return this.MediaMetadataCompat.size();
            }

            private onCustomAction IconCompatParcelizer(int i) {
                return this.MediaMetadataCompat.get(i);
            }

            private boolean onPlayFromUri() {
                return (this.write & 64) == 64;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onFastForward() {
                return this.AudioAttributesImplApi26Parcelizer;
            }

            private AudioAttributesCompatParcelizer read(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.write & 64) == 64 && this.AudioAttributesImplApi26Parcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.AudioAttributesImplApi26Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.AudioAttributesImplApi26Parcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.write |= 64;
                return this;
            }

            private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer(int i) {
                this.write |= 128;
                this.AudioAttributesImplApi21Parcelizer = i;
                return this;
            }

            private void MediaDescriptionCompat() {
                if ((this.write & 256) != 256) {
                    this.IconCompatParcelizer = new ArrayList(this.IconCompatParcelizer);
                    this.write |= 256;
                }
            }

            private int onAddQueueItem() {
                return this.IconCompatParcelizer.size();
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(int i) {
                return this.IconCompatParcelizer.get(i);
            }

            private void AudioAttributesImplApi26Parcelizer() {
                if ((this.write & 512) != 512) {
                    this.read = new ArrayList(this.read);
                    this.write |= 512;
                }
            }

            private boolean onPrepare() {
                return (this.write & 1024) == 1024;
            }

            private handleMediaPlayPauseIfPendingOnHandler onPlay() {
                return this.MediaDescriptionCompat;
            }

            private AudioAttributesCompatParcelizer write(handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler) {
                if ((this.write & 1024) == 1024 && this.MediaDescriptionCompat != handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer()) {
                    this.MediaDescriptionCompat = handleMediaPlayPauseIfPendingOnHandler.read(this.MediaDescriptionCompat).IconCompatParcelizer(handlemediaplaypauseifpendingonhandler).AudioAttributesImplBaseParcelizer();
                } else {
                    this.MediaDescriptionCompat = handlemediaplaypauseifpendingonhandler;
                }
                this.write |= 1024;
                return this;
            }

            private AudioAttributesCompatParcelizer write(int i) {
                this.write |= 2048;
                this.RemoteActionCompatParcelizer = i;
                return this;
            }

            private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver(int i) {
                this.write |= 4096;
                this.MediaBrowserCompatSearchResultReceiver = i;
                return this;
            }

            private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                if ((this.write & 8192) != 8192) {
                    this.MediaBrowserCompatMediaItem = new ArrayList(this.MediaBrowserCompatMediaItem);
                    this.write |= 8192;
                }
            }
        }
    }

    public static final class handleMediaPlayPauseIfPendingOnHandler extends HomeLessonIndexV2.read<handleMediaPlayPauseIfPendingOnHandler> implements setNewLesson {
        private static final handleMediaPlayPauseIfPendingOnHandler read;
        public static getParentMcqId<handleMediaPlayPauseIfPendingOnHandler> write = new setReadTime<handleMediaPlayPauseIfPendingOnHandler>() { // from class: o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler.4
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return write(setslidescount, setsteptype);
            }

            private static handleMediaPlayPauseIfPendingOnHandler write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new handleMediaPlayPauseIfPendingOnHandler(setslidescount, setsteptype, (byte) 0);
            }
        };
        private byte AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private final setVideoAspectRatio AudioAttributesImplApi26Parcelizer;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatSearchResultReceiver;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaDescriptionCompat;
        private int RemoteActionCompatParcelizer;

        /* synthetic */ handleMediaPlayPauseIfPendingOnHandler(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ handleMediaPlayPauseIfPendingOnHandler(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onFastForward();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onPlay();
        }

        private handleMediaPlayPauseIfPendingOnHandler(HomeLessonIndexV2.AudioAttributesCompatParcelizer<handleMediaPlayPauseIfPendingOnHandler, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private handleMediaPlayPauseIfPendingOnHandler() {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.AudioAttributesImplApi26Parcelizer = setVideoAspectRatio.write;
        }

        public static handleMediaPlayPauseIfPendingOnHandler RemoteActionCompatParcelizer() {
            return read;
        }

        private static handleMediaPlayPauseIfPendingOnHandler onPlay() {
            return read;
        }

        private handleMediaPlayPauseIfPendingOnHandler(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat;
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            onCommand();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                this.IconCompatParcelizer |= 1;
                                this.RemoteActionCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler != 16) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 26) {
                                    writeVarRatingCompat = (this.IconCompatParcelizer & 4) == 4 ? this.AudioAttributesImplBaseParcelizer.RatingCompat() : null;
                                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                    this.AudioAttributesImplBaseParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                    if (writeVarRatingCompat != null) {
                                        writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                        this.AudioAttributesImplBaseParcelizer = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                    }
                                    this.IconCompatParcelizer |= 4;
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 34) {
                                    writeVarRatingCompat = (this.IconCompatParcelizer & 16) == 16 ? this.MediaDescriptionCompat.RatingCompat() : null;
                                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                    this.MediaDescriptionCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                                    if (writeVarRatingCompat != null) {
                                        writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2);
                                        this.MediaDescriptionCompat = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                    }
                                    this.IconCompatParcelizer |= 16;
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 40) {
                                    this.IconCompatParcelizer |= 8;
                                    this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (iHandleMediaPlayPauseIfPendingOnHandler == 48) {
                                    this.IconCompatParcelizer |= 32;
                                    this.MediaBrowserCompatSearchResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            } else {
                                this.IconCompatParcelizer |= 2;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                            }
                        }
                        z = true;
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler = new handleMediaPlayPauseIfPendingOnHandler();
            read = handlemediaplaypauseifpendingonhandler;
            handlemediaplaypauseifpendingonhandler.onCommand();
        }

        public final boolean MediaDescriptionCompat() {
            return (this.IconCompatParcelizer & 1) == 1;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean MediaBrowserCompatSearchResultReceiver() {
            return (this.IconCompatParcelizer & 2) == 2;
        }

        public final int write() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean MediaMetadataCompat() {
            return (this.IconCompatParcelizer & 4) == 4;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean handleMediaPlayPauseIfPendingOnHandler() {
            return (this.IconCompatParcelizer & 8) == 8;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean onCustomAction() {
            return (this.IconCompatParcelizer & 16) == 16;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatItemReceiver() {
            return this.MediaDescriptionCompat;
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return (this.IconCompatParcelizer & 32) == 32;
        }

        public final int MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        private void onCommand() {
            this.RemoteActionCompatParcelizer = 0;
            this.MediaBrowserCompatItemReceiver = 0;
            this.AudioAttributesImplBaseParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.MediaDescriptionCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.MediaBrowserCompatSearchResultReceiver = 0;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesCompatParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!MediaBrowserCompatSearchResultReceiver()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            if (MediaMetadataCompat() && !IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            if (onCustomAction() && !MediaBrowserCompatItemReceiver().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            this.AudioAttributesCompatParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.IconCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.RemoteActionCompatParcelizer);
            }
            if ((this.IconCompatParcelizer & 2) == 2) {
                setresumeexplanation.write(2, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.IconCompatParcelizer & 4) == 4) {
                setresumeexplanation.IconCompatParcelizer(3, this.AudioAttributesImplBaseParcelizer);
            }
            if ((this.IconCompatParcelizer & 16) == 16) {
                setresumeexplanation.IconCompatParcelizer(4, this.MediaDescriptionCompat);
            }
            if ((this.IconCompatParcelizer & 8) == 8) {
                setresumeexplanation.write(5, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.IconCompatParcelizer & 32) == 32) {
                setresumeexplanation.write(6, this.MediaBrowserCompatSearchResultReceiver);
            }
            sessionImpl.read(200, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.IconCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.RemoteActionCompatParcelizer) : 0;
            if ((this.IconCompatParcelizer & 2) == 2) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.IconCompatParcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(3, this.AudioAttributesImplBaseParcelizer);
            }
            if ((this.IconCompatParcelizer & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(4, this.MediaDescriptionCompat);
            }
            if ((this.IconCompatParcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(5, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.IconCompatParcelizer & 32) == 32) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(6, this.MediaBrowserCompatSearchResultReceiver);
            }
            int iOnSkipToPrevious = iAudioAttributesCompatParcelizer + onSkipToPrevious() + this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi21Parcelizer = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        private static AudioAttributesCompatParcelizer onPause() {
            return AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        private static AudioAttributesCompatParcelizer onFastForward() {
            return onPause();
        }

        public static AudioAttributesCompatParcelizer read(handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler) {
            return onPause().IconCompatParcelizer(handlemediaplaypauseifpendingonhandler);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onAddQueueItem, reason: merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer RatingCompat() {
            return read(this);
        }

        public static final class AudioAttributesCompatParcelizer extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<handleMediaPlayPauseIfPendingOnHandler, AudioAttributesCompatParcelizer> implements setNewLesson {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private int read;
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi26Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCustomAction();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCustomAction();
            }

            private AudioAttributesCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                return new AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public AudioAttributesCompatParcelizer clone() {
                return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(AudioAttributesImplBaseParcelizer());
            }

            private static handleMediaPlayPauseIfPendingOnHandler onCustomAction() {
                return handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public handleMediaPlayPauseIfPendingOnHandler write() {
                handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandlerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                if (handlemediaplaypauseifpendingonhandlerAudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return handlemediaplaypauseifpendingonhandlerAudioAttributesImplBaseParcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final handleMediaPlayPauseIfPendingOnHandler AudioAttributesImplBaseParcelizer() {
                handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler = new handleMediaPlayPauseIfPendingOnHandler((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.IconCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                handlemediaplaypauseifpendingonhandler.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                handlemediaplaypauseifpendingonhandler.MediaBrowserCompatItemReceiver = this.read;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                handlemediaplaypauseifpendingonhandler.AudioAttributesImplBaseParcelizer = this.write;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                handlemediaplaypauseifpendingonhandler.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                handlemediaplaypauseifpendingonhandler.MediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                handlemediaplaypauseifpendingonhandler.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplBaseParcelizer;
                handlemediaplaypauseifpendingonhandler.IconCompatParcelizer = i2;
                return handlemediaplaypauseifpendingonhandler;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final AudioAttributesCompatParcelizer IconCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler) {
                if (handlemediaplaypauseifpendingonhandler == handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (handlemediaplaypauseifpendingonhandler.MediaDescriptionCompat()) {
                    IconCompatParcelizer(handlemediaplaypauseifpendingonhandler.AudioAttributesCompatParcelizer());
                }
                if (handlemediaplaypauseifpendingonhandler.MediaBrowserCompatSearchResultReceiver()) {
                    AudioAttributesCompatParcelizer(handlemediaplaypauseifpendingonhandler.write());
                }
                if (handlemediaplaypauseifpendingonhandler.MediaMetadataCompat()) {
                    read(handlemediaplaypauseifpendingonhandler.IconCompatParcelizer());
                }
                if (handlemediaplaypauseifpendingonhandler.handleMediaPlayPauseIfPendingOnHandler()) {
                    RemoteActionCompatParcelizer(handlemediaplaypauseifpendingonhandler.AudioAttributesImplBaseParcelizer());
                }
                if (handlemediaplaypauseifpendingonhandler.onCustomAction()) {
                    RemoteActionCompatParcelizer(handlemediaplaypauseifpendingonhandler.MediaBrowserCompatItemReceiver());
                }
                if (handlemediaplaypauseifpendingonhandler.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    write(handlemediaplaypauseifpendingonhandler.MediaBrowserCompatMediaItem());
                }
                write(handlemediaplaypauseifpendingonhandler);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(handlemediaplaypauseifpendingonhandler.AudioAttributesImplApi26Parcelizer));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onCommand()) {
                    return false;
                }
                if (!onAddQueueItem() || MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatCustomActionResultReceiver()) {
                    return (!onPause() || handleMediaPlayPauseIfPendingOnHandler().MediaBrowserCompatCustomActionResultReceiver()) && MediaBrowserCompatSearchResultReceiver();
                }
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$handleMediaPlayPauseIfPendingOnHandler> r0 = o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler.write     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$handleMediaPlayPauseIfPendingOnHandler r2 = (o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$handleMediaPlayPauseIfPendingOnHandler r3 = (o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$handleMediaPlayPauseIfPendingOnHandler$AudioAttributesCompatParcelizer");
            }

            private AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
                this.IconCompatParcelizer |= 1;
                this.RemoteActionCompatParcelizer = i;
                return this;
            }

            private boolean onCommand() {
                return (this.IconCompatParcelizer & 2) == 2;
            }

            private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                this.IconCompatParcelizer |= 2;
                this.read = i;
                return this;
            }

            private boolean onAddQueueItem() {
                return (this.IconCompatParcelizer & 4) == 4;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return this.write;
            }

            private AudioAttributesCompatParcelizer read(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.IconCompatParcelizer & 4) == 4 && this.write != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.write = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.write).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.IconCompatParcelizer |= 4;
                return this;
            }

            private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                this.IconCompatParcelizer |= 8;
                this.AudioAttributesCompatParcelizer = i;
                return this;
            }

            private boolean onPause() {
                return (this.IconCompatParcelizer & 16) == 16;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver handleMediaPlayPauseIfPendingOnHandler() {
                return this.AudioAttributesImplApi26Parcelizer;
            }

            private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.IconCompatParcelizer & 16) == 16 && this.AudioAttributesImplApi26Parcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.AudioAttributesImplApi26Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.AudioAttributesImplApi26Parcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.IconCompatParcelizer |= 16;
                return this;
            }

            private AudioAttributesCompatParcelizer write(int i) {
                this.IconCompatParcelizer |= 32;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }
        }
    }

    public static final class onCommand extends HomeLessonIndexV2.read<onCommand> implements setMasterOrder {
        public static getParentMcqId<onCommand> RemoteActionCompatParcelizer = new setReadTime<onCommand>() { // from class: o.setActiveRecallQbankId.onCommand.3
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return write(setslidescount, setsteptype);
            }

            private static onCommand write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new onCommand(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final onCommand read;
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private byte AudioAttributesImplBaseParcelizer;
        private List<IconCompatParcelizer> IconCompatParcelizer;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private final setVideoAspectRatio MediaBrowserCompatMediaItem;
        private List<Integer> MediaBrowserCompatSearchResultReceiver;
        private List<onCustomAction> MediaDescriptionCompat;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaMetadataCompat;
        private int RatingCompat;
        private int write;

        /* synthetic */ onCommand(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ onCommand(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onPlayFromSearch();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onPlayFromMediaId();
        }

        private onCommand(HomeLessonIndexV2.AudioAttributesCompatParcelizer<onCommand, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer = (byte) -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.MediaBrowserCompatMediaItem = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private onCommand() {
            this.AudioAttributesImplBaseParcelizer = (byte) -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.MediaBrowserCompatMediaItem = setVideoAspectRatio.write;
        }

        public static onCommand RemoteActionCompatParcelizer() {
            return read;
        }

        private static onCommand onPlayFromMediaId() {
            return read;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private onCommand(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat;
            this.AudioAttributesImplBaseParcelizer = (byte) -1;
            this.MediaBrowserCompatItemReceiver = -1;
            onFastForward();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? Write = 128;
                if (z) {
                    if ((i & 4) == 4) {
                        this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
                    }
                    if ((i & 128) == 128) {
                        this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                    }
                    if ((i & 256) == 256) {
                        this.MediaBrowserCompatSearchResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatSearchResultReceiver);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th;
                    }
                    this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    return;
                }
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        switch (iHandleMediaPlayPauseIfPendingOnHandler) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.write |= 1;
                                this.AudioAttributesImplApi26Parcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 16:
                                this.write |= 2;
                                this.AudioAttributesImplApi21Parcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.MediaDescriptionCompat = new ArrayList();
                                    i |= 4;
                                }
                                this.MediaDescriptionCompat.add((onCustomAction) setslidescount.RemoteActionCompatParcelizer(onCustomAction.read, setsteptype));
                                break;
                            case 34:
                                writeVarRatingCompat = (this.write & 4) == 4 ? this.MediaMetadataCompat.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.MediaMetadataCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                    this.MediaMetadataCompat = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.write |= 4;
                                break;
                            case 40:
                                this.write |= 8;
                                this.RatingCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 50:
                                writeVarRatingCompat = (this.write & 16) == 16 ? this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.MediaBrowserCompatCustomActionResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2);
                                    this.MediaBrowserCompatCustomActionResultReceiver = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.write |= 16;
                                break;
                            case 56:
                                this.write |= 32;
                                this.AudioAttributesCompatParcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.IconCompatParcelizer = new ArrayList();
                                    i |= 128;
                                }
                                this.IconCompatParcelizer.add((IconCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(IconCompatParcelizer.IconCompatParcelizer, setsteptype));
                                break;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.MediaBrowserCompatSearchResultReceiver = new ArrayList();
                                    i |= 256;
                                }
                                this.MediaBrowserCompatSearchResultReceiver.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                break;
                            case 250:
                                int iRemoteActionCompatParcelizer = setslidescount.RemoteActionCompatParcelizer(setslidescount.MediaMetadataCompat());
                                if ((i & 256) != 256 && setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.MediaBrowserCompatSearchResultReceiver = new ArrayList();
                                    i |= 256;
                                }
                                while (setslidescount.AudioAttributesCompatParcelizer() > 0) {
                                    this.MediaBrowserCompatSearchResultReceiver.add(Integer.valueOf(setslidescount.AudioAttributesImplApi26Parcelizer()));
                                }
                                setslidescount.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                                break;
                            default:
                                Write = write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler);
                                if (Write == 0) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        if ((i & 4) == 4) {
                            this.MediaDescriptionCompat = Collections.unmodifiableList(this.MediaDescriptionCompat);
                        }
                        if ((i & 128) == Write) {
                            this.IconCompatParcelizer = Collections.unmodifiableList(this.IconCompatParcelizer);
                        }
                        if ((i & 256) == 256) {
                            this.MediaBrowserCompatSearchResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatSearchResultReceiver);
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th3;
                        }
                        this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th2;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
        }

        static {
            onCommand oncommand = new onCommand();
            read = oncommand;
            oncommand.onFastForward();
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return (this.write & 1) == 1;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean onCustomAction() {
            return (this.write & 2) == 2;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final List<onCustomAction> MediaMetadataCompat() {
            return this.MediaDescriptionCompat;
        }

        private int onMediaButtonEvent() {
            return this.MediaDescriptionCompat.size();
        }

        private onCustomAction read(int i) {
            return this.MediaDescriptionCompat.get(i);
        }

        public final boolean onAddQueueItem() {
            return (this.write & 4) == 4;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatMediaItem() {
            return this.MediaMetadataCompat;
        }

        public final boolean handleMediaPlayPauseIfPendingOnHandler() {
            return (this.write & 8) == 8;
        }

        public final int MediaBrowserCompatSearchResultReceiver() {
            return this.RatingCompat;
        }

        public final boolean MediaDescriptionCompat() {
            return (this.write & 16) == 16;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean onCommand() {
            return (this.write & 32) == 32;
        }

        public final int write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final List<IconCompatParcelizer> AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        private int onPause() {
            return this.IconCompatParcelizer.size();
        }

        private IconCompatParcelizer write(int i) {
            return this.IconCompatParcelizer.get(i);
        }

        private List<Integer> onPrepareFromSearch() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        private void onFastForward() {
            this.AudioAttributesImplApi26Parcelizer = 6;
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.MediaDescriptionCompat = Collections.emptyList();
            this.MediaMetadataCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.RatingCompat = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer = 0;
            this.IconCompatParcelizer = Collections.emptyList();
            this.MediaBrowserCompatSearchResultReceiver = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesImplBaseParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!onCustomAction()) {
                this.AudioAttributesImplBaseParcelizer = (byte) 0;
                return false;
            }
            for (int i = 0; i < onMediaButtonEvent(); i++) {
                if (!read(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplBaseParcelizer = (byte) 0;
                    return false;
                }
            }
            if (onAddQueueItem() && !MediaBrowserCompatMediaItem().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer = (byte) 0;
                return false;
            }
            if (MediaDescriptionCompat() && !IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < onPause(); i2++) {
                if (!write(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplBaseParcelizer = (byte) 0;
                    return false;
                }
            }
            if (!onSkipToQueueItem()) {
                this.AudioAttributesImplBaseParcelizer = (byte) 0;
                return false;
            }
            this.AudioAttributesImplBaseParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.write & 1) == 1) {
                setresumeexplanation.write(1, this.AudioAttributesImplApi26Parcelizer);
            }
            if ((this.write & 2) == 2) {
                setresumeexplanation.write(2, this.AudioAttributesImplApi21Parcelizer);
            }
            for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(3, this.MediaDescriptionCompat.get(i));
            }
            if ((this.write & 4) == 4) {
                setresumeexplanation.IconCompatParcelizer(4, this.MediaMetadataCompat);
            }
            if ((this.write & 8) == 8) {
                setresumeexplanation.write(5, this.RatingCompat);
            }
            if ((this.write & 16) == 16) {
                setresumeexplanation.IconCompatParcelizer(6, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.write & 32) == 32) {
                setresumeexplanation.write(7, this.AudioAttributesCompatParcelizer);
            }
            for (int i2 = 0; i2 < this.IconCompatParcelizer.size(); i2++) {
                setresumeexplanation.IconCompatParcelizer(8, this.IconCompatParcelizer.get(i2));
            }
            for (int i3 = 0; i3 < this.MediaBrowserCompatSearchResultReceiver.size(); i3++) {
                setresumeexplanation.write(31, this.MediaBrowserCompatSearchResultReceiver.get(i3).intValue());
            }
            sessionImpl.read(200, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.MediaBrowserCompatItemReceiver;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.write & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.AudioAttributesImplApi26Parcelizer) : 0;
            if ((this.write & 2) == 2) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.AudioAttributesImplApi21Parcelizer);
            }
            for (int i2 = 0; i2 < this.MediaDescriptionCompat.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(3, this.MediaDescriptionCompat.get(i2));
            }
            if ((this.write & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(4, this.MediaMetadataCompat);
            }
            if ((this.write & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(5, this.RatingCompat);
            }
            if ((this.write & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(6, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.write & 32) == 32) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(7, this.AudioAttributesCompatParcelizer);
            }
            for (int i3 = 0; i3 < this.IconCompatParcelizer.size(); i3++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(8, this.IconCompatParcelizer.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.MediaBrowserCompatSearchResultReceiver.size(); i5++) {
                i4 += setResumeExplanation.read(this.MediaBrowserCompatSearchResultReceiver.get(i5).intValue());
            }
            int size = iAudioAttributesCompatParcelizer + i4 + (onPrepareFromSearch().size() << 1) + onSkipToPrevious() + this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver();
            this.MediaBrowserCompatItemReceiver = size;
            return size;
        }

        public static onCommand read(InputStream inputStream, setStepType setsteptype) throws IOException {
            return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(inputStream, setsteptype);
        }

        private static write onPlay() {
            return write.AudioAttributesImplBaseParcelizer();
        }

        private static write onPlayFromSearch() {
            return onPlay();
        }

        private static write AudioAttributesCompatParcelizer(onCommand oncommand) {
            return onPlay().IconCompatParcelizer(oncommand);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onPrepare, reason: merged with bridge method [inline-methods] */
        public write RatingCompat() {
            return AudioAttributesCompatParcelizer(this);
        }

        public static final class write extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<onCommand, write> implements setMasterOrder {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int write;
            private int RemoteActionCompatParcelizer = 6;
            private List<onCustomAction> MediaBrowserCompatCustomActionResultReceiver = Collections.emptyList();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi21Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<IconCompatParcelizer> read = Collections.emptyList();
            private List<Integer> MediaBrowserCompatItemReceiver = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }

            private write() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static write AudioAttributesImplBaseParcelizer() {
                return new write();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
            public write clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
            }

            private static onCommand MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return onCommand.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: onAddQueueItem, reason: merged with bridge method [inline-methods] */
            public onCommand write() {
                onCommand oncommandHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
                if (oncommandHandleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatCustomActionResultReceiver()) {
                    return oncommandHandleMediaPlayPauseIfPendingOnHandler;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private onCommand handleMediaPlayPauseIfPendingOnHandler() {
                onCommand oncommand = new onCommand((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.AudioAttributesCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                oncommand.AudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                oncommand.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer;
                if ((this.AudioAttributesCompatParcelizer & 4) == 4) {
                    this.MediaBrowserCompatCustomActionResultReceiver = Collections.unmodifiableList(this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesCompatParcelizer &= -5;
                }
                oncommand.MediaDescriptionCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                oncommand.MediaMetadataCompat = this.AudioAttributesImplApi21Parcelizer;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                oncommand.RatingCompat = this.AudioAttributesImplBaseParcelizer;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                oncommand.MediaBrowserCompatCustomActionResultReceiver = this.IconCompatParcelizer;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                oncommand.AudioAttributesCompatParcelizer = this.write;
                if ((this.AudioAttributesCompatParcelizer & 128) == 128) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.AudioAttributesCompatParcelizer &= -129;
                }
                oncommand.IconCompatParcelizer = this.read;
                if ((this.AudioAttributesCompatParcelizer & 256) == 256) {
                    this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(this.MediaBrowserCompatItemReceiver);
                    this.AudioAttributesCompatParcelizer &= -257;
                }
                oncommand.MediaBrowserCompatSearchResultReceiver = this.MediaBrowserCompatItemReceiver;
                oncommand.write = i2;
                return oncommand;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final write IconCompatParcelizer(onCommand oncommand) {
                if (oncommand == onCommand.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (oncommand.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    read(oncommand.MediaBrowserCompatItemReceiver());
                }
                if (oncommand.onCustomAction()) {
                    IconCompatParcelizer(oncommand.AudioAttributesImplBaseParcelizer());
                }
                if (!oncommand.MediaDescriptionCompat.isEmpty()) {
                    if (this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                        this.MediaBrowserCompatCustomActionResultReceiver = oncommand.MediaDescriptionCompat;
                        this.AudioAttributesCompatParcelizer &= -5;
                    } else {
                        MediaDescriptionCompat();
                        this.MediaBrowserCompatCustomActionResultReceiver.addAll(oncommand.MediaDescriptionCompat);
                    }
                }
                if (oncommand.onAddQueueItem()) {
                    AudioAttributesCompatParcelizer(oncommand.MediaBrowserCompatMediaItem());
                }
                if (oncommand.handleMediaPlayPauseIfPendingOnHandler()) {
                    AudioAttributesImplApi21Parcelizer(oncommand.MediaBrowserCompatSearchResultReceiver());
                }
                if (oncommand.MediaDescriptionCompat()) {
                    IconCompatParcelizer(oncommand.IconCompatParcelizer());
                }
                if (oncommand.onCommand()) {
                    RemoteActionCompatParcelizer(oncommand.write());
                }
                if (!oncommand.IconCompatParcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = oncommand.IconCompatParcelizer;
                        this.AudioAttributesCompatParcelizer &= -129;
                    } else {
                        AudioAttributesImplApi26Parcelizer();
                        this.read.addAll(oncommand.IconCompatParcelizer);
                    }
                }
                if (!oncommand.MediaBrowserCompatSearchResultReceiver.isEmpty()) {
                    if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
                        this.MediaBrowserCompatItemReceiver = oncommand.MediaBrowserCompatSearchResultReceiver;
                        this.AudioAttributesCompatParcelizer &= -257;
                    } else {
                        RatingCompat();
                        this.MediaBrowserCompatItemReceiver.addAll(oncommand.MediaBrowserCompatSearchResultReceiver);
                    }
                }
                write(oncommand);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(oncommand.MediaBrowserCompatMediaItem));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (!onPlay()) {
                    return false;
                }
                for (int i = 0; i < onFastForward(); i++) {
                    if (!write(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                if (onPrepareFromMediaId() && !onPlayFromMediaId().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                if (onPause() && !onMediaButtonEvent().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i2 = 0; i2 < onCustomAction(); i2++) {
                    if (!AudioAttributesCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.onCommand.write read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$onCommand> r0 = o.setActiveRecallQbankId.onCommand.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$onCommand r2 = (o.setActiveRecallQbankId.onCommand) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$onCommand r3 = (o.setActiveRecallQbankId.onCommand) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.onCommand.write.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$onCommand$write");
            }

            private write read(int i) {
                this.AudioAttributesCompatParcelizer |= 1;
                this.RemoteActionCompatParcelizer = i;
                return this;
            }

            private boolean onPlay() {
                return (this.AudioAttributesCompatParcelizer & 2) == 2;
            }

            private write IconCompatParcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 2;
                this.AudioAttributesImplApi26Parcelizer = i;
                return this;
            }

            private void MediaDescriptionCompat() {
                if ((this.AudioAttributesCompatParcelizer & 4) != 4) {
                    this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList(this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesCompatParcelizer |= 4;
                }
            }

            private int onFastForward() {
                return this.MediaBrowserCompatCustomActionResultReceiver.size();
            }

            private onCustomAction write(int i) {
                return this.MediaBrowserCompatCustomActionResultReceiver.get(i);
            }

            private boolean onPrepareFromMediaId() {
                return (this.AudioAttributesCompatParcelizer & 8) == 8;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onPlayFromMediaId() {
                return this.AudioAttributesImplApi21Parcelizer;
            }

            private write AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 8) == 8 && this.AudioAttributesImplApi21Parcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.AudioAttributesImplApi21Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.AudioAttributesImplApi21Parcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 8;
                return this;
            }

            private write AudioAttributesImplApi21Parcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 16;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }

            private boolean onPause() {
                return (this.AudioAttributesCompatParcelizer & 32) == 32;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onMediaButtonEvent() {
                return this.IconCompatParcelizer;
            }

            private write IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 32) == 32 && this.IconCompatParcelizer != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.IconCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.IconCompatParcelizer).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.IconCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 32;
                return this;
            }

            private write RemoteActionCompatParcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 64;
                this.write = i;
                return this;
            }

            private void AudioAttributesImplApi26Parcelizer() {
                if ((this.AudioAttributesCompatParcelizer & 128) != 128) {
                    this.read = new ArrayList(this.read);
                    this.AudioAttributesCompatParcelizer |= 128;
                }
            }

            private int onCustomAction() {
                return this.read.size();
            }

            private IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                return this.read.get(i);
            }

            private void RatingCompat() {
                if ((this.AudioAttributesCompatParcelizer & 256) != 256) {
                    this.MediaBrowserCompatItemReceiver = new ArrayList(this.MediaBrowserCompatItemReceiver);
                    this.AudioAttributesCompatParcelizer |= 256;
                }
            }
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends HomeLessonIndexV2.read<AudioAttributesImplApi21Parcelizer> implements setCompletionTimeMs {
        public static getParentMcqId<AudioAttributesImplApi21Parcelizer> RemoteActionCompatParcelizer = new setReadTime<AudioAttributesImplApi21Parcelizer>() { // from class: o.setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer.4
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return write(setslidescount, setsteptype);
            }

            private static AudioAttributesImplApi21Parcelizer write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new AudioAttributesImplApi21Parcelizer(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final AudioAttributesImplApi21Parcelizer read;
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private final setVideoAspectRatio MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private byte write;

        /* synthetic */ AudioAttributesImplApi21Parcelizer(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ AudioAttributesImplApi21Parcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatSearchResultReceiver();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaBrowserCompatItemReceiver();
        }

        private AudioAttributesImplApi21Parcelizer(HomeLessonIndexV2.AudioAttributesCompatParcelizer<AudioAttributesImplApi21Parcelizer, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.write = (byte) -1;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private AudioAttributesImplApi21Parcelizer() {
            this.write = (byte) -1;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = setVideoAspectRatio.write;
        }

        public static AudioAttributesImplApi21Parcelizer RemoteActionCompatParcelizer() {
            return read;
        }

        private static AudioAttributesImplApi21Parcelizer MediaBrowserCompatItemReceiver() {
            return read;
        }

        private AudioAttributesImplApi21Parcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.write = (byte) -1;
            this.IconCompatParcelizer = -1;
            IconCompatParcelizer();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                this.AudioAttributesCompatParcelizer |= 1;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer();
            read = audioAttributesImplApi21Parcelizer;
            audioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        }

        public final boolean write() {
            return (this.AudioAttributesCompatParcelizer & 1) == 1;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private void IconCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver = 0;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.write;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!onSkipToQueueItem()) {
                this.write = (byte) 0;
                return false;
            }
            this.write = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.AudioAttributesCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.MediaBrowserCompatItemReceiver);
            }
            sessionImpl.read(200, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.IconCompatParcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = ((this.AudioAttributesCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.MediaBrowserCompatItemReceiver) : 0) + onSkipToPrevious() + this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.IconCompatParcelizer = iAudioAttributesCompatParcelizer;
            return iAudioAttributesCompatParcelizer;
        }

        private static RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
            return RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
            return AudioAttributesImplBaseParcelizer();
        }

        private static RemoteActionCompatParcelizer IconCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
            return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(audioAttributesImplApi21Parcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer RatingCompat() {
            return IconCompatParcelizer(this);
        }

        public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<AudioAttributesImplApi21Parcelizer, RemoteActionCompatParcelizer> implements setCompletionTimeMs {
            private int read;
            private int write;

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCommand();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCommand();
            }

            private RemoteActionCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public RemoteActionCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(RatingCompat());
            }

            private static AudioAttributesImplApi21Parcelizer onCommand() {
                return AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
            public AudioAttributesImplApi21Parcelizer write() {
                AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerRatingCompat = RatingCompat();
                if (audioAttributesImplApi21ParcelizerRatingCompat.MediaBrowserCompatCustomActionResultReceiver()) {
                    return audioAttributesImplApi21ParcelizerRatingCompat;
                }
                throw MediaBrowserCompatMediaItem();
            }

            private AudioAttributesImplApi21Parcelizer RatingCompat() {
                AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) 0);
                byte b = (this.read & 1) == 1 ? (byte) 1 : (byte) 0;
                audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver = this.write;
                audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer = b;
                return audioAttributesImplApi21Parcelizer;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            public final RemoteActionCompatParcelizer IconCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
                if (audioAttributesImplApi21Parcelizer == AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (audioAttributesImplApi21Parcelizer.write()) {
                    RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer());
                }
                write(audioAttributesImplApi21Parcelizer);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                return MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$AudioAttributesImplApi21Parcelizer> r0 = o.setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$AudioAttributesImplApi21Parcelizer r2 = (o.setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$AudioAttributesImplApi21Parcelizer r3 = (o.setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$AudioAttributesImplApi21Parcelizer$RemoteActionCompatParcelizer");
            }

            private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
                this.read |= 1;
                this.write = i;
                return this;
            }
        }
    }

    public static final class onPause extends HomeLessonIndexV2 implements setMyRating {
        private static final onPause IconCompatParcelizer;
        public static getParentMcqId<onPause> write = new setReadTime<onPause>() { // from class: o.setActiveRecallQbankId.onPause.1
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return read(setslidescount, setsteptype);
            }

            private static onPause read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new onPause(setslidescount, setsteptype, (byte) 0);
            }
        };
        private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private byte AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private final setVideoAspectRatio AudioAttributesImplBaseParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private read MediaMetadataCompat;
        private int RatingCompat;
        private int RemoteActionCompatParcelizer;
        private int read;

        /* synthetic */ onPause(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ onPause(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onMediaButtonEvent();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onPlayFromMediaId();
        }

        private onPause(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.AudioAttributesImplApi21Parcelizer = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private onPause() {
            this.AudioAttributesImplApi21Parcelizer = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.AudioAttributesImplBaseParcelizer = setVideoAspectRatio.write;
        }

        public static onPause RemoteActionCompatParcelizer() {
            return IconCompatParcelizer;
        }

        private static onPause onPlayFromMediaId() {
            return IconCompatParcelizer;
        }

        private onPause(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesImplApi21Parcelizer = (byte) -1;
            this.AudioAttributesImplApi26Parcelizer = -1;
            onCustomAction();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                this.RemoteActionCompatParcelizer |= 1;
                                this.RatingCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 16) {
                                this.RemoteActionCompatParcelizer |= 2;
                                this.MediaBrowserCompatItemReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 24) {
                                int iWrite = setslidescount.write();
                                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = AudioAttributesCompatParcelizer.write(iWrite);
                                if (audioAttributesCompatParcelizerWrite == null) {
                                    setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                    setresumeexplanation.MediaMetadataCompat(iWrite);
                                } else {
                                    this.RemoteActionCompatParcelizer |= 4;
                                    this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizerWrite;
                                }
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 32) {
                                this.RemoteActionCompatParcelizer |= 8;
                                this.read = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 40) {
                                this.RemoteActionCompatParcelizer |= 16;
                                this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 48) {
                                int iWrite2 = setslidescount.write();
                                read readVarRemoteActionCompatParcelizer = read.RemoteActionCompatParcelizer(iWrite2);
                                if (readVarRemoteActionCompatParcelizer == null) {
                                    setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                    setresumeexplanation.MediaMetadataCompat(iWrite2);
                                } else {
                                    this.RemoteActionCompatParcelizer |= 32;
                                    this.MediaMetadataCompat = readVarRemoteActionCompatParcelizer;
                                }
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            onPause onpause = new onPause();
            IconCompatParcelizer = onpause;
            onpause.onCustomAction();
        }

        public enum AudioAttributesCompatParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            private final int read;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer>() { // from class: o.setActiveRecallQbankId.onPause.AudioAttributesCompatParcelizer.1
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer(i);
                    }

                    private static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer.write(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.read;
            }

            public static AudioAttributesCompatParcelizer write(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            AudioAttributesCompatParcelizer(int i) {
                this.read = i;
            }
        }

        public enum read implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            private final int IconCompatParcelizer;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<read>() { // from class: o.setActiveRecallQbankId.onPause.read.3
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return write(i);
                    }

                    private static read write(int i) {
                        return read.RemoteActionCompatParcelizer(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public static read RemoteActionCompatParcelizer(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            read(int i) {
                this.IconCompatParcelizer = i;
            }
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return (this.RemoteActionCompatParcelizer & 1) == 1;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.RatingCompat;
        }

        public final boolean onAddQueueItem() {
            return (this.RemoteActionCompatParcelizer & 2) == 2;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean MediaBrowserCompatMediaItem() {
            return (this.RemoteActionCompatParcelizer & 4) == 4;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean MediaDescriptionCompat() {
            return (this.RemoteActionCompatParcelizer & 8) == 8;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }

        public final boolean MediaMetadataCompat() {
            return (this.RemoteActionCompatParcelizer & 16) == 16;
        }

        public final int write() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean handleMediaPlayPauseIfPendingOnHandler() {
            return (this.RemoteActionCompatParcelizer & 32) == 32;
        }

        public final read MediaBrowserCompatSearchResultReceiver() {
            return this.MediaMetadataCompat;
        }

        private void onCustomAction() {
            this.RatingCompat = 0;
            this.MediaBrowserCompatItemReceiver = 0;
            this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.ERROR;
            this.read = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.MediaMetadataCompat = read.LANGUAGE_VERSION;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesImplApi21Parcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.AudioAttributesImplApi21Parcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.RatingCompat);
            }
            if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                setresumeexplanation.write(2, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                setresumeexplanation.RemoteActionCompatParcelizer(3, this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            }
            if ((this.RemoteActionCompatParcelizer & 8) == 8) {
                setresumeexplanation.write(4, this.read);
            }
            if ((this.RemoteActionCompatParcelizer & 16) == 16) {
                setresumeexplanation.write(5, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.RemoteActionCompatParcelizer & 32) == 32) {
                setresumeexplanation.RemoteActionCompatParcelizer(6, this.MediaMetadataCompat.RemoteActionCompatParcelizer());
            }
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.RemoteActionCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.RatingCompat) : 0;
            if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.MediaBrowserCompatItemReceiver);
            }
            if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.IconCompatParcelizer(3, this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            }
            if ((this.RemoteActionCompatParcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(4, this.read);
            }
            if ((this.RemoteActionCompatParcelizer & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(5, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.RemoteActionCompatParcelizer & 32) == 32) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.IconCompatParcelizer(6, this.MediaMetadataCompat.RemoteActionCompatParcelizer());
            }
            int iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer + this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi26Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static IconCompatParcelizer onCommand() {
            return IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        private static IconCompatParcelizer onMediaButtonEvent() {
            return onCommand();
        }

        private static IconCompatParcelizer write(onPause onpause) {
            return onCommand().IconCompatParcelizer(onpause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onFastForward, reason: merged with bridge method [inline-methods] */
        public IconCompatParcelizer RatingCompat() {
            return write(this);
        }

        public static final class IconCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<onPause, IconCompatParcelizer> implements setMyRating {
            private int AudioAttributesCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private int RemoteActionCompatParcelizer;
            private int read;
            private int write;
            private AudioAttributesCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer.ERROR;
            private read AudioAttributesImplBaseParcelizer = read.LANGUAGE_VERSION;

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                return true;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return MediaBrowserCompatSearchResultReceiver();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaBrowserCompatSearchResultReceiver();
            }

            private IconCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                return new IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public IconCompatParcelizer clone() {
                return AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(MediaBrowserCompatItemReceiver());
            }

            private static onPause MediaBrowserCompatSearchResultReceiver() {
                return onPause.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
            public onPause write() {
                onPause onpauseMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                if (onpauseMediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
                    return onpauseMediaBrowserCompatItemReceiver;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private onPause MediaBrowserCompatItemReceiver() {
                onPause onpause = new onPause((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.read;
                int i2 = (i & 1) == 1 ? 1 : 0;
                onpause.RatingCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                onpause.MediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                onpause.AudioAttributesCompatParcelizer = this.IconCompatParcelizer;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                onpause.read = this.write;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                onpause.MediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                onpause.MediaMetadataCompat = this.AudioAttributesImplBaseParcelizer;
                onpause.RemoteActionCompatParcelizer = i2;
                return onpause;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final IconCompatParcelizer IconCompatParcelizer(onPause onpause) {
                if (onpause == onPause.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (onpause.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    write(onpause.AudioAttributesImplBaseParcelizer());
                }
                if (onpause.onAddQueueItem()) {
                    AudioAttributesCompatParcelizer(onpause.MediaBrowserCompatItemReceiver());
                }
                if (onpause.MediaBrowserCompatMediaItem()) {
                    AudioAttributesCompatParcelizer(onpause.AudioAttributesCompatParcelizer());
                }
                if (onpause.MediaDescriptionCompat()) {
                    RemoteActionCompatParcelizer(onpause.IconCompatParcelizer());
                }
                if (onpause.MediaMetadataCompat()) {
                    read(onpause.write());
                }
                if (onpause.handleMediaPlayPauseIfPendingOnHandler()) {
                    read(onpause.MediaBrowserCompatSearchResultReceiver());
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(onpause.AudioAttributesImplBaseParcelizer));
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.onPause.IconCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$onPause> r0 = o.setActiveRecallQbankId.onPause.write     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$onPause r2 = (o.setActiveRecallQbankId.onPause) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$onPause r3 = (o.setActiveRecallQbankId.onPause) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.onPause.IconCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$onPause$IconCompatParcelizer");
            }

            private IconCompatParcelizer write(int i) {
                this.read |= 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i;
                return this;
            }

            private IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                this.read |= 2;
                this.AudioAttributesCompatParcelizer = i;
                return this;
            }

            private IconCompatParcelizer AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                this.read |= 4;
                this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                return this;
            }

            private IconCompatParcelizer RemoteActionCompatParcelizer(int i) {
                this.read |= 8;
                this.write = i;
                return this;
            }

            private IconCompatParcelizer read(int i) {
                this.read |= 16;
                this.RemoteActionCompatParcelizer = i;
                return this;
            }

            private IconCompatParcelizer read(read readVar) {
                this.read |= 32;
                this.AudioAttributesImplBaseParcelizer = readVar;
                return this;
            }
        }
    }

    public static final class onPlay extends HomeLessonIndexV2 implements setNewExpiryTimeMs {
        public static getParentMcqId<onPlay> RemoteActionCompatParcelizer = new setReadTime<onPlay>() { // from class: o.setActiveRecallQbankId.onPlay.1
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return read(setslidescount, setsteptype);
            }

            private static onPlay read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new onPlay(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final onPlay write;
        private byte AudioAttributesCompatParcelizer;
        private final setVideoAspectRatio AudioAttributesImplApi26Parcelizer;
        private int IconCompatParcelizer;
        private List<onPause> read;

        /* synthetic */ onPlay(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ onPlay(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaMetadataCompat();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaBrowserCompatMediaItem();
        }

        private onPlay(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.IconCompatParcelizer = -1;
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private onPlay() {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.IconCompatParcelizer = -1;
            this.AudioAttributesImplApi26Parcelizer = setVideoAspectRatio.write;
        }

        public static onPlay IconCompatParcelizer() {
            return write;
        }

        private static onPlay MediaBrowserCompatMediaItem() {
            return write;
        }

        private onPlay(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.IconCompatParcelizer = -1;
            MediaBrowserCompatItemReceiver();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 10) {
                                    if (!z2) {
                                        this.read = new ArrayList();
                                        z2 = true;
                                    }
                                    this.read.add((onPause) setslidescount.RemoteActionCompatParcelizer(onPause.write, setsteptype));
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new LessonTabItem(e.getMessage()).write(this);
                        }
                    } catch (LessonTabItem e2) {
                        throw e2.write(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.read = Collections.unmodifiableList(this.read);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if (z2) {
                this.read = Collections.unmodifiableList(this.read);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            onPlay onplay = new onPlay();
            write = onplay;
            onplay.MediaBrowserCompatItemReceiver();
        }

        public final List<onPause> write() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.read.size();
        }

        private void MediaBrowserCompatItemReceiver() {
            this.read = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesCompatParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.AudioAttributesCompatParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            for (int i = 0; i < this.read.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(1, this.read.get(i));
            }
            setresumeexplanation.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.IconCompatParcelizer;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.read.size(); i3++) {
                i2 += setResumeExplanation.read(1, this.read.get(i3));
            }
            int iMediaBrowserCompatCustomActionResultReceiver = i2 + this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.IconCompatParcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static IconCompatParcelizer AudioAttributesImplBaseParcelizer() {
            return IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static IconCompatParcelizer MediaMetadataCompat() {
            return AudioAttributesImplBaseParcelizer();
        }

        public static IconCompatParcelizer write(onPlay onplay) {
            return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(onplay);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer RatingCompat() {
            return write(this);
        }

        public static final class IconCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<onPlay, IconCompatParcelizer> implements setNewExpiryTimeMs {
            private int AudioAttributesCompatParcelizer;
            private List<onPause> write = Collections.emptyList();

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                return true;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return MediaBrowserCompatSearchResultReceiver();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return MediaBrowserCompatSearchResultReceiver();
            }

            private IconCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static IconCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public IconCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static onPlay MediaBrowserCompatSearchResultReceiver() {
                return onPlay.IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public onPlay write() {
                onPlay onplayAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (onplayAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return onplayAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            public final onPlay AudioAttributesImplApi26Parcelizer() {
                onPlay onplay = new onPlay((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) 0);
                if ((this.AudioAttributesCompatParcelizer & 1) == 1) {
                    this.write = Collections.unmodifiableList(this.write);
                    this.AudioAttributesCompatParcelizer &= -2;
                }
                onplay.read = this.write;
                return onplay;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final IconCompatParcelizer IconCompatParcelizer(onPlay onplay) {
                if (onplay == onPlay.IconCompatParcelizer()) {
                    return this;
                }
                if (!onplay.read.isEmpty()) {
                    if (this.write.isEmpty()) {
                        this.write = onplay.read;
                        this.AudioAttributesCompatParcelizer &= -2;
                    } else {
                        MediaBrowserCompatItemReceiver();
                        this.write.addAll(onplay.read);
                    }
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(onplay.AudioAttributesImplApi26Parcelizer));
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.onPlay.IconCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$onPlay> r0 = o.setActiveRecallQbankId.onPlay.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$onPlay r2 = (o.setActiveRecallQbankId.onPlay) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$onPlay r3 = (o.setActiveRecallQbankId.onPlay) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.onPlay.IconCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$onPlay$IconCompatParcelizer");
            }

            private void MediaBrowserCompatItemReceiver() {
                if ((this.AudioAttributesCompatParcelizer & 1) != 1) {
                    this.write = new ArrayList(this.write);
                    this.AudioAttributesCompatParcelizer |= 1;
                }
            }
        }
    }

    public static final class MediaMetadataCompat extends HomeLessonIndexV2.read<MediaMetadataCompat> implements setLastAttemptedTimeMs {
        public static getParentMcqId<MediaMetadataCompat> IconCompatParcelizer = new setReadTime<MediaMetadataCompat>() { // from class: o.setActiveRecallQbankId.MediaMetadataCompat.5
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return AudioAttributesCompatParcelizer(setslidescount, setsteptype);
            }

            private static MediaMetadataCompat AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new MediaMetadataCompat(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final MediaMetadataCompat write;
        private byte AudioAttributesCompatParcelizer;
        private MediaDescriptionCompat AudioAttributesImplApi21Parcelizer;
        private MediaBrowserCompatSearchResultReceiver AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private final setVideoAspectRatio MediaBrowserCompatCustomActionResultReceiver;
        private RatingCompat MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private List<RemoteActionCompatParcelizer> read;

        /* synthetic */ MediaMetadataCompat(HomeLessonIndexV2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(audioAttributesCompatParcelizer);
        }

        /* synthetic */ MediaMetadataCompat(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return handleMediaPlayPauseIfPendingOnHandler();
        }

        private MediaMetadataCompat(HomeLessonIndexV2.AudioAttributesCompatParcelizer<MediaMetadataCompat, ?> audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.MediaMetadataCompat();
        }

        private MediaMetadataCompat() {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = setVideoAspectRatio.write;
        }

        public static MediaMetadataCompat AudioAttributesCompatParcelizer() {
            return write;
        }

        private static MediaMetadataCompat handleMediaPlayPauseIfPendingOnHandler() {
            return write;
        }

        private MediaMetadataCompat(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesCompatParcelizer = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            MediaMetadataCompat();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 10) {
                                MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer remoteActionCompatParcelizerRatingCompat = (this.RemoteActionCompatParcelizer & 1) == 1 ? this.AudioAttributesImplApi26Parcelizer.RatingCompat() : null;
                                MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = (MediaBrowserCompatSearchResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer, setsteptype);
                                this.AudioAttributesImplApi26Parcelizer = mediaBrowserCompatSearchResultReceiver;
                                if (remoteActionCompatParcelizerRatingCompat != null) {
                                    remoteActionCompatParcelizerRatingCompat.IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver);
                                    this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizerRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.RemoteActionCompatParcelizer |= 1;
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 18) {
                                MediaDescriptionCompat.read readVarRatingCompat = (this.RemoteActionCompatParcelizer & 2) == 2 ? this.AudioAttributesImplApi21Parcelizer.RatingCompat() : null;
                                MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) setslidescount.RemoteActionCompatParcelizer(MediaDescriptionCompat.RemoteActionCompatParcelizer, setsteptype);
                                this.AudioAttributesImplApi21Parcelizer = mediaDescriptionCompat;
                                if (readVarRatingCompat != null) {
                                    readVarRatingCompat.IconCompatParcelizer(mediaDescriptionCompat);
                                    this.AudioAttributesImplApi21Parcelizer = readVarRatingCompat.MediaBrowserCompatItemReceiver();
                                }
                                this.RemoteActionCompatParcelizer |= 2;
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 26) {
                                RatingCompat.write writeVarRatingCompat = (this.RemoteActionCompatParcelizer & 4) == 4 ? this.MediaBrowserCompatItemReceiver.RatingCompat() : null;
                                RatingCompat ratingCompat = (RatingCompat) setslidescount.RemoteActionCompatParcelizer(RatingCompat.AudioAttributesCompatParcelizer, setsteptype);
                                this.MediaBrowserCompatItemReceiver = ratingCompat;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(ratingCompat);
                                    this.MediaBrowserCompatItemReceiver = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.RemoteActionCompatParcelizer |= 4;
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 34) {
                                int i = (c == true ? 1 : 0) & '\b';
                                c = c;
                                if (i != 8) {
                                    this.read = new ArrayList();
                                    c = '\b';
                                }
                                this.read.add((RemoteActionCompatParcelizer) setslidescount.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, setsteptype));
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '\b') == 8) {
                            this.read = Collections.unmodifiableList(this.read);
                        }
                        try {
                            setresumeexplanation.IconCompatParcelizer();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                            throw th2;
                        }
                        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        onStop();
                        throw th;
                    }
                } catch (LessonTabItem e) {
                    throw e.write(this);
                } catch (IOException e2) {
                    throw new LessonTabItem(e2.getMessage()).write(this);
                }
            }
            if (((c == true ? 1 : 0) & '\b') == 8) {
                this.read = Collections.unmodifiableList(this.read);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat();
            write = mediaMetadataCompat;
            mediaMetadataCompat.MediaMetadataCompat();
        }

        public final boolean MediaDescriptionCompat() {
            return (this.RemoteActionCompatParcelizer & 1) == 1;
        }

        public final MediaBrowserCompatSearchResultReceiver AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean MediaBrowserCompatMediaItem() {
            return (this.RemoteActionCompatParcelizer & 2) == 2;
        }

        public final MediaDescriptionCompat write() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return (this.RemoteActionCompatParcelizer & 4) == 4;
        }

        public final RatingCompat IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer() {
            return this.read;
        }

        private int onCommand() {
            return this.read.size();
        }

        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            return this.read.get(i);
        }

        private void MediaMetadataCompat() {
            this.AudioAttributesImplApi26Parcelizer = MediaBrowserCompatSearchResultReceiver.write();
            this.AudioAttributesImplApi21Parcelizer = MediaDescriptionCompat.IconCompatParcelizer();
            this.MediaBrowserCompatItemReceiver = RatingCompat.AudioAttributesCompatParcelizer();
            this.read = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesCompatParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (MediaBrowserCompatMediaItem() && !write().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            if (MediaBrowserCompatItemReceiver() && !IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            for (int i = 0; i < onCommand(); i++) {
                if (!RemoteActionCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesCompatParcelizer = (byte) 0;
                    return false;
                }
            }
            if (!onSkipToQueueItem()) {
                this.AudioAttributesCompatParcelizer = (byte) 0;
                return false;
            }
            this.AudioAttributesCompatParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            HomeLessonIndexV2.read<MessageType>.AudioAttributesCompatParcelizer sessionImpl = setSessionImpl();
            if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                setresumeexplanation.IconCompatParcelizer(1, this.AudioAttributesImplApi26Parcelizer);
            }
            if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                setresumeexplanation.IconCompatParcelizer(2, this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                setresumeexplanation.IconCompatParcelizer(3, this.MediaBrowserCompatItemReceiver);
            }
            for (int i = 0; i < this.read.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(4, this.read.get(i));
            }
            sessionImpl.read(200, setresumeexplanation);
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i != -1) {
                return i;
            }
            int i2 = (this.RemoteActionCompatParcelizer & 1) == 1 ? setResumeExplanation.read(1, this.AudioAttributesImplApi26Parcelizer) : 0;
            if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                i2 += setResumeExplanation.read(2, this.AudioAttributesImplApi21Parcelizer);
            }
            if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                i2 += setResumeExplanation.read(3, this.MediaBrowserCompatItemReceiver);
            }
            for (int i3 = 0; i3 < this.read.size(); i3++) {
                i2 += setResumeExplanation.read(4, this.read.get(i3));
            }
            int iOnSkipToPrevious = i2 + onSkipToPrevious() + this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = iOnSkipToPrevious;
            return iOnSkipToPrevious;
        }

        public static MediaMetadataCompat write(InputStream inputStream, setStepType setsteptype) throws IOException {
            return IconCompatParcelizer.AudioAttributesCompatParcelizer(inputStream, setsteptype);
        }

        private static read MediaBrowserCompatSearchResultReceiver() {
            return read.AudioAttributesImplBaseParcelizer();
        }

        private static read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return MediaBrowserCompatSearchResultReceiver();
        }

        private static read RemoteActionCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) {
            return MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(mediaMetadataCompat);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
        public read RatingCompat() {
            return RemoteActionCompatParcelizer(this);
        }

        public static final class read extends HomeLessonIndexV2.AudioAttributesCompatParcelizer<MediaMetadataCompat, read> implements setLastAttemptedTimeMs {
            private int AudioAttributesCompatParcelizer;
            private MediaBrowserCompatSearchResultReceiver RemoteActionCompatParcelizer = MediaBrowserCompatSearchResultReceiver.write();
            private MediaDescriptionCompat read = MediaDescriptionCompat.IconCompatParcelizer();
            private RatingCompat IconCompatParcelizer = RatingCompat.AudioAttributesCompatParcelizer();
            private List<RemoteActionCompatParcelizer> write = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCommand();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCommand();
            }

            private read() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static read AudioAttributesImplBaseParcelizer() {
                return new read();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.AudioAttributesCompatParcelizer, o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: merged with bridge method [inline-methods] */
            public read clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(MediaDescriptionCompat());
            }

            private static MediaMetadataCompat onCommand() {
                return MediaMetadataCompat.AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public MediaMetadataCompat write() {
                MediaMetadataCompat mediaMetadataCompatMediaDescriptionCompat = MediaDescriptionCompat();
                if (mediaMetadataCompatMediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver()) {
                    return mediaMetadataCompatMediaDescriptionCompat;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private MediaMetadataCompat MediaDescriptionCompat() {
                MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat((HomeLessonIndexV2.AudioAttributesCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.AudioAttributesCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                mediaMetadataCompat.AudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                mediaMetadataCompat.AudioAttributesImplApi21Parcelizer = this.read;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                mediaMetadataCompat.MediaBrowserCompatItemReceiver = this.IconCompatParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 8) == 8) {
                    this.write = Collections.unmodifiableList(this.write);
                    this.AudioAttributesCompatParcelizer &= -9;
                }
                mediaMetadataCompat.read = this.write;
                mediaMetadataCompat.RemoteActionCompatParcelizer = i2;
                return mediaMetadataCompat;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            public final read IconCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) {
                if (mediaMetadataCompat == MediaMetadataCompat.AudioAttributesCompatParcelizer()) {
                    return this;
                }
                if (mediaMetadataCompat.MediaDescriptionCompat()) {
                    RemoteActionCompatParcelizer(mediaMetadataCompat.AudioAttributesImplBaseParcelizer());
                }
                if (mediaMetadataCompat.MediaBrowserCompatMediaItem()) {
                    RemoteActionCompatParcelizer(mediaMetadataCompat.write());
                }
                if (mediaMetadataCompat.MediaBrowserCompatItemReceiver()) {
                    read(mediaMetadataCompat.IconCompatParcelizer());
                }
                if (!mediaMetadataCompat.read.isEmpty()) {
                    if (this.write.isEmpty()) {
                        this.write = mediaMetadataCompat.read;
                        this.AudioAttributesCompatParcelizer &= -9;
                    } else {
                        AudioAttributesImplApi26Parcelizer();
                        this.write.addAll(mediaMetadataCompat.read);
                    }
                }
                write(mediaMetadataCompat);
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(mediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (onPause() && !onCustomAction().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                if (onMediaButtonEvent() && !handleMediaPlayPauseIfPendingOnHandler().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i = 0; i < onAddQueueItem(); i++) {
                    if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return MediaBrowserCompatSearchResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.MediaMetadataCompat.read read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$MediaMetadataCompat> r0 = o.setActiveRecallQbankId.MediaMetadataCompat.IconCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$MediaMetadataCompat r2 = (o.setActiveRecallQbankId.MediaMetadataCompat) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$MediaMetadataCompat r3 = (o.setActiveRecallQbankId.MediaMetadataCompat) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaMetadataCompat.read.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaMetadataCompat$read");
            }

            private read RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 1) == 1 && this.RemoteActionCompatParcelizer != MediaBrowserCompatSearchResultReceiver.write()) {
                    this.RemoteActionCompatParcelizer = MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.RemoteActionCompatParcelizer = mediaBrowserCompatSearchResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 1;
                return this;
            }

            private boolean onPause() {
                return (this.AudioAttributesCompatParcelizer & 2) == 2;
            }

            private MediaDescriptionCompat onCustomAction() {
                return this.read;
            }

            private read RemoteActionCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) {
                if ((this.AudioAttributesCompatParcelizer & 2) == 2 && this.read != MediaDescriptionCompat.IconCompatParcelizer()) {
                    this.read = MediaDescriptionCompat.RemoteActionCompatParcelizer(this.read).IconCompatParcelizer(mediaDescriptionCompat).MediaBrowserCompatItemReceiver();
                } else {
                    this.read = mediaDescriptionCompat;
                }
                this.AudioAttributesCompatParcelizer |= 2;
                return this;
            }

            private boolean onMediaButtonEvent() {
                return (this.AudioAttributesCompatParcelizer & 4) == 4;
            }

            private RatingCompat handleMediaPlayPauseIfPendingOnHandler() {
                return this.IconCompatParcelizer;
            }

            private read read(RatingCompat ratingCompat) {
                if ((this.AudioAttributesCompatParcelizer & 4) == 4 && this.IconCompatParcelizer != RatingCompat.AudioAttributesCompatParcelizer()) {
                    this.IconCompatParcelizer = RatingCompat.write(this.IconCompatParcelizer).IconCompatParcelizer(ratingCompat).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.IconCompatParcelizer = ratingCompat;
                }
                this.AudioAttributesCompatParcelizer |= 4;
                return this;
            }

            private void AudioAttributesImplApi26Parcelizer() {
                if ((this.AudioAttributesCompatParcelizer & 8) != 8) {
                    this.write = new ArrayList(this.write);
                    this.AudioAttributesCompatParcelizer |= 8;
                }
            }

            private int onAddQueueItem() {
                return this.write.size();
            }

            private RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
                return this.write.get(i);
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer extends HomeLessonIndexV2 implements setEditionValue {
        public static getParentMcqId<AudioAttributesCompatParcelizer> read = new setReadTime<AudioAttributesCompatParcelizer>() { // from class: o.setActiveRecallQbankId.AudioAttributesCompatParcelizer.5
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return write(setslidescount, setsteptype);
            }

            private static AudioAttributesCompatParcelizer write(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new AudioAttributesCompatParcelizer(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final AudioAttributesCompatParcelizer write;
        private List<read> AudioAttributesCompatParcelizer;
        private byte IconCompatParcelizer;
        private final setVideoAspectRatio MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;

        /* synthetic */ AudioAttributesCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaBrowserCompatItemReceiver();
        }

        private AudioAttributesCompatParcelizer(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.IconCompatParcelizer = (byte) -1;
            this.RemoteActionCompatParcelizer = -1;
            this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = (byte) -1;
            this.RemoteActionCompatParcelizer = -1;
            this.MediaBrowserCompatItemReceiver = setVideoAspectRatio.write;
        }

        public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return write;
        }

        private static AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver() {
            return write;
        }

        private AudioAttributesCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.IconCompatParcelizer = (byte) -1;
            this.RemoteActionCompatParcelizer = -1;
            IconCompatParcelizer();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                            if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                                if (iHandleMediaPlayPauseIfPendingOnHandler == 10) {
                                    if (!z2) {
                                        this.AudioAttributesCompatParcelizer = new ArrayList();
                                        z2 = true;
                                    }
                                    this.AudioAttributesCompatParcelizer.add((read) setslidescount.RemoteActionCompatParcelizer(read.AudioAttributesCompatParcelizer, setsteptype));
                                } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new LessonTabItem(e.getMessage()).write(this);
                        }
                    } catch (LessonTabItem e2) {
                        throw e2.write(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(this.AudioAttributesCompatParcelizer);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if (z2) {
                this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(this.AudioAttributesCompatParcelizer);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
            write = audioAttributesCompatParcelizer;
            audioAttributesCompatParcelizer.IconCompatParcelizer();
        }

        private int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesCompatParcelizer.size();
        }

        private read AudioAttributesCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer.get(i);
        }

        private void IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.IconCompatParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < AudioAttributesImplBaseParcelizer(); i++) {
                if (!AudioAttributesCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.IconCompatParcelizer = (byte) 0;
                    return false;
                }
            }
            this.IconCompatParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            for (int i = 0; i < this.AudioAttributesCompatParcelizer.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(1, this.AudioAttributesCompatParcelizer.get(i));
            }
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.RemoteActionCompatParcelizer;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.AudioAttributesCompatParcelizer.size(); i3++) {
                i2 += setResumeExplanation.read(1, this.AudioAttributesCompatParcelizer.get(i3));
            }
            int iMediaBrowserCompatCustomActionResultReceiver = i2 + this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.RemoteActionCompatParcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static IconCompatParcelizer write() {
            return IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static IconCompatParcelizer MediaBrowserCompatMediaItem() {
            return write();
        }

        public static IconCompatParcelizer read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            return write().IconCompatParcelizer(audioAttributesCompatParcelizer);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer RatingCompat() {
            return read(this);
        }

        public static final class IconCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer, IconCompatParcelizer> implements setEditionValue {
            private int IconCompatParcelizer;
            private List<read> read = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return RatingCompat();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return RatingCompat();
            }

            private IconCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static IconCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public IconCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static AudioAttributesCompatParcelizer RatingCompat() {
                return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public AudioAttributesCompatParcelizer write() {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            public final AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer() {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) 0);
                if ((this.IconCompatParcelizer & 1) == 1) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.IconCompatParcelizer &= -2;
                }
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.read;
                return audioAttributesCompatParcelizer;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final IconCompatParcelizer IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                if (audioAttributesCompatParcelizer == AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                    return this;
                }
                if (!audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        this.IconCompatParcelizer &= -2;
                    } else {
                        MediaBrowserCompatItemReceiver();
                        this.read.addAll(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
                    }
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(); i++) {
                    if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.AudioAttributesCompatParcelizer.IconCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$AudioAttributesCompatParcelizer> r0 = o.setActiveRecallQbankId.AudioAttributesCompatParcelizer.read     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$AudioAttributesCompatParcelizer r2 = (o.setActiveRecallQbankId.AudioAttributesCompatParcelizer) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$AudioAttributesCompatParcelizer r3 = (o.setActiveRecallQbankId.AudioAttributesCompatParcelizer) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.AudioAttributesCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$AudioAttributesCompatParcelizer$IconCompatParcelizer");
            }

            private void MediaBrowserCompatItemReceiver() {
                if ((this.IconCompatParcelizer & 1) != 1) {
                    this.read = new ArrayList(this.read);
                    this.IconCompatParcelizer |= 1;
                }
            }

            private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return this.read.size();
            }

            private read IconCompatParcelizer(int i) {
                return this.read.get(i);
            }
        }
    }

    public static final class read extends HomeLessonIndexV2 implements setDontConsider {
        public static getParentMcqId<read> AudioAttributesCompatParcelizer = new setReadTime<read>() { // from class: o.setActiveRecallQbankId.read.5
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return IconCompatParcelizer(setslidescount, setsteptype);
            }

            private static read IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new read(setslidescount, setsteptype, (byte) 0);
            }
        };
        private static final read IconCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private write AudioAttributesImplApi26Parcelizer;
        private byte AudioAttributesImplBaseParcelizer;
        private final setVideoAspectRatio MediaBrowserCompatCustomActionResultReceiver;
        private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private List<MediaBrowserCompatItemReceiver> read;
        private MediaBrowserCompatItemReceiver write;

        /* synthetic */ read(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ read(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return handleMediaPlayPauseIfPendingOnHandler();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return MediaBrowserCompatMediaItem();
        }

        private read(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.AudioAttributesImplBaseParcelizer = (byte) -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private read() {
            this.AudioAttributesImplBaseParcelizer = (byte) -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = setVideoAspectRatio.write;
        }

        public static read RemoteActionCompatParcelizer() {
            return IconCompatParcelizer;
        }

        private static read MediaBrowserCompatMediaItem() {
            return IconCompatParcelizer;
        }

        private read(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.AudioAttributesImplBaseParcelizer = (byte) -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            MediaBrowserCompatSearchResultReceiver();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                int iWrite = setslidescount.write();
                                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = AudioAttributesCompatParcelizer.write(iWrite);
                                if (audioAttributesCompatParcelizerWrite == null) {
                                    setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                    setresumeexplanation.MediaMetadataCompat(iWrite);
                                } else {
                                    this.RemoteActionCompatParcelizer |= 1;
                                    this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizerWrite;
                                }
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 18) {
                                if ((c & 2) != 2) {
                                    this.read = new ArrayList();
                                    c = 2;
                                }
                                this.read.add((MediaBrowserCompatItemReceiver) setslidescount.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver.read, setsteptype));
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 26) {
                                MediaBrowserCompatItemReceiver.IconCompatParcelizer iconCompatParcelizerRatingCompat = (this.RemoteActionCompatParcelizer & 2) == 2 ? this.write.RatingCompat() : null;
                                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (MediaBrowserCompatItemReceiver) setslidescount.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver.read, setsteptype);
                                this.write = mediaBrowserCompatItemReceiver;
                                if (iconCompatParcelizerRatingCompat != null) {
                                    iconCompatParcelizerRatingCompat.IconCompatParcelizer(mediaBrowserCompatItemReceiver);
                                    this.write = iconCompatParcelizerRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.RemoteActionCompatParcelizer |= 2;
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 32) {
                                int iWrite2 = setslidescount.write();
                                write writeVar = write.read(iWrite2);
                                if (writeVar == null) {
                                    setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                    setresumeexplanation.MediaMetadataCompat(iWrite2);
                                } else {
                                    this.RemoteActionCompatParcelizer |= 4;
                                    this.AudioAttributesImplApi26Parcelizer = writeVar;
                                }
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.read = Collections.unmodifiableList(this.read);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.read = Collections.unmodifiableList(this.read);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            read readVar = new read();
            IconCompatParcelizer = readVar;
            readVar.MediaBrowserCompatSearchResultReceiver();
        }

        public enum AudioAttributesCompatParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            private final int AudioAttributesCompatParcelizer;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer>() { // from class: o.setActiveRecallQbankId.read.AudioAttributesCompatParcelizer.4
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer(i);
                    }

                    private static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer.write(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public static AudioAttributesCompatParcelizer write(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            AudioAttributesCompatParcelizer(int i) {
                this.AudioAttributesCompatParcelizer = i;
            }
        }

        public enum write implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            private final int read;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<write>() { // from class: o.setActiveRecallQbankId.read.write.4
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return IconCompatParcelizer(i);
                    }

                    private static write IconCompatParcelizer(int i) {
                        return write.read(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.read;
            }

            public static write read(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            write(int i) {
                this.read = i;
            }
        }

        public final boolean AudioAttributesImplBaseParcelizer() {
            return (this.RemoteActionCompatParcelizer & 1) == 1;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private int onCommand() {
            return this.read.size();
        }

        private MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer(int i) {
            return this.read.get(i);
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return (this.RemoteActionCompatParcelizer & 2) == 2;
        }

        public final MediaBrowserCompatItemReceiver write() {
            return this.write;
        }

        public final boolean MediaMetadataCompat() {
            return (this.RemoteActionCompatParcelizer & 4) == 4;
        }

        public final write IconCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        private void MediaBrowserCompatSearchResultReceiver() {
            this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer.RETURNS_CONSTANT;
            this.read = Collections.emptyList();
            this.write = MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer = write.AT_MOST_ONCE;
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.AudioAttributesImplBaseParcelizer;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < onCommand(); i++) {
                if (!RemoteActionCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplBaseParcelizer = (byte) 0;
                    return false;
                }
            }
            if (MediaBrowserCompatItemReceiver() && !write().MediaBrowserCompatCustomActionResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer = (byte) 0;
                return false;
            }
            this.AudioAttributesImplBaseParcelizer = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            if ((this.RemoteActionCompatParcelizer & 1) == 1) {
                setresumeexplanation.RemoteActionCompatParcelizer(1, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
            }
            for (int i = 0; i < this.read.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(2, this.read.get(i));
            }
            if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                setresumeexplanation.IconCompatParcelizer(3, this.write);
            }
            if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                setresumeexplanation.RemoteActionCompatParcelizer(4, this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
            }
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i != -1) {
                return i;
            }
            int iIconCompatParcelizer = (this.RemoteActionCompatParcelizer & 1) == 1 ? setResumeExplanation.IconCompatParcelizer(1, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()) : 0;
            for (int i2 = 0; i2 < this.read.size(); i2++) {
                iIconCompatParcelizer += setResumeExplanation.read(2, this.read.get(i2));
            }
            if ((this.RemoteActionCompatParcelizer & 2) == 2) {
                iIconCompatParcelizer += setResumeExplanation.read(3, this.write);
            }
            if ((this.RemoteActionCompatParcelizer & 4) == 4) {
                iIconCompatParcelizer += setResumeExplanation.IconCompatParcelizer(4, this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
            }
            int iMediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi21Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static RemoteActionCompatParcelizer MediaDescriptionCompat() {
            return RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler() {
            return MediaDescriptionCompat();
        }

        private static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(read readVar) {
            return MediaDescriptionCompat().IconCompatParcelizer(readVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onAddQueueItem, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer RatingCompat() {
            return AudioAttributesCompatParcelizer(this);
        }

        public static final class RemoteActionCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<read, RemoteActionCompatParcelizer> implements setDontConsider {
            private int AudioAttributesCompatParcelizer;
            private AudioAttributesCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer.RETURNS_CONSTANT;
            private List<MediaBrowserCompatItemReceiver> read = Collections.emptyList();
            private MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            private write write = write.AT_MOST_ONCE;

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onAddQueueItem();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onAddQueueItem();
            }

            private RemoteActionCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
            public RemoteActionCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(RatingCompat());
            }

            private static read onAddQueueItem() {
                return read.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
            public read write() {
                read readVarRatingCompat = RatingCompat();
                if (readVarRatingCompat.MediaBrowserCompatCustomActionResultReceiver()) {
                    return readVarRatingCompat;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private read RatingCompat() {
                read readVar = new read((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.AudioAttributesCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                readVar.MediaBrowserCompatItemReceiver = this.IconCompatParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 2) == 2) {
                    this.read = Collections.unmodifiableList(this.read);
                    this.AudioAttributesCompatParcelizer &= -3;
                }
                readVar.read = this.read;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                readVar.write = this.RemoteActionCompatParcelizer;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                readVar.AudioAttributesImplApi26Parcelizer = this.write;
                readVar.RemoteActionCompatParcelizer = i2;
                return readVar;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final RemoteActionCompatParcelizer IconCompatParcelizer(read readVar) {
                if (readVar == read.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (readVar.AudioAttributesImplBaseParcelizer()) {
                    AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer());
                }
                if (!readVar.read.isEmpty()) {
                    if (this.read.isEmpty()) {
                        this.read = readVar.read;
                        this.AudioAttributesCompatParcelizer &= -3;
                    } else {
                        AudioAttributesImplApi26Parcelizer();
                        this.read.addAll(readVar.read);
                    }
                }
                if (readVar.MediaBrowserCompatItemReceiver()) {
                    IconCompatParcelizer(readVar.write());
                }
                if (readVar.MediaMetadataCompat()) {
                    AudioAttributesCompatParcelizer(readVar.IconCompatParcelizer());
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(readVar.MediaBrowserCompatCustomActionResultReceiver));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                for (int i = 0; i < onCustomAction(); i++) {
                    if (!write(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return !handleMediaPlayPauseIfPendingOnHandler() || MediaBrowserCompatSearchResultReceiver().MediaBrowserCompatCustomActionResultReceiver();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.read.RemoteActionCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$read> r0 = o.setActiveRecallQbankId.read.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$read r2 = (o.setActiveRecallQbankId.read) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$read r3 = (o.setActiveRecallQbankId.read) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.read.RemoteActionCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$read$RemoteActionCompatParcelizer");
            }

            private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer |= 1;
                this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                return this;
            }

            private void AudioAttributesImplApi26Parcelizer() {
                if ((this.AudioAttributesCompatParcelizer & 2) != 2) {
                    this.read = new ArrayList(this.read);
                    this.AudioAttributesCompatParcelizer |= 2;
                }
            }

            private int onCustomAction() {
                return this.read.size();
            }

            private MediaBrowserCompatItemReceiver write(int i) {
                return this.read.get(i);
            }

            private boolean handleMediaPlayPauseIfPendingOnHandler() {
                return (this.AudioAttributesCompatParcelizer & 4) == 4;
            }

            private MediaBrowserCompatItemReceiver MediaBrowserCompatSearchResultReceiver() {
                return this.RemoteActionCompatParcelizer;
            }

            private RemoteActionCompatParcelizer IconCompatParcelizer(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 4) == 4 && this.RemoteActionCompatParcelizer != MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()) {
                    this.RemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer(mediaBrowserCompatItemReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.RemoteActionCompatParcelizer = mediaBrowserCompatItemReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 4;
                return this;
            }

            private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(write writeVar) {
                this.AudioAttributesCompatParcelizer |= 8;
                this.write = writeVar;
                return this;
            }
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends HomeLessonIndexV2 implements setHasVideoSubtitle {
        private static final MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer;
        public static getParentMcqId<MediaBrowserCompatItemReceiver> read = new setReadTime<MediaBrowserCompatItemReceiver>() { // from class: o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver.2
            @Override // kotlin.getParentMcqId
            public final /* synthetic */ Object RemoteActionCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return IconCompatParcelizer(setslidescount, setsteptype);
            }

            private static MediaBrowserCompatItemReceiver IconCompatParcelizer(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
                return new MediaBrowserCompatItemReceiver(setslidescount, setsteptype, (byte) 0);
            }
        };
        private int AudioAttributesImplApi21Parcelizer;
        private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private byte MediaBrowserCompatItemReceiver;
        private final setVideoAspectRatio MediaBrowserCompatMediaItem;
        private int MediaDescriptionCompat;
        private List<MediaBrowserCompatItemReceiver> MediaMetadataCompat;
        private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        private List<MediaBrowserCompatItemReceiver> write;

        /* synthetic */ MediaBrowserCompatItemReceiver(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        /* synthetic */ MediaBrowserCompatItemReceiver(setSlidesCount setslidescount, setStepType setsteptype, byte b) throws LessonTabItem {
            this(setslidescount, setsteptype);
        }

        @Override // kotlin.BookReference
        public final /* synthetic */ BookReference.write AudioAttributesImplApi26Parcelizer() {
            return onMediaButtonEvent();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final /* synthetic */ BookReference read() {
            return onPause();
        }

        private MediaBrowserCompatItemReceiver(HomeLessonIndexV2.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super((byte) 0);
            this.MediaBrowserCompatItemReceiver = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.MediaBrowserCompatMediaItem = remoteActionCompatParcelizer.MediaMetadataCompat();
        }

        private MediaBrowserCompatItemReceiver() {
            this.MediaBrowserCompatItemReceiver = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            this.MediaBrowserCompatMediaItem = setVideoAspectRatio.write;
        }

        public static MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        private static MediaBrowserCompatItemReceiver onPause() {
            return AudioAttributesCompatParcelizer;
        }

        private MediaBrowserCompatItemReceiver(setSlidesCount setslidescount, setStepType setsteptype) throws LessonTabItem {
            this.MediaBrowserCompatItemReceiver = (byte) -1;
            this.AudioAttributesImplBaseParcelizer = -1;
            onAddQueueItem();
            setVideoAspectRatio.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = setVideoAspectRatio.AudioAttributesCompatParcelizer();
            setResumeExplanation setresumeexplanation = setResumeExplanation.read(iconCompatParcelizerAudioAttributesCompatParcelizer, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iHandleMediaPlayPauseIfPendingOnHandler = setslidescount.handleMediaPlayPauseIfPendingOnHandler();
                        if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                            if (iHandleMediaPlayPauseIfPendingOnHandler == 8) {
                                this.IconCompatParcelizer |= 1;
                                this.MediaBrowserCompatCustomActionResultReceiver = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 16) {
                                this.IconCompatParcelizer |= 2;
                                this.MediaDescriptionCompat = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 24) {
                                int iWrite = setslidescount.write();
                                AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
                                if (AudioAttributesCompatParcelizer2 == null) {
                                    setresumeexplanation.MediaMetadataCompat(iHandleMediaPlayPauseIfPendingOnHandler);
                                    setresumeexplanation.MediaMetadataCompat(iWrite);
                                } else {
                                    this.IconCompatParcelizer |= 4;
                                    this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer2;
                                }
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 34) {
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write writeVarRatingCompat = (this.IconCompatParcelizer & 8) == 8 ? this.AudioAttributesImplApi26Parcelizer.RatingCompat() : null;
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) setslidescount.RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, setsteptype);
                                this.AudioAttributesImplApi26Parcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                if (writeVarRatingCompat != null) {
                                    writeVarRatingCompat.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                                    this.AudioAttributesImplApi26Parcelizer = writeVarRatingCompat.AudioAttributesImplApi26Parcelizer();
                                }
                                this.IconCompatParcelizer |= 8;
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 40) {
                                this.IconCompatParcelizer |= 16;
                                this.AudioAttributesImplApi21Parcelizer = setslidescount.AudioAttributesImplApi26Parcelizer();
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 50) {
                                if ((i & 32) != 32) {
                                    this.write = new ArrayList();
                                    i |= 32;
                                }
                                this.write.add((MediaBrowserCompatItemReceiver) setslidescount.RemoteActionCompatParcelizer(read, setsteptype));
                            } else if (iHandleMediaPlayPauseIfPendingOnHandler == 58) {
                                if ((i & 64) != 64) {
                                    this.MediaMetadataCompat = new ArrayList();
                                    i |= 64;
                                }
                                this.MediaMetadataCompat.add((MediaBrowserCompatItemReceiver) setslidescount.RemoteActionCompatParcelizer(read, setsteptype));
                            } else if (!write(setslidescount, setresumeexplanation, setsteptype, iHandleMediaPlayPauseIfPendingOnHandler)) {
                            }
                        }
                        z = true;
                    } catch (LessonTabItem e) {
                        throw e.write(this);
                    } catch (IOException e2) {
                        throw new LessonTabItem(e2.getMessage()).write(this);
                    }
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.write = Collections.unmodifiableList(this.write);
                    }
                    if ((i & 64) == 64) {
                        this.MediaMetadataCompat = Collections.unmodifiableList(this.MediaMetadataCompat);
                    }
                    try {
                        setresumeexplanation.IconCompatParcelizer();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        throw th2;
                    }
                    this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                    onStop();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.write = Collections.unmodifiableList(this.write);
            }
            if ((i & 64) == 64) {
                this.MediaMetadataCompat = Collections.unmodifiableList(this.MediaMetadataCompat);
            }
            try {
                setresumeexplanation.IconCompatParcelizer();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
                throw th3;
            }
            this.MediaBrowserCompatMediaItem = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            onStop();
        }

        static {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver();
            AudioAttributesCompatParcelizer = mediaBrowserCompatItemReceiver;
            mediaBrowserCompatItemReceiver.onAddQueueItem();
        }

        public enum AudioAttributesCompatParcelizer implements LessonSpinnerItem.AudioAttributesCompatParcelizer {
            TRUE(0),
            FALSE(1),
            NULL(2);

            private final int RemoteActionCompatParcelizer;

            static {
                new LessonSpinnerItem.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer>() { // from class: o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer.4
                    @Override // o.LessonSpinnerItem.RemoteActionCompatParcelizer
                    public final /* synthetic */ LessonSpinnerItem.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                        return IconCompatParcelizer(i);
                    }

                    private static AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
                        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
                    }
                };
            }

            @Override // o.LessonSpinnerItem.AudioAttributesCompatParcelizer
            public final int RemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            AudioAttributesCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer = i;
            }
        }

        public final boolean MediaBrowserCompatMediaItem() {
            return (this.IconCompatParcelizer & 1) == 1;
        }

        public final int write() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return (this.IconCompatParcelizer & 2) == 2;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.MediaDescriptionCompat;
        }

        public final boolean MediaBrowserCompatSearchResultReceiver() {
            return (this.IconCompatParcelizer & 4) == 4;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean MediaDescriptionCompat() {
            return (this.IconCompatParcelizer & 8) == 8;
        }

        public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean MediaMetadataCompat() {
            return (this.IconCompatParcelizer & 16) == 16;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        private int handleMediaPlayPauseIfPendingOnHandler() {
            return this.write.size();
        }

        private MediaBrowserCompatItemReceiver write(int i) {
            return this.write.get(i);
        }

        private int onPlayFromMediaId() {
            return this.MediaMetadataCompat.size();
        }

        private MediaBrowserCompatItemReceiver IconCompatParcelizer(int i) {
            return this.MediaMetadataCompat.get(i);
        }

        private void onAddQueueItem() {
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.MediaDescriptionCompat = 0;
            this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.TRUE;
            this.AudioAttributesImplApi26Parcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.write = Collections.emptyList();
            this.MediaMetadataCompat = Collections.emptyList();
        }

        @Override // kotlin.getSelectedAnswerIndex
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            byte b = this.MediaBrowserCompatItemReceiver;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (MediaDescriptionCompat() && !IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaBrowserCompatItemReceiver = (byte) 0;
                return false;
            }
            for (int i = 0; i < handleMediaPlayPauseIfPendingOnHandler(); i++) {
                if (!write(i).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.MediaBrowserCompatItemReceiver = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < onPlayFromMediaId(); i2++) {
                if (!IconCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                    this.MediaBrowserCompatItemReceiver = (byte) 0;
                    return false;
                }
            }
            this.MediaBrowserCompatItemReceiver = (byte) 1;
            return true;
        }

        @Override // kotlin.BookReference
        public final void IconCompatParcelizer(setResumeExplanation setresumeexplanation) throws IOException {
            AudioAttributesImplApi21Parcelizer();
            if ((this.IconCompatParcelizer & 1) == 1) {
                setresumeexplanation.write(1, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if ((this.IconCompatParcelizer & 2) == 2) {
                setresumeexplanation.write(2, this.MediaDescriptionCompat);
            }
            if ((this.IconCompatParcelizer & 4) == 4) {
                setresumeexplanation.RemoteActionCompatParcelizer(3, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            }
            if ((this.IconCompatParcelizer & 8) == 8) {
                setresumeexplanation.IconCompatParcelizer(4, this.AudioAttributesImplApi26Parcelizer);
            }
            if ((this.IconCompatParcelizer & 16) == 16) {
                setresumeexplanation.write(5, this.AudioAttributesImplApi21Parcelizer);
            }
            for (int i = 0; i < this.write.size(); i++) {
                setresumeexplanation.IconCompatParcelizer(6, this.write.get(i));
            }
            for (int i2 = 0; i2 < this.MediaMetadataCompat.size(); i2++) {
                setresumeexplanation.IconCompatParcelizer(7, this.MediaMetadataCompat.get(i2));
            }
            setresumeexplanation.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }

        @Override // kotlin.BookReference
        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i != -1) {
                return i;
            }
            int iAudioAttributesCompatParcelizer = (this.IconCompatParcelizer & 1) == 1 ? setResumeExplanation.AudioAttributesCompatParcelizer(1, this.MediaBrowserCompatCustomActionResultReceiver) : 0;
            if ((this.IconCompatParcelizer & 2) == 2) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(2, this.MediaDescriptionCompat);
            }
            if ((this.IconCompatParcelizer & 4) == 4) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.IconCompatParcelizer(3, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            }
            if ((this.IconCompatParcelizer & 8) == 8) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(4, this.AudioAttributesImplApi26Parcelizer);
            }
            if ((this.IconCompatParcelizer & 16) == 16) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.AudioAttributesCompatParcelizer(5, this.AudioAttributesImplApi21Parcelizer);
            }
            for (int i2 = 0; i2 < this.write.size(); i2++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(6, this.write.get(i2));
            }
            for (int i3 = 0; i3 < this.MediaMetadataCompat.size(); i3++) {
                iAudioAttributesCompatParcelizer += setResumeExplanation.read(7, this.MediaMetadataCompat.get(i3));
            }
            int iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesCompatParcelizer + this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            return iMediaBrowserCompatCustomActionResultReceiver;
        }

        private static IconCompatParcelizer onCustomAction() {
            return IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }

        private static IconCompatParcelizer onMediaButtonEvent() {
            return onCustomAction();
        }

        public static IconCompatParcelizer IconCompatParcelizer(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            return onCustomAction().IconCompatParcelizer(mediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.BookReference
        /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer RatingCompat() {
            return IconCompatParcelizer(this);
        }

        public static final class IconCompatParcelizer extends HomeLessonIndexV2.RemoteActionCompatParcelizer<MediaBrowserCompatItemReceiver, IconCompatParcelizer> implements setHasVideoSubtitle {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int read;
            private int write;
            private AudioAttributesCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer.TRUE;
            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver MediaBrowserCompatCustomActionResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
            private List<MediaBrowserCompatItemReceiver> RemoteActionCompatParcelizer = Collections.emptyList();
            private List<MediaBrowserCompatItemReceiver> MediaBrowserCompatItemReceiver = Collections.emptyList();

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
            public final /* synthetic */ HomeLessonIndexV2 read() {
                return onCustomAction();
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, kotlin.getSelectedAnswerIndex
            public final /* synthetic */ BookReference read() {
                return onCustomAction();
            }

            private IconCompatParcelizer() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static IconCompatParcelizer AudioAttributesImplBaseParcelizer() {
                return new IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
            /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
            public IconCompatParcelizer clone() {
                return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer());
            }

            private static MediaBrowserCompatItemReceiver onCustomAction() {
                return MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.BookReference.write
            /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
            public MediaBrowserCompatItemReceiver write() {
                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (mediaBrowserCompatItemReceiverAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                    return mediaBrowserCompatItemReceiverAudioAttributesImplApi26Parcelizer;
                }
                throw MediaBrowserCompatMediaItem();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final MediaBrowserCompatItemReceiver AudioAttributesImplApi26Parcelizer() {
                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver((HomeLessonIndexV2.RemoteActionCompatParcelizer) this, (byte) (0 == true ? 1 : 0));
                int i = this.AudioAttributesCompatParcelizer;
                int i2 = (i & 1) == 1 ? 1 : 0;
                mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver = this.write;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                mediaBrowserCompatItemReceiver.MediaDescriptionCompat = this.AudioAttributesImplBaseParcelizer;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer = this.read;
                if ((this.AudioAttributesCompatParcelizer & 32) == 32) {
                    this.RemoteActionCompatParcelizer = Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer &= -33;
                }
                mediaBrowserCompatItemReceiver.write = this.RemoteActionCompatParcelizer;
                if ((this.AudioAttributesCompatParcelizer & 64) == 64) {
                    this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(this.MediaBrowserCompatItemReceiver);
                    this.AudioAttributesCompatParcelizer &= -65;
                }
                mediaBrowserCompatItemReceiver.MediaMetadataCompat = this.MediaBrowserCompatItemReceiver;
                mediaBrowserCompatItemReceiver.IconCompatParcelizer = i2;
                return mediaBrowserCompatItemReceiver;
            }

            @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final IconCompatParcelizer IconCompatParcelizer(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
                if (mediaBrowserCompatItemReceiver == MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()) {
                    return this;
                }
                if (mediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem()) {
                    RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver.write());
                }
                if (mediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    write(mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver());
                }
                if (mediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver()) {
                    AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
                }
                if (mediaBrowserCompatItemReceiver.MediaDescriptionCompat()) {
                    RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver.IconCompatParcelizer());
                }
                if (mediaBrowserCompatItemReceiver.MediaMetadataCompat()) {
                    read(mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
                }
                if (!mediaBrowserCompatItemReceiver.write.isEmpty()) {
                    if (this.RemoteActionCompatParcelizer.isEmpty()) {
                        this.RemoteActionCompatParcelizer = mediaBrowserCompatItemReceiver.write;
                        this.AudioAttributesCompatParcelizer &= -33;
                    } else {
                        MediaBrowserCompatItemReceiver();
                        this.RemoteActionCompatParcelizer.addAll(mediaBrowserCompatItemReceiver.write);
                    }
                }
                if (!mediaBrowserCompatItemReceiver.MediaMetadataCompat.isEmpty()) {
                    if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
                        this.MediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.MediaMetadataCompat;
                        this.AudioAttributesCompatParcelizer &= -65;
                    } else {
                        MediaDescriptionCompat();
                        this.MediaBrowserCompatItemReceiver.addAll(mediaBrowserCompatItemReceiver.MediaMetadataCompat);
                    }
                }
                AudioAttributesCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem));
                return this;
            }

            @Override // kotlin.getSelectedAnswerIndex
            public final boolean MediaBrowserCompatCustomActionResultReceiver() {
                if (handleMediaPlayPauseIfPendingOnHandler() && !onAddQueueItem().MediaBrowserCompatCustomActionResultReceiver()) {
                    return false;
                }
                for (int i = 0; i < MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(); i++) {
                    if (!IconCompatParcelizer(i).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < onCommand(); i2++) {
                    if (!AudioAttributesCompatParcelizer(i2).MediaBrowserCompatCustomActionResultReceiver()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // o.setNotesCount.write
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver.IconCompatParcelizer read(kotlin.setSlidesCount r2, kotlin.setStepType r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    o.getParentMcqId<o.setActiveRecallQbankId$MediaBrowserCompatItemReceiver> r0 = o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver.read     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    java.lang.Object r2 = r0.RemoteActionCompatParcelizer(r2, r3)     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    o.setActiveRecallQbankId$MediaBrowserCompatItemReceiver r2 = (o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver) r2     // Catch: java.lang.Throwable -> Le kotlin.LessonTabItem -> L10
                    if (r2 == 0) goto Ld
                    r1.IconCompatParcelizer(r2)
                Ld:
                    return r1
                Le:
                    r2 = move-exception
                    goto L1a
                L10:
                    r2 = move-exception
                    o.BookReference r3 = r2.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Le
                    o.setActiveRecallQbankId$MediaBrowserCompatItemReceiver r3 = (o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver) r3     // Catch: java.lang.Throwable -> Le
                    throw r2     // Catch: java.lang.Throwable -> L18
                L18:
                    r2 = move-exception
                    goto L1b
                L1a:
                    r3 = 0
                L1b:
                    if (r3 == 0) goto L20
                    r1.IconCompatParcelizer(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setActiveRecallQbankId.MediaBrowserCompatItemReceiver.IconCompatParcelizer.read(o.setSlidesCount, o.setStepType):o.setActiveRecallQbankId$MediaBrowserCompatItemReceiver$IconCompatParcelizer");
            }

            private IconCompatParcelizer RemoteActionCompatParcelizer(int i) {
                this.AudioAttributesCompatParcelizer |= 1;
                this.write = i;
                return this;
            }

            private IconCompatParcelizer write(int i) {
                this.AudioAttributesCompatParcelizer |= 2;
                this.AudioAttributesImplBaseParcelizer = i;
                return this;
            }

            private IconCompatParcelizer AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer |= 4;
                this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                return this;
            }

            private boolean handleMediaPlayPauseIfPendingOnHandler() {
                return (this.AudioAttributesCompatParcelizer & 8) == 8;
            }

            private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onAddQueueItem() {
                return this.MediaBrowserCompatCustomActionResultReceiver;
            }

            private IconCompatParcelizer RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if ((this.AudioAttributesCompatParcelizer & 8) == 8 && this.MediaBrowserCompatCustomActionResultReceiver != MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                    this.MediaBrowserCompatCustomActionResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesImplApi26Parcelizer();
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                this.AudioAttributesCompatParcelizer |= 8;
                return this;
            }

            private IconCompatParcelizer read(int i) {
                this.AudioAttributesCompatParcelizer |= 16;
                this.read = i;
                return this;
            }

            private void MediaBrowserCompatItemReceiver() {
                if ((this.AudioAttributesCompatParcelizer & 32) != 32) {
                    this.RemoteActionCompatParcelizer = new ArrayList(this.RemoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer |= 32;
                }
            }

            private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                return this.RemoteActionCompatParcelizer.size();
            }

            private MediaBrowserCompatItemReceiver IconCompatParcelizer(int i) {
                return this.RemoteActionCompatParcelizer.get(i);
            }

            private void MediaDescriptionCompat() {
                if ((this.AudioAttributesCompatParcelizer & 64) != 64) {
                    this.MediaBrowserCompatItemReceiver = new ArrayList(this.MediaBrowserCompatItemReceiver);
                    this.AudioAttributesCompatParcelizer |= 64;
                }
            }

            private int onCommand() {
                return this.MediaBrowserCompatItemReceiver.size();
            }

            private MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer(int i) {
                return this.MediaBrowserCompatItemReceiver.get(i);
            }
        }
    }
}
