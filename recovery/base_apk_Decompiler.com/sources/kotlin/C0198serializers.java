package kotlin;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;
import kotlin.findSize;

/* JADX INFO: renamed from: o.serializers, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0004\u001a\u001b\u0010\u000e\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0002*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u0004"}, d2 = {"Lo/assignIndexes;", "p0", "", "AudioAttributesImplBaseParcelizer", "(I)I", "Lo/_findWithAlias;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/findSize$read;", "AudioAttributesImplApi21Parcelizer", "Lo/findSize$IconCompatParcelizer;", "MediaBrowserCompatItemReceiver", "Lo/findSize$AudioAttributesCompatParcelizer;", "RatingCompat", "Lo/addInjectables;", "read", "(Lo/addInjectables;I)I", "Lo/deserializeWithObjectId;", "", "p1", "AudioAttributesCompatParcelizer", "(Lo/deserializeWithObjectId;Z)Z", "", "RemoteActionCompatParcelizer", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lo/_handleTypedObjectId;", "MediaBrowserCompatMediaItem"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0198serializers {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplBaseParcelizer(int i) {
        if (assignIndexes.read(i, assignIndexes.INSTANCE.IconCompatParcelizer())) {
            return 3;
        }
        if (assignIndexes.read(i, assignIndexes.INSTANCE.RemoteActionCompatParcelizer())) {
            return 4;
        }
        if (assignIndexes.read(i, assignIndexes.INSTANCE.write())) {
            return 2;
        }
        return (!assignIndexes.read(i, assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer()) && assignIndexes.read(i, assignIndexes.INSTANCE.AudioAttributesCompatParcelizer())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatCustomActionResultReceiver(int i) {
        if (_findWithAlias.IconCompatParcelizer(i, _findWithAlias.INSTANCE.IconCompatParcelizer())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        _findWithAlias.IconCompatParcelizer(i, _findWithAlias.INSTANCE.write());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplApi21Parcelizer(int i) {
        if (findSize.read.write(i, findSize.read.INSTANCE.IconCompatParcelizer())) {
            return 0;
        }
        if (findSize.read.write(i, findSize.read.INSTANCE.RemoteActionCompatParcelizer())) {
            return 1;
        }
        return findSize.read.write(i, findSize.read.INSTANCE.read()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatItemReceiver(int i) {
        if (findSize.IconCompatParcelizer.write(i, findSize.IconCompatParcelizer.INSTANCE.RemoteActionCompatParcelizer())) {
            return 0;
        }
        if (findSize.IconCompatParcelizer.write(i, findSize.IconCompatParcelizer.INSTANCE.IconCompatParcelizer())) {
            return 1;
        }
        if (findSize.IconCompatParcelizer.write(i, findSize.IconCompatParcelizer.INSTANCE.read())) {
            return 2;
        }
        return findSize.IconCompatParcelizer.write(i, findSize.IconCompatParcelizer.INSTANCE.write()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RatingCompat(int i) {
        return (!findSize.AudioAttributesCompatParcelizer.read(i, findSize.AudioAttributesCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer()) && findSize.AudioAttributesCompatParcelizer.read(i, findSize.AudioAttributesCompatParcelizer.INSTANCE.write())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(addInjectables addinjectables, int i) {
        int audioAttributesImplBaseParcelizer = addinjectables.getAudioAttributesImplBaseParcelizer();
        for (int i2 = 0; i2 < audioAttributesImplBaseParcelizer; i2++) {
            if (addinjectables.read(i2) > i) {
                return i2;
            }
        }
        return addinjectables.getAudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(deserializeWithObjectId deserializewithobjectid, boolean z) {
        return (!z || ReadableObjectIdReferring.AudioAttributesCompatParcelizer(deserializewithobjectid.MediaDescriptionCompat(), setResolver.RemoteActionCompatParcelizer(0)) || ReadableObjectIdReferring.AudioAttributesCompatParcelizer(deserializewithobjectid.MediaDescriptionCompat(), ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer()) || assignIndexes.read(deserializewithobjectid.onPause(), assignIndexes.INSTANCE.AudioAttributesImplApi21Parcelizer()) || assignIndexes.read(deserializewithobjectid.onPause(), assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer()) || assignIndexes.read(deserializewithobjectid.onPause(), assignIndexes.INSTANCE.read())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence RemoteActionCompatParcelizer(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!buildAbstract.RemoteActionCompatParcelizer(spannableString, constructBeanDeserializerBuilder.class)) {
            getValueClass.IconCompatParcelizer(spannableString, new constructBeanDeserializerBuilder(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatMediaItem(int i) {
        return (!_handleTypedObjectId.RemoteActionCompatParcelizer(i, _handleTypedObjectId.INSTANCE.IconCompatParcelizer()) && _handleTypedObjectId.RemoteActionCompatParcelizer(i, _handleTypedObjectId.INSTANCE.write())) ? 1 : 0;
    }
}
