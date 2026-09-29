package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface LessonCompletedDialog extends setLockedFromSeek, ReadableByteChannel {
    byte[] AudioAttributesCompatParcelizer(long j) throws IOException;

    LessonCompletedDialog AudioAttributesImplApi21Parcelizer();

    resetCurrentSelectedPosition AudioAttributesImplApi26Parcelizer();

    void AudioAttributesImplApi26Parcelizer(long j) throws IOException;

    InputStream AudioAttributesImplBaseParcelizer();

    void AudioAttributesImplBaseParcelizer(long j) throws IOException;

    long IconCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) throws IOException;

    boolean MediaBrowserCompatCustomActionResultReceiver() throws IOException;

    boolean MediaBrowserCompatCustomActionResultReceiver(long j) throws IOException;

    long MediaBrowserCompatMediaItem() throws IOException;

    byte[] MediaBrowserCompatSearchResultReceiver() throws IOException;

    String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException;

    byte MediaMetadataCompat() throws IOException;

    long RatingCompat() throws IOException;

    int RemoteActionCompatParcelizer(Options options) throws IOException;

    long RemoteActionCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) throws IOException;

    short onAddQueueItem() throws IOException;

    int onCustomAction() throws IOException;

    String onMediaButtonEvent() throws IOException;

    getRelatedModuleAdapter read(long j) throws IOException;

    @getRenewGrpId
    resetCurrentSelectedPosition read();

    long write(setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault) throws IOException;

    String write(long j) throws IOException;

    String write(Charset charset) throws IOException;
}
