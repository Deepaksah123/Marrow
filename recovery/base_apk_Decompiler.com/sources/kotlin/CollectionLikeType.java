package kotlin;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CollectionLikeType implements constructCollectionType.AudioAttributesCompatParcelizer {
    public final long AudioAttributesImplApi21Parcelizer;
    public final SubTypeValidator AudioAttributesImplApi26Parcelizer;
    public final _handleUnknownTypeId AudioAttributesImplBaseParcelizer;
    public final long MediaBrowserCompatCustomActionResultReceiver = StdDelegatingSerializer.AudioAttributesCompatParcelizer();
    public final long MediaBrowserCompatItemReceiver;
    public final int MediaBrowserCompatSearchResultReceiver;
    public final C0170format MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final int RatingCompat;

    public CollectionLikeType(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, int i, C0170format c0170format, int i2, Object obj, long j, long j2) {
        this.AudioAttributesImplBaseParcelizer = new _handleUnknownTypeId(_hastyperesolver);
        this.AudioAttributesImplApi26Parcelizer = (SubTypeValidator) buildTypeSerializer.IconCompatParcelizer(subTypeValidator);
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.MediaDescriptionCompat = c0170format;
        this.RatingCompat = i2;
        this.MediaMetadataCompat = obj;
        this.MediaBrowserCompatItemReceiver = j;
        this.AudioAttributesImplApi21Parcelizer = j2;
    }

    public final long MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer - this.MediaBrowserCompatItemReceiver;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer.write();
    }

    public final Uri AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
    }

    public final Map<String, List<String>> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
    }
}
