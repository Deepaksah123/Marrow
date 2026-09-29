package kotlin;

import android.content.Context;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.MediaItemClippingProperties;
import kotlin.MediaItemDrmConfigurationBuilder;
import kotlin.canKeepMediaPeriodHolder;
import kotlin.setPeakBitrate;

/* JADX INFO: loaded from: classes2.dex */
public final class setPixelWidthHeightRatio {
    private setForceDefaultLicenseUri AudioAttributesCompatParcelizer;
    private setForceDefaultLicenseUri AudioAttributesImplApi21Parcelizer;
    private MediaItemClippingProperties.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private setDrmSessionForClearPeriods AudioAttributesImplBaseParcelizer;
    private setSubtitleConfigurations IconCompatParcelizer;
    private getKeySetId MediaBrowserCompatMediaItem;
    private boolean MediaMetadataCompat;
    private MediaItemDrmConfigurationBuilder RatingCompat;
    private access3900 RemoteActionCompatParcelizer;
    private setForceDefaultLicenseUri onCommand;
    private canKeepMediaPeriodHolder.write onCustomAction;
    private List<getUpdatedMediaPeriodInfo<Object>> read;
    private getRendererOffset write;
    private final Map<Class<?>, setTileCountHorizontal<?, ?>> MediaBrowserCompatCustomActionResultReceiver = new setTitleOptional();
    private final setPeakBitrate.write MediaBrowserCompatSearchResultReceiver = new setPeakBitrate.write();
    private int MediaDescriptionCompat = 4;
    private Glide.AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver = new Glide.AudioAttributesCompatParcelizer() { // from class: o.setPixelWidthHeightRatio.3
        @Override // com.bumptech.glide.Glide.AudioAttributesCompatParcelizer
        public final getPlayingPeriod RemoteActionCompatParcelizer() {
            return new getPlayingPeriod();
        }
    };

    public static final class IconCompatParcelizer {
    }

    public final void RemoteActionCompatParcelizer(canKeepMediaPeriodHolder.write writeVar) {
        this.onCustomAction = writeVar;
    }

    public final Glide RemoteActionCompatParcelizer(Context context, List<getFirstMediaPeriodInfoOfNextPeriod> list, getFirstMediaPeriodInfo getfirstmediaperiodinfo) {
        if (this.onCommand == null) {
            this.onCommand = setForceDefaultLicenseUri.AudioAttributesCompatParcelizer();
        }
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = setForceDefaultLicenseUri.IconCompatParcelizer();
        }
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = setForceDefaultLicenseUri.read();
        }
        if (this.RatingCompat == null) {
            this.RatingCompat = new MediaItemDrmConfigurationBuilder.read(context).read();
        }
        if (this.write == null) {
            this.write = new handlePrepared();
        }
        if (this.RemoteActionCompatParcelizer == null) {
            int iAudioAttributesCompatParcelizer = this.RatingCompat.AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer > 0) {
                this.RemoteActionCompatParcelizer = new access4200(iAudioAttributesCompatParcelizer);
            } else {
                this.RemoteActionCompatParcelizer = new MediaItemClippingConfigurationBuilder();
            }
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new setRelativeToLiveWindow(this.RatingCompat.read());
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = new forceSessionsForAudioAndVideoTracks(this.RatingCompat.write());
        }
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = new MediaItemDrmConfigurationExternalSyntheticLambda0(context);
        }
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new setDrmSessionForClearPeriods(this.MediaBrowserCompatMediaItem, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.onCommand, setForceDefaultLicenseUri.RemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer, this.MediaMetadataCompat);
        }
        List<getUpdatedMediaPeriodInfo<Object>> list2 = this.read;
        if (list2 == null) {
            this.read = Collections.emptyList();
        } else {
            this.read = Collections.unmodifiableList(list2);
        }
        return new Glide(context, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, new canKeepMediaPeriodHolder(this.onCustomAction), this.write, this.MediaDescriptionCompat, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.read, list, getfirstmediaperiodinfo, this.MediaBrowserCompatSearchResultReceiver.read());
    }

    static final class write {
        write() {
        }
    }
}
