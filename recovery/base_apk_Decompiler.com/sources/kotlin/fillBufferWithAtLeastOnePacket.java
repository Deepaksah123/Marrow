package kotlin;

import java.nio.charset.Charset;
import kotlin.PsExtractor;
import kotlin.PsExtractorExternalSyntheticLambda0;
import kotlin.PsExtractorPesReader;
import kotlin.SectionPayloadReader;
import kotlin.SectionReader;
import kotlin.SeiReader;
import kotlin.TsBinarySearchSeeker;
import kotlin.TsBinarySearchSeekerTsPcrSeeker;
import kotlin.TsDurationReader;
import kotlin.finishReadDuration;
import kotlin.isDurationReadFinished;
import kotlin.readDuration;
import kotlin.readFirstPcrValueFromBuffer;
import kotlin.readFirstScrValue;
import kotlin.readFirstScrValueFromBuffer;
import kotlin.readLastPcrValue;
import kotlin.readLastScrValue;
import kotlin.readLastScrValueFromBuffer;
import kotlin.readScrValueFromPack;
import kotlin.readScrValueFromPackHeader;
import kotlin.searchForPcrValueInBuffer;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fillBufferWithAtLeastOnePacket {
    private static final Charset IconCompatParcelizer = Charset.forName(CharsetNames.UTF_8);

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class AudioAttributesCompatParcelizer {
        public abstract AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str);

        public abstract AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer(String str);

        public abstract AudioAttributesCompatParcelizer IconCompatParcelizer(String str);

        public abstract fillBufferWithAtLeastOnePacket IconCompatParcelizer();

        public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i);

        public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str);

        public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

        public abstract AudioAttributesCompatParcelizer read(String str);

        public abstract AudioAttributesCompatParcelizer read(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

        public abstract AudioAttributesCompatParcelizer read(read readVar);

        public abstract AudioAttributesCompatParcelizer write(String str);
    }

    public abstract String AudioAttributesCompatParcelizer();

    public abstract String AudioAttributesImplApi21Parcelizer();

    public abstract RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer();

    public abstract read AudioAttributesImplBaseParcelizer();

    public abstract String IconCompatParcelizer();

    public abstract int MediaBrowserCompatCustomActionResultReceiver();

    public abstract String MediaBrowserCompatItemReceiver();

    protected abstract AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem();

    public abstract String RemoteActionCompatParcelizer();

    public abstract IconCompatParcelizer read();

    public abstract String write();

    public static AudioAttributesCompatParcelizer RatingCompat() {
        return new readLastScrValue.AudioAttributesCompatParcelizer();
    }

    public final fillBufferWithAtLeastOnePacket write(access102<RemoteActionCompatParcelizer.read> access102Var) {
        if (AudioAttributesImplApi26Parcelizer() == null) {
            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
        }
        return MediaBrowserCompatMediaItem().read(AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(access102Var)).IconCompatParcelizer();
    }

    public final fillBufferWithAtLeastOnePacket read(long j, boolean z, String str) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (AudioAttributesImplApi26Parcelizer() != null) {
            audioAttributesCompatParcelizerMediaBrowserCompatMediaItem.read(AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(j, z, str));
        }
        return audioAttributesCompatParcelizerMediaBrowserCompatMediaItem.IconCompatParcelizer();
    }

    public final fillBufferWithAtLeastOnePacket read(String str) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (AudioAttributesImplApi26Parcelizer() != null) {
            audioAttributesCompatParcelizerMediaBrowserCompatMediaItem.read(AudioAttributesImplApi26Parcelizer().write(str));
        }
        return audioAttributesCompatParcelizerMediaBrowserCompatMediaItem.IconCompatParcelizer();
    }

    public final fillBufferWithAtLeastOnePacket IconCompatParcelizer(String str) {
        return MediaBrowserCompatMediaItem().read(str).IconCompatParcelizer();
    }

    public static abstract class read {

        /* JADX INFO: loaded from: classes5.dex */
        public static abstract class RemoteActionCompatParcelizer {
            public abstract read AudioAttributesCompatParcelizer();

            public abstract RemoteActionCompatParcelizer IconCompatParcelizer(String str);

            public abstract RemoteActionCompatParcelizer write(access102<AbstractC0083read> access102Var);
        }

        public abstract String AudioAttributesCompatParcelizer();

        public abstract access102<AbstractC0083read> read();

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return new readFirstScrValueFromBuffer.write();
        }

        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$read$read, reason: collision with other inner class name */
        public static abstract class AbstractC0083read {

            /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$read$read$RemoteActionCompatParcelizer */
            /* JADX INFO: loaded from: classes5.dex */
            public static abstract class RemoteActionCompatParcelizer {
                public abstract AbstractC0083read AudioAttributesCompatParcelizer();

                public abstract RemoteActionCompatParcelizer read(byte[] bArr);

                public abstract RemoteActionCompatParcelizer write(String str);
            }

            public abstract byte[] IconCompatParcelizer();

            public abstract String write();

            public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
                return new readDuration.write();
            }
        }
    }

    public static abstract class write {

        public static abstract class read {
            public abstract read AudioAttributesCompatParcelizer(String str);

            public abstract read RemoteActionCompatParcelizer(String str);

            public abstract write RemoteActionCompatParcelizer();
        }

        public abstract String RemoteActionCompatParcelizer();

        public abstract String write();

        public static read IconCompatParcelizer() {
            return new readFirstScrValue.write();
        }
    }

    public static abstract class RemoteActionCompatParcelizer {
        public abstract IconCompatParcelizer AudioAttributesCompatParcelizer();

        public abstract String AudioAttributesImplApi21Parcelizer();

        public abstract String AudioAttributesImplApi26Parcelizer();

        public abstract write AudioAttributesImplBaseParcelizer();

        public abstract String IconCompatParcelizer();

        public abstract long MediaBrowserCompatCustomActionResultReceiver();

        public abstract int MediaBrowserCompatItemReceiver();

        public abstract AbstractC0069RemoteActionCompatParcelizer MediaDescriptionCompat();

        public abstract boolean MediaMetadataCompat();

        public abstract MediaBrowserCompatCustomActionResultReceiver RatingCompat();

        public abstract Long RemoteActionCompatParcelizer();

        public abstract access102<read> read();

        public abstract AudioAttributesCompatParcelizer write();

        public static AbstractC0069RemoteActionCompatParcelizer MediaBrowserCompatMediaItem() {
            return new readScrValueFromPackHeader.read().AudioAttributesCompatParcelizer(false);
        }

        public final byte[] MediaBrowserCompatSearchResultReceiver() {
            return AudioAttributesImplApi26Parcelizer().getBytes(fillBufferWithAtLeastOnePacket.IconCompatParcelizer);
        }

        final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(access102<read> access102Var) {
            return MediaDescriptionCompat().read(access102Var).RemoteActionCompatParcelizer();
        }

        final RemoteActionCompatParcelizer IconCompatParcelizer(long j, boolean z, String str) {
            AbstractC0069RemoteActionCompatParcelizer abstractC0069RemoteActionCompatParcelizerMediaDescriptionCompat = MediaDescriptionCompat();
            abstractC0069RemoteActionCompatParcelizerMediaDescriptionCompat.AudioAttributesCompatParcelizer(Long.valueOf(j));
            abstractC0069RemoteActionCompatParcelizerMediaDescriptionCompat.AudioAttributesCompatParcelizer(z);
            if (str != null) {
                abstractC0069RemoteActionCompatParcelizerMediaDescriptionCompat.read(MediaBrowserCompatCustomActionResultReceiver.write().write(str).read());
            }
            return abstractC0069RemoteActionCompatParcelizerMediaDescriptionCompat.RemoteActionCompatParcelizer();
        }

        final RemoteActionCompatParcelizer write(String str) {
            return MediaDescriptionCompat().IconCompatParcelizer(str).RemoteActionCompatParcelizer();
        }

        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes5.dex */
        public static abstract class AbstractC0069RemoteActionCompatParcelizer {
            public abstract AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Long l);

            public abstract AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(write writeVar);

            public abstract AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(boolean z);

            public abstract AbstractC0069RemoteActionCompatParcelizer IconCompatParcelizer(String str);

            public abstract AbstractC0069RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str);

            public abstract RemoteActionCompatParcelizer RemoteActionCompatParcelizer();

            public abstract AbstractC0069RemoteActionCompatParcelizer read(int i);

            public abstract AbstractC0069RemoteActionCompatParcelizer read(long j);

            public abstract AbstractC0069RemoteActionCompatParcelizer read(access102<read> access102Var);

            public abstract AbstractC0069RemoteActionCompatParcelizer read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver);

            public abstract AbstractC0069RemoteActionCompatParcelizer write(String str);

            public abstract AbstractC0069RemoteActionCompatParcelizer write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

            public abstract AbstractC0069RemoteActionCompatParcelizer write(IconCompatParcelizer iconCompatParcelizer);

            public final AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(byte[] bArr) {
                return write(new String(bArr, fillBufferWithAtLeastOnePacket.IconCompatParcelizer));
            }
        }

        public static abstract class MediaBrowserCompatCustomActionResultReceiver {

            /* JADX INFO: loaded from: classes5.dex */
            public static abstract class read {
                public abstract MediaBrowserCompatCustomActionResultReceiver read();

                public abstract read write(String str);
            }

            public abstract String RemoteActionCompatParcelizer();

            public static read write() {
                return new readLastPcrValue.AudioAttributesCompatParcelizer();
            }
        }

        public static abstract class IconCompatParcelizer {

            public static abstract class AudioAttributesCompatParcelizer {
                public abstract String write();
            }

            /* JADX INFO: loaded from: classes5.dex */
            public static abstract class write {
                public abstract write AudioAttributesCompatParcelizer(String str);

                public abstract IconCompatParcelizer AudioAttributesCompatParcelizer();

                public abstract write AudioAttributesImplApi26Parcelizer(String str);

                public abstract write IconCompatParcelizer(String str);

                public abstract write RemoteActionCompatParcelizer(String str);

                public abstract write read(String str);

                public abstract write write(String str);
            }

            public abstract String AudioAttributesCompatParcelizer();

            public abstract String AudioAttributesImplBaseParcelizer();

            public abstract String IconCompatParcelizer();

            public abstract AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver();

            public abstract String RemoteActionCompatParcelizer();

            public abstract String read();

            public abstract String write();

            public static write MediaBrowserCompatItemReceiver() {
                return new isDurationReadFinished.write();
            }
        }

        public static abstract class write {

            /* JADX INFO: loaded from: classes5.dex */
            public static abstract class AudioAttributesCompatParcelizer {
                public abstract AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str);

                public abstract AudioAttributesCompatParcelizer IconCompatParcelizer(int i);

                public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str);

                public abstract AudioAttributesCompatParcelizer write(boolean z);

                public abstract write write();
            }

            public abstract String AudioAttributesCompatParcelizer();

            public abstract boolean IconCompatParcelizer();

            public abstract int RemoteActionCompatParcelizer();

            public abstract String write();

            public static AudioAttributesCompatParcelizer read() {
                return new readFirstPcrValueFromBuffer.IconCompatParcelizer();
            }
        }

        public static abstract class AudioAttributesCompatParcelizer {

            /* JADX INFO: loaded from: classes5.dex */
            public static abstract class read {
                public abstract read AudioAttributesCompatParcelizer(String str);

                public abstract AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer();

                public abstract read IconCompatParcelizer(String str);

                public abstract read RemoteActionCompatParcelizer(int i);

                public abstract read RemoteActionCompatParcelizer(long j);

                public abstract read read(int i);

                public abstract read read(long j);

                public abstract read read(String str);

                public abstract read read(boolean z);

                public abstract read write(int i);
            }

            public abstract String AudioAttributesCompatParcelizer();

            public abstract int AudioAttributesImplApi21Parcelizer();

            public abstract String AudioAttributesImplBaseParcelizer();

            public abstract long IconCompatParcelizer();

            public abstract long MediaBrowserCompatCustomActionResultReceiver();

            public abstract boolean MediaBrowserCompatItemReceiver();

            public abstract int RemoteActionCompatParcelizer();

            public abstract String read();

            public abstract int write();

            public static read AudioAttributesImplApi26Parcelizer() {
                return new readScrValueFromPack.read();
            }
        }

        public static abstract class read {

            /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$read, reason: collision with other inner class name */
            public static abstract class AbstractC0072read {
                public abstract AbstractC0072read AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

                public abstract read AudioAttributesCompatParcelizer();

                public abstract AbstractC0072read IconCompatParcelizer(long j);

                public abstract AbstractC0072read IconCompatParcelizer(write writeVar);

                public abstract AbstractC0072read write(String str);

                public abstract AbstractC0072read write(AbstractC0071RemoteActionCompatParcelizer abstractC0071RemoteActionCompatParcelizer);
            }

            public abstract write AudioAttributesCompatParcelizer();

            public abstract AbstractC0072read AudioAttributesImplApi26Parcelizer();

            public abstract IconCompatParcelizer IconCompatParcelizer();

            public abstract String RemoteActionCompatParcelizer();

            public abstract long read();

            public abstract AbstractC0071RemoteActionCompatParcelizer write();

            public static AbstractC0072read MediaBrowserCompatCustomActionResultReceiver() {
                return new PsExtractorExternalSyntheticLambda0.IconCompatParcelizer();
            }

            public static abstract class write {

                public static abstract class IconCompatParcelizer {
                    public abstract IconCompatParcelizer AudioAttributesCompatParcelizer(int i);

                    public abstract IconCompatParcelizer AudioAttributesCompatParcelizer(access102<write> access102Var);

                    public abstract IconCompatParcelizer IconCompatParcelizer(access102<write> access102Var);

                    public abstract IconCompatParcelizer RemoteActionCompatParcelizer(Boolean bool);

                    public abstract IconCompatParcelizer RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

                    public abstract write RemoteActionCompatParcelizer();
                }

                public abstract Boolean AudioAttributesCompatParcelizer();

                public abstract IconCompatParcelizer AudioAttributesImplApi26Parcelizer();

                public abstract AudioAttributesCompatParcelizer IconCompatParcelizer();

                public abstract access102<write> RemoteActionCompatParcelizer();

                public abstract access102<write> read();

                public abstract int write();

                public static IconCompatParcelizer AudioAttributesImplBaseParcelizer() {
                    return new PsExtractor.read();
                }

                public static abstract class AudioAttributesCompatParcelizer {

                    /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
                    public static abstract class AbstractC0078RemoteActionCompatParcelizer {
                        public abstract AbstractC0078RemoteActionCompatParcelizer IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

                        public abstract AbstractC0078RemoteActionCompatParcelizer IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

                        public abstract AbstractC0078RemoteActionCompatParcelizer RemoteActionCompatParcelizer(access102<AbstractC0073AudioAttributesCompatParcelizer> access102Var);

                        public abstract AbstractC0078RemoteActionCompatParcelizer read(access102<AbstractC0079read> access102Var);

                        public abstract AbstractC0078RemoteActionCompatParcelizer read(AbstractC0081write abstractC0081write);

                        public abstract AudioAttributesCompatParcelizer write();
                    }

                    public abstract AbstractC0081write AudioAttributesCompatParcelizer();

                    public abstract access102<AbstractC0073AudioAttributesCompatParcelizer> IconCompatParcelizer();

                    public abstract IconCompatParcelizer RemoteActionCompatParcelizer();

                    public abstract IconCompatParcelizer read();

                    public abstract access102<AbstractC0079read> write();

                    public static AbstractC0078RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
                        return new SectionReader.AudioAttributesCompatParcelizer();
                    }

                    /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
                    public static abstract class AbstractC0073AudioAttributesCompatParcelizer {

                        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$read, reason: collision with other inner class name */
                        public static abstract class AbstractC0076read {
                            public abstract AbstractC0076read AudioAttributesCompatParcelizer(access102<AbstractC0074AudioAttributesCompatParcelizer> access102Var);

                            public abstract AbstractC0073AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer();

                            public abstract AbstractC0076read RemoteActionCompatParcelizer(int i);

                            public abstract AbstractC0076read write(String str);
                        }

                        public abstract access102<AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer();

                        public abstract String RemoteActionCompatParcelizer();

                        public abstract int write();

                        public static AbstractC0076read read() {
                            return new TsBinarySearchSeeker.AudioAttributesCompatParcelizer();
                        }

                        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
                        public static abstract class AbstractC0074AudioAttributesCompatParcelizer {

                            /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$read, reason: collision with other inner class name */
                            public static abstract class AbstractC0075read {
                                public abstract AbstractC0075read AudioAttributesCompatParcelizer(String str);

                                public abstract AbstractC0075read IconCompatParcelizer(String str);

                                public abstract AbstractC0075read RemoteActionCompatParcelizer(long j);

                                public abstract AbstractC0075read read(int i);

                                public abstract AbstractC0074AudioAttributesCompatParcelizer read();

                                public abstract AbstractC0075read write(long j);
                            }

                            public abstract String AudioAttributesCompatParcelizer();

                            public abstract long IconCompatParcelizer();

                            public abstract long RemoteActionCompatParcelizer();

                            public abstract int read();

                            public abstract String write();

                            public static AbstractC0075read AudioAttributesImplBaseParcelizer() {
                                return new TsBinarySearchSeekerTsPcrSeeker.write();
                            }
                        }
                    }

                    /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write, reason: collision with other inner class name */
                    public static abstract class AbstractC0081write {

                        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write$RemoteActionCompatParcelizer, reason: collision with other inner class name */
                        public static abstract class AbstractC0082RemoteActionCompatParcelizer {
                            public abstract AbstractC0082RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str);

                            public abstract AbstractC0082RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(access102<AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> access102Var);

                            public abstract AbstractC0081write AudioAttributesCompatParcelizer();

                            public abstract AbstractC0082RemoteActionCompatParcelizer IconCompatParcelizer(AbstractC0081write abstractC0081write);

                            public abstract AbstractC0082RemoteActionCompatParcelizer read(String str);

                            public abstract AbstractC0082RemoteActionCompatParcelizer write(int i);
                        }

                        public abstract access102<AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer();

                        public abstract int IconCompatParcelizer();

                        public abstract String RemoteActionCompatParcelizer();

                        public abstract AbstractC0081write read();

                        public abstract String write();

                        public static AbstractC0082RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer() {
                            return new PsExtractorPesReader.IconCompatParcelizer();
                        }
                    }

                    public static abstract class IconCompatParcelizer {

                        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
                        public static abstract class AbstractC0077IconCompatParcelizer {
                            public abstract AbstractC0077IconCompatParcelizer RemoteActionCompatParcelizer(long j);

                            public abstract AbstractC0077IconCompatParcelizer RemoteActionCompatParcelizer(String str);

                            public abstract IconCompatParcelizer read();

                            public abstract AbstractC0077IconCompatParcelizer write(String str);
                        }

                        public abstract String AudioAttributesCompatParcelizer();

                        public abstract long IconCompatParcelizer();

                        public abstract String write();

                        public static AbstractC0077IconCompatParcelizer RemoteActionCompatParcelizer() {
                            return new TsDurationReader.AudioAttributesCompatParcelizer();
                        }
                    }

                    /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$read, reason: collision with other inner class name */
                    public static abstract class AbstractC0079read {
                        public abstract long IconCompatParcelizer();

                        public abstract String RemoteActionCompatParcelizer();

                        public abstract long read();

                        public abstract String write();

                        public static AbstractC0080RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
                            return new SectionPayloadReader.AudioAttributesCompatParcelizer();
                        }

                        public final byte[] MediaBrowserCompatItemReceiver() {
                            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                            if (strRemoteActionCompatParcelizer != null) {
                                return strRemoteActionCompatParcelizer.getBytes(fillBufferWithAtLeastOnePacket.IconCompatParcelizer);
                            }
                            return null;
                        }

                        /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$read$RemoteActionCompatParcelizer, reason: collision with other inner class name */
                        public static abstract class AbstractC0080RemoteActionCompatParcelizer {
                            public abstract AbstractC0080RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str);

                            public abstract AbstractC0080RemoteActionCompatParcelizer RemoteActionCompatParcelizer(long j);

                            public abstract AbstractC0080RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str);

                            public abstract AbstractC0080RemoteActionCompatParcelizer read(long j);

                            public abstract AbstractC0079read read();

                            public final AbstractC0080RemoteActionCompatParcelizer IconCompatParcelizer(byte[] bArr) {
                                return RemoteActionCompatParcelizer(new String(bArr, fillBufferWithAtLeastOnePacket.IconCompatParcelizer));
                            }
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer, reason: collision with other inner class name */
            public static abstract class AbstractC0071RemoteActionCompatParcelizer {

                /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer$write */
                public static abstract class write {
                    public abstract write AudioAttributesCompatParcelizer(Double d);

                    public abstract AbstractC0071RemoteActionCompatParcelizer AudioAttributesCompatParcelizer();

                    public abstract write IconCompatParcelizer(boolean z);

                    public abstract write RemoteActionCompatParcelizer(int i);

                    public abstract write read(int i);

                    public abstract write read(long j);

                    public abstract write write(long j);
                }

                public abstract int AudioAttributesCompatParcelizer();

                public abstract boolean AudioAttributesImplApi26Parcelizer();

                public abstract long IconCompatParcelizer();

                public abstract long RemoteActionCompatParcelizer();

                public abstract int read();

                public abstract Double write();

                public static write AudioAttributesImplBaseParcelizer() {
                    return new searchForPcrValueInBuffer.RemoteActionCompatParcelizer();
                }
            }

            public static abstract class IconCompatParcelizer {

                /* JADX INFO: renamed from: o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
                public static abstract class AbstractC0070IconCompatParcelizer {
                    public abstract IconCompatParcelizer AudioAttributesCompatParcelizer();

                    public abstract AbstractC0070IconCompatParcelizer RemoteActionCompatParcelizer(String str);
                }

                public abstract String AudioAttributesCompatParcelizer();

                public static AbstractC0070IconCompatParcelizer write() {
                    return new SeiReader.read();
                }
            }
        }
    }

    public static abstract class IconCompatParcelizer {

        /* JADX INFO: loaded from: classes5.dex */
        public static abstract class write {
            public abstract write AudioAttributesCompatParcelizer(int i);

            public abstract write AudioAttributesCompatParcelizer(long j);

            public abstract write IconCompatParcelizer(int i);

            public abstract write IconCompatParcelizer(long j);

            public abstract write RemoteActionCompatParcelizer(String str);

            public abstract write RemoteActionCompatParcelizer(access102<read> access102Var);

            public abstract IconCompatParcelizer RemoteActionCompatParcelizer();

            public abstract write read(long j);

            public abstract write write(int i);

            public abstract write write(String str);
        }

        public abstract access102<read> AudioAttributesCompatParcelizer();

        public abstract long AudioAttributesImplApi26Parcelizer();

        public abstract long AudioAttributesImplBaseParcelizer();

        public abstract String IconCompatParcelizer();

        public abstract String MediaBrowserCompatCustomActionResultReceiver();

        public abstract int MediaBrowserCompatItemReceiver();

        public abstract int RemoteActionCompatParcelizer();

        public abstract long read();

        public abstract int write();

        public static write AudioAttributesImplApi21Parcelizer() {
            return new readLastScrValueFromBuffer.IconCompatParcelizer();
        }

        public static abstract class read {

            /* JADX INFO: loaded from: classes5.dex */
            public static abstract class write {
                public abstract read IconCompatParcelizer();

                public abstract write RemoteActionCompatParcelizer(String str);

                public abstract write read(String str);

                public abstract write write(String str);
            }

            public abstract String IconCompatParcelizer();

            public abstract String RemoteActionCompatParcelizer();

            public abstract String write();

            public static write read() {
                return new finishReadDuration.AudioAttributesCompatParcelizer();
            }
        }
    }
}
