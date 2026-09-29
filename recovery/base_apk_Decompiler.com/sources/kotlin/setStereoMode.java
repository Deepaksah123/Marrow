package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.MediaItemLiveConfiguration;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda1;
import kotlin.MediaItemSubtitle;
import kotlin.MediaItemSubtitleConfiguration;
import kotlin.MediaItemSubtitleConfigurationExternalSyntheticLambda0;
import kotlin.access4700;
import kotlin.access4800;
import kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;
import kotlin.r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0;
import kotlin.r8lambdanYnhip21U5ox6ugd5TXEves4Z6I;
import kotlin.removeMediaSourcesInternal;
import kotlin.setExtras;
import kotlin.setForceSessionsForAudioAndVideoTracks;
import kotlin.setForcedSessionTrackTypes;
import kotlin.setLicenseUri;
import kotlin.setMaxOffsetMs;
import kotlin.setMediaUri;
import kotlin.setMultiSession;
import kotlin.setPixelWidthHeightRatio;
import kotlin.setReleaseDay;
import kotlin.setSearchQuery;

/* JADX INFO: loaded from: classes2.dex */
public final class setStereoMode {
    public static removeMediaSourcesInternal.RemoteActionCompatParcelizer<setSelectionFlags> IconCompatParcelizer(final Glide glide, final List<getFirstMediaPeriodInfoOfNextPeriod> list, final getFirstMediaPeriodInfo getfirstmediaperiodinfo) {
        return new removeMediaSourcesInternal.RemoteActionCompatParcelizer<setSelectionFlags>() { // from class: o.setStereoMode.5
            private boolean read;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.removeMediaSourcesInternal.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public setSelectionFlags RemoteActionCompatParcelizer() {
                if (this.read) {
                    throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
                }
                MarkerView.AudioAttributesCompatParcelizer("Glide registry");
                this.read = true;
                try {
                    return setStereoMode.write(glide, list, getfirstmediaperiodinfo);
                } finally {
                    this.read = false;
                    MarkerView.RemoteActionCompatParcelizer();
                }
            }
        };
    }

    static setSelectionFlags write(Glide glide, List<getFirstMediaPeriodInfoOfNextPeriod> list, getFirstMediaPeriodInfo getfirstmediaperiodinfo) {
        access3900 access3900Var = glide.read();
        setSubtitleConfigurations setsubtitleconfigurationsWrite = glide.write();
        Context applicationContext = glide.IconCompatParcelizer().getApplicationContext();
        setPeakBitrate setpeakbitrateWrite = glide.IconCompatParcelizer().write();
        setSelectionFlags setselectionflags = new setSelectionFlags();
        AudioAttributesCompatParcelizer(applicationContext, setselectionflags, access3900Var, setsubtitleconfigurationsWrite, setpeakbitrateWrite);
        RemoteActionCompatParcelizer(applicationContext, glide, setselectionflags, list, getfirstmediaperiodinfo);
        return setselectionflags;
    }

    private static void AudioAttributesCompatParcelizer(Context context, setSelectionFlags setselectionflags, access3900 access3900Var, setSubtitleConfigurations setsubtitleconfigurations, setPeakBitrate setpeakbitrate) {
        IllegalSeekPositionException getfoldertypefrommediatype;
        IllegalSeekPositionException setrecordingday;
        setselectionflags.IconCompatParcelizer((ImageHeaderParser) new setAlbumArtist());
        setselectionflags.IconCompatParcelizer((ImageHeaderParser) new setArtworkUri());
        Resources resources = context.getResources();
        List<ImageHeaderParser> listWrite = setselectionflags.write();
        MediaMetadataFolderType mediaMetadataFolderType = new MediaMetadataFolderType(context, listWrite, access3900Var, setsubtitleconfigurations);
        IllegalSeekPositionException<ParcelFileDescriptor, Bitmap> illegalSeekPositionExceptionRemoteActionCompatParcelizer = setMediaType.RemoteActionCompatParcelizer(access3900Var);
        setAlbumTitle setalbumtitle = new setAlbumTitle(setselectionflags.write(), resources.getDisplayMetrics(), access3900Var, setsubtitleconfigurations);
        if (setpeakbitrate.IconCompatParcelizer(setPixelWidthHeightRatio.write.class)) {
            setrecordingday = new setConductor();
            getfoldertypefrommediatype = new MediaMetadataExternalSyntheticLambda0();
        } else {
            getfoldertypefrommediatype = new getFolderTypeFromMediaType(setalbumtitle);
            setrecordingday = new setRecordingDay(setalbumtitle, setsubtitleconfigurations);
        }
        setselectionflags.RemoteActionCompatParcelizer("Animation", InputStream.class, Drawable.class, setReleaseYear.RemoteActionCompatParcelizer(listWrite, setsubtitleconfigurations));
        setselectionflags.RemoteActionCompatParcelizer("Animation", ByteBuffer.class, Drawable.class, setReleaseYear.AudioAttributesCompatParcelizer(listWrite, setsubtitleconfigurations));
        setTotalDiscCount settotaldisccount = new setTotalDiscCount(context);
        buildSubtitle buildsubtitle = new buildSubtitle(setsubtitleconfigurations);
        applyTrackSelection applytrackselection = new applyTrackSelection();
        enableTrackSelectionsInResult enabletrackselectionsinresult = new enableTrackSelectionsInResult();
        ContentResolver contentResolver = context.getContentResolver();
        setselectionflags.AudioAttributesCompatParcelizer(ByteBuffer.class, new setPlayClearContentWithoutKey()).AudioAttributesCompatParcelizer(InputStream.class, new MediaItemRequestMetadata(setsubtitleconfigurations)).RemoteActionCompatParcelizer("Bitmap", ByteBuffer.class, Bitmap.class, getfoldertypefrommediatype).RemoteActionCompatParcelizer("Bitmap", InputStream.class, Bitmap.class, setrecordingday);
        if (ParcelFileDescriptorRewinder.AudioAttributesCompatParcelizer()) {
            setselectionflags.RemoteActionCompatParcelizer("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new setDiscNumber(setalbumtitle));
        }
        setselectionflags.RemoteActionCompatParcelizer("Bitmap", AssetFileDescriptor.class, Bitmap.class, setMediaType.IconCompatParcelizer(access3900Var));
        setselectionflags.RemoteActionCompatParcelizer("Bitmap", ParcelFileDescriptor.class, Bitmap.class, illegalSeekPositionExceptionRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(Bitmap.class, Bitmap.class, setExtras.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).RemoteActionCompatParcelizer("Bitmap", Bitmap.class, Bitmap.class, new setIsBrowsable()).read(Bitmap.class, buildsubtitle).RemoteActionCompatParcelizer("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new access3400(resources, getfoldertypefrommediatype)).RemoteActionCompatParcelizer("BitmapDrawable", InputStream.class, BitmapDrawable.class, new access3400(resources, setrecordingday)).RemoteActionCompatParcelizer("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new access3400(resources, illegalSeekPositionExceptionRemoteActionCompatParcelizer)).read(BitmapDrawable.class, new MediaMetadata(access3900Var, buildsubtitle)).RemoteActionCompatParcelizer("Animation", InputStream.class, setYear.class, new associateNoSampleRenderersWithEmptySampleStream(listWrite, mediaMetadataFolderType, setsubtitleconfigurations)).RemoteActionCompatParcelizer("Animation", ByteBuffer.class, setYear.class, mediaMetadataFolderType).read(setYear.class, new setWriter()).AudioAttributesCompatParcelizer(onAvailableCommandsChanged.class, onAvailableCommandsChanged.class, setExtras.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).RemoteActionCompatParcelizer("Bitmap", onAvailableCommandsChanged.class, Bitmap.class, new createMediaPeriod(access3900Var)).write(Uri.class, Drawable.class, settotaldisccount).write(Uri.class, Bitmap.class, new setIsPlayable(settotaldisccount, access3900Var)).IconCompatParcelizer((r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?>) new setReleaseDay.IconCompatParcelizer()).AudioAttributesCompatParcelizer(File.class, ByteBuffer.class, new setMultiSession.write()).AudioAttributesCompatParcelizer(File.class, InputStream.class, new setLicenseUri.RemoteActionCompatParcelizer()).write(File.class, File.class, new setUserRating()).AudioAttributesCompatParcelizer(File.class, ParcelFileDescriptor.class, new setLicenseUri.IconCompatParcelizer()).AudioAttributesCompatParcelizer(File.class, File.class, setExtras.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).IconCompatParcelizer((r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?>) new r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0.RemoteActionCompatParcelizer(setsubtitleconfigurations));
        if (ParcelFileDescriptorRewinder.AudioAttributesCompatParcelizer()) {
            setselectionflags.IconCompatParcelizer((r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?>) new ParcelFileDescriptorRewinder.AudioAttributesCompatParcelizer());
        }
        setTargetOffsetMs<Integer, InputStream> settargetoffsetmsIconCompatParcelizer = setScheme.IconCompatParcelizer(context);
        setTargetOffsetMs<Integer, AssetFileDescriptor> settargetoffsetmsWrite = setScheme.write(context);
        setTargetOffsetMs<Integer, Drawable> settargetoffsetmsRemoteActionCompatParcelizer = setScheme.RemoteActionCompatParcelizer(context);
        setselectionflags.AudioAttributesCompatParcelizer(Integer.TYPE, InputStream.class, settargetoffsetmsIconCompatParcelizer).AudioAttributesCompatParcelizer(Integer.class, InputStream.class, settargetoffsetmsIconCompatParcelizer).AudioAttributesCompatParcelizer(Integer.TYPE, AssetFileDescriptor.class, settargetoffsetmsWrite).AudioAttributesCompatParcelizer(Integer.class, AssetFileDescriptor.class, settargetoffsetmsWrite).AudioAttributesCompatParcelizer(Integer.TYPE, Drawable.class, settargetoffsetmsRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(Integer.class, Drawable.class, settargetoffsetmsRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(Uri.class, InputStream.class, MediaItemRequestMetadataBuilder.RemoteActionCompatParcelizer(context)).AudioAttributesCompatParcelizer(Uri.class, AssetFileDescriptor.class, MediaItemRequestMetadataBuilder.read(context));
        MediaItemLocalConfigurationExternalSyntheticLambda1.read readVar = new MediaItemLocalConfigurationExternalSyntheticLambda1.read(resources);
        MediaItemLocalConfigurationExternalSyntheticLambda1.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new MediaItemLocalConfigurationExternalSyntheticLambda1.RemoteActionCompatParcelizer(resources);
        MediaItemLocalConfigurationExternalSyntheticLambda1.IconCompatParcelizer iconCompatParcelizer = new MediaItemLocalConfigurationExternalSyntheticLambda1.IconCompatParcelizer(resources);
        setselectionflags.AudioAttributesCompatParcelizer(Integer.class, Uri.class, readVar).AudioAttributesCompatParcelizer(Integer.TYPE, Uri.class, readVar).AudioAttributesCompatParcelizer(Integer.class, AssetFileDescriptor.class, remoteActionCompatParcelizer).AudioAttributesCompatParcelizer(Integer.TYPE, AssetFileDescriptor.class, remoteActionCompatParcelizer).AudioAttributesCompatParcelizer(Integer.class, InputStream.class, iconCompatParcelizer).AudioAttributesCompatParcelizer(Integer.TYPE, InputStream.class, iconCompatParcelizer);
        setselectionflags.AudioAttributesCompatParcelizer(String.class, InputStream.class, new MediaItemLiveConfiguration.IconCompatParcelizer()).AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new MediaItemLiveConfiguration.IconCompatParcelizer()).AudioAttributesCompatParcelizer(String.class, InputStream.class, new access4800.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(String.class, ParcelFileDescriptor.class, new access4800.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer(String.class, AssetFileDescriptor.class, new access4800.write()).AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new setForcedSessionTrackTypes.write(context.getAssets())).AudioAttributesCompatParcelizer(Uri.class, AssetFileDescriptor.class, new setForcedSessionTrackTypes.RemoteActionCompatParcelizer(context.getAssets())).AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new MediaItemSubtitleConfiguration.RemoteActionCompatParcelizer(context)).AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new MediaItemSubtitle.RemoteActionCompatParcelizer(context));
        setselectionflags.AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new MediaItemSubtitleConfigurationExternalSyntheticLambda0.read(context));
        setselectionflags.AudioAttributesCompatParcelizer(Uri.class, ParcelFileDescriptor.class, new MediaItemSubtitleConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer(context));
        setselectionflags.AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new setSearchQuery.RemoteActionCompatParcelizer(contentResolver)).AudioAttributesCompatParcelizer(Uri.class, ParcelFileDescriptor.class, new setSearchQuery.AudioAttributesCompatParcelizer(contentResolver)).AudioAttributesCompatParcelizer(Uri.class, AssetFileDescriptor.class, new setSearchQuery.write(contentResolver)).AudioAttributesCompatParcelizer(Uri.class, InputStream.class, new access4700.write()).AudioAttributesCompatParcelizer(URL.class, InputStream.class, new r8lambdanYnhip21U5ox6ugd5TXEves4Z6I.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(Uri.class, File.class, new setMaxOffsetMs.RemoteActionCompatParcelizer(context)).AudioAttributesCompatParcelizer(setMaxPlaybackSpeed.class, InputStream.class, new setMediaUri.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer(byte[].class, ByteBuffer.class, new setForceSessionsForAudioAndVideoTracks.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(byte[].class, InputStream.class, new setForceSessionsForAudioAndVideoTracks.write()).AudioAttributesCompatParcelizer(Uri.class, Uri.class, setExtras.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer(Drawable.class, Drawable.class, setExtras.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).write(Drawable.class, Drawable.class, new setTotalTrackCount()).AudioAttributesCompatParcelizer(Bitmap.class, BitmapDrawable.class, new isLoadingMediaPeriod(resources)).AudioAttributesCompatParcelizer(Bitmap.class, byte[].class, applytrackselection).AudioAttributesCompatParcelizer(Drawable.class, byte[].class, new continueLoading(access3900Var, applytrackselection, enabletrackselectionsinresult)).AudioAttributesCompatParcelizer(setYear.class, byte[].class, enabletrackselectionsinresult);
        IllegalSeekPositionException<ByteBuffer, Bitmap> illegalSeekPositionExceptionAudioAttributesCompatParcelizer = setMediaType.AudioAttributesCompatParcelizer(access3900Var);
        setselectionflags.write(ByteBuffer.class, Bitmap.class, illegalSeekPositionExceptionAudioAttributesCompatParcelizer);
        setselectionflags.write(ByteBuffer.class, BitmapDrawable.class, new access3400(resources, illegalSeekPositionExceptionAudioAttributesCompatParcelizer));
    }

    private static void RemoteActionCompatParcelizer(Context context, Glide glide, setSelectionFlags setselectionflags, List<getFirstMediaPeriodInfoOfNextPeriod> list, getFirstMediaPeriodInfo getfirstmediaperiodinfo) {
        for (getFirstMediaPeriodInfoOfNextPeriod getfirstmediaperiodinfoofnextperiod : list) {
            try {
                getfirstmediaperiodinfoofnextperiod.IconCompatParcelizer(context, glide, setselectionflags);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sb.append(getfirstmediaperiodinfoofnextperiod.getClass().getName());
                throw new IllegalStateException(sb.toString(), e);
            }
        }
        if (getfirstmediaperiodinfo != null) {
            getfirstmediaperiodinfo.IconCompatParcelizer(context, glide, setselectionflags);
        }
    }
}
