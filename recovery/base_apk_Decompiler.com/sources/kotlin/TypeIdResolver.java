package kotlin;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class TypeIdResolver {
    private static final String AudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
    private static final String write = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    private static final String read = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
    private static final String IconCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
    private static final String RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);

    public static ArrayList<Bundle> read(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (getDescForKnownTypeIds getdescforknowntypeids : (getDescForKnownTypeIds[]) spanned.getSpans(0, spanned.length(), getDescForKnownTypeIds.class)) {
            arrayList.add(AudioAttributesCompatParcelizer(spanned, getdescforknowntypeids, 1, getdescforknowntypeids.read()));
        }
        for (typeFromId typefromid : (typeFromId[]) spanned.getSpans(0, spanned.length(), typeFromId.class)) {
            arrayList.add(AudioAttributesCompatParcelizer(spanned, typefromid, 2, typefromid.IconCompatParcelizer()));
        }
        for (TypeDeserializer1 typeDeserializer1 : (TypeDeserializer1[]) spanned.getSpans(0, spanned.length(), TypeDeserializer1.class)) {
            arrayList.add(AudioAttributesCompatParcelizer(spanned, typeDeserializer1, 3, null));
        }
        return arrayList;
    }

    public static void AudioAttributesCompatParcelizer(Bundle bundle, Spannable spannable) {
        int i = bundle.getInt(AudioAttributesCompatParcelizer);
        int i2 = bundle.getInt(write);
        int i3 = bundle.getInt(read);
        int i4 = bundle.getInt(IconCompatParcelizer, -1);
        Bundle bundle2 = bundle.getBundle(RemoteActionCompatParcelizer);
        if (i4 == 1) {
            spannable.setSpan(getDescForKnownTypeIds.read((Bundle) buildTypeSerializer.IconCompatParcelizer(bundle2)), i, i2, i3);
        } else if (i4 == 2) {
            spannable.setSpan(typeFromId.IconCompatParcelizer((Bundle) buildTypeSerializer.IconCompatParcelizer(bundle2)), i, i2, i3);
        } else {
            if (i4 != 3) {
                return;
            }
            spannable.setSpan(new TypeDeserializer1(), i, i2, i3);
        }
    }

    private static Bundle AudioAttributesCompatParcelizer(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(AudioAttributesCompatParcelizer, spanned.getSpanStart(obj));
        bundle2.putInt(write, spanned.getSpanEnd(obj));
        bundle2.putInt(read, spanned.getSpanFlags(obj));
        bundle2.putInt(IconCompatParcelizer, i);
        if (bundle != null) {
            bundle2.putBundle(RemoteActionCompatParcelizer, bundle);
        }
        return bundle2;
    }
}
