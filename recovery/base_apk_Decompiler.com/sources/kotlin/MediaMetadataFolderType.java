package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import kotlin.onAvailableCommandsChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadataFolderType implements IllegalSeekPositionException<ByteBuffer, setYear> {
    private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
    private static final IconCompatParcelizer read = new IconCompatParcelizer();
    private final MediaMetadataMediaType AudioAttributesImplApi26Parcelizer;
    private final IconCompatParcelizer IconCompatParcelizer;
    private final List<ImageHeaderParser> MediaBrowserCompatCustomActionResultReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final RemoteActionCompatParcelizer write;

    public MediaMetadataFolderType(Context context, List<ImageHeaderParser> list, access3900 access3900Var, setSubtitleConfigurations setsubtitleconfigurations) {
        this(context, list, access3900Var, setsubtitleconfigurations, read, AudioAttributesCompatParcelizer);
    }

    private MediaMetadataFolderType(Context context, List<ImageHeaderParser> list, access3900 access3900Var, setSubtitleConfigurations setsubtitleconfigurations, IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.write = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = new MediaMetadataMediaType(access3900Var, setsubtitleconfigurations);
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(ByteBuffer byteBuffer, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return !((Boolean) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(disassociateNoSampleRenderersWithEmptySampleStream.IconCompatParcelizer)).booleanValue() && isHeart.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MediaMetadataPictureType AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        onAudioAttributesChanged onaudioattributeschangedRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(byteBuffer);
        try {
            return read(byteBuffer, i, i2, onaudioattributeschangedRemoteActionCompatParcelizer, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        } finally {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(onaudioattributeschangedRemoteActionCompatParcelizer);
        }
    }

    private MediaMetadataPictureType read(ByteBuffer byteBuffer, int i, int i2, onAudioAttributesChanged onaudioattributeschanged, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        StringBuilder sb;
        long jRemoteActionCompatParcelizer = createTimeline.RemoteActionCompatParcelizer();
        try {
            ForwardingPlayerForwardingListener forwardingPlayerForwardingListenerWrite = onaudioattributeschanged.write();
            if (forwardingPlayerForwardingListenerWrite.AudioAttributesCompatParcelizer() > 0 && forwardingPlayerForwardingListenerWrite.IconCompatParcelizer() == 0) {
                Bitmap.Config config = r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(disassociateNoSampleRenderersWithEmptySampleStream.read) == onTrackSelectionParametersChanged.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                onAvailableCommandsChanged onavailablecommandschanged = RemoteActionCompatParcelizer.read(this.AudioAttributesImplApi26Parcelizer, forwardingPlayerForwardingListenerWrite, byteBuffer, IconCompatParcelizer(forwardingPlayerForwardingListenerWrite, i, i2));
                onavailablecommandschanged.write(config);
                onavailablecommandschanged.RemoteActionCompatParcelizer();
                Bitmap bitmapAudioAttributesImplApi26Parcelizer = onavailablecommandschanged.AudioAttributesImplApi26Parcelizer();
                if (bitmapAudioAttributesImplApi26Parcelizer != null) {
                    return new MediaMetadataPictureType(new setYear(this.RemoteActionCompatParcelizer, onavailablecommandschanged, access3300.write(), i, i2, bitmapAudioAttributesImplApi26Parcelizer));
                }
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    sb = new StringBuilder("Decoded GIF from stream in ");
                    sb.append(createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer));
                }
            } else if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
            }
        }
    }

    private static int IconCompatParcelizer(ForwardingPlayerForwardingListener forwardingPlayerForwardingListener, int i, int i2) {
        int iMin = Math.min(forwardingPlayerForwardingListener.write() / i2, forwardingPlayerForwardingListener.RemoteActionCompatParcelizer() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            forwardingPlayerForwardingListener.RemoteActionCompatParcelizer();
            forwardingPlayerForwardingListener.write();
        }
        return iMax;
    }

    static class RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        static onAvailableCommandsChanged read(onAvailableCommandsChanged.write writeVar, ForwardingPlayerForwardingListener forwardingPlayerForwardingListener, ByteBuffer byteBuffer, int i) {
            return new onDeviceInfoChanged(writeVar, forwardingPlayerForwardingListener, byteBuffer, i);
        }
    }

    static class IconCompatParcelizer {
        private final Queue<onAudioAttributesChanged> write = moveMediaSourceRange.write(0);

        IconCompatParcelizer() {
        }

        final onAudioAttributesChanged RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
            onAudioAttributesChanged onaudioattributeschangedAudioAttributesCompatParcelizer;
            synchronized (this) {
                onAudioAttributesChanged onaudioattributeschangedPoll = this.write.poll();
                if (onaudioattributeschangedPoll == null) {
                    onaudioattributeschangedPoll = new onAudioAttributesChanged();
                }
                onaudioattributeschangedAudioAttributesCompatParcelizer = onaudioattributeschangedPoll.AudioAttributesCompatParcelizer(byteBuffer);
            }
            return onaudioattributeschangedAudioAttributesCompatParcelizer;
        }

        final void AudioAttributesCompatParcelizer(onAudioAttributesChanged onaudioattributeschanged) {
            synchronized (this) {
                onaudioattributeschanged.RemoteActionCompatParcelizer();
                this.write.offer(onaudioattributeschanged);
            }
        }
    }
}
