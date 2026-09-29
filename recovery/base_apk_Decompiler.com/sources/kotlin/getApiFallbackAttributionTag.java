package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getApiFallbackAttributionTag extends getApiKey {
    private final getTrackTypeOfCodec AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final GoogleApiSettingsBuilder MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final List<String> write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getApiFallbackAttributionTag(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i, int i2) {
        super(i2);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(gettracktypeofcodec, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(googleApiSettingsBuilder, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesImplBaseParcelizer = str;
        this.AudioAttributesCompatParcelizer = gettracktypeofcodec;
        this.RemoteActionCompatParcelizer = str2;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompatSearchResultReceiver = str6;
        this.AudioAttributesImplApi21Parcelizer = str7;
        this.MediaMetadataCompat = str8;
        this.AudioAttributesImplApi26Parcelizer = str9;
        this.MediaBrowserCompatItemReceiver = googleApiSettingsBuilder;
        this.write = list;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.read = i2;
    }

    public final String read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final getTrackTypeOfCodec IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final GoogleApiSettingsBuilder RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }
}
