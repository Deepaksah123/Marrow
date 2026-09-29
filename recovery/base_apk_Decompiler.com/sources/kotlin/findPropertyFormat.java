package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/findPropertyFormat;", "Lo/depositSchemaProperty;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "Lo/isNonStaticInnerClass;", "", "AudioAttributesCompatParcelizer", "(I)V", "IconCompatParcelizer", "Landroid/view/View;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findPropertyFormat implements depositSchemaProperty {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final View RemoteActionCompatParcelizer;

    public findPropertyFormat(View view) {
        this.RemoteActionCompatParcelizer = view;
    }

    @Override // kotlin.depositSchemaProperty
    public final void AudioAttributesCompatParcelizer(int p0) {
        int i;
        if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.IconCompatParcelizer())) {
            i = 16;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.write())) {
            i = 6;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.AudioAttributesCompatParcelizer())) {
            i = 13;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.read())) {
            i = 23;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.RemoteActionCompatParcelizer())) {
            i = 3;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            i = 0;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            i = 17;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.MediaBrowserCompatItemReceiver())) {
            i = 27;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            i = 26;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            i = 9;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.RatingCompat())) {
            i = 22;
        } else if (isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.MediaMetadataCompat())) {
            i = 21;
        } else {
            i = isNonStaticInnerClass.IconCompatParcelizer(p0, isNonStaticInnerClass.INSTANCE.MediaDescriptionCompat()) ? 1 : -1;
        }
        InvalidTypeIdException.read(this.RemoteActionCompatParcelizer, i);
    }
}
