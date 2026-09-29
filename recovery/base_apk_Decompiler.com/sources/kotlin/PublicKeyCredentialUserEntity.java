package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PublicKeyCredentialUserEntity {
    public static final PublicKeyCredentialRpEntity AudioAttributesCompatParcelizer(ParsableByteArray parsableByteArray, float f) {
        toMagicModuleMetaRepoModel.write(parsableByteArray, "");
        return new PublicKeyCredentialRpEntity(getOnline.RemoteActionCompatParcelizer(f), parsableByteArray.read(), parsableByteArray.AudioAttributesCompatParcelizer(), parsableByteArray.AudioAttributesImplApi26Parcelizer());
    }

    public static final List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> AudioAttributesCompatParcelizer(List<recycle> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<recycle> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (recycle recycleVar : list2) {
            arrayList.add(new PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException(recycleVar.read(), recycleVar.IconCompatParcelizer(), recycleVar.AudioAttributesCompatParcelizer(), recycleVar.RemoteActionCompatParcelizer()));
        }
        return IntermediateLoginResponseBody.onPlay(arrayList);
    }

    public static final getIcon AudioAttributesCompatParcelizer(String str, boolean z, readSignedExpGolombCodedInt readsignedexpgolombcodedint, ParsableByteArray parsableByteArray, List<recycle> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(readsignedexpgolombcodedint, "");
        toMagicModuleMetaRepoModel.write(parsableByteArray, "");
        toMagicModuleMetaRepoModel.write(list, "");
        String strMediaBrowserCompatSearchResultReceiver = readsignedexpgolombcodedint.MediaBrowserCompatSearchResultReceiver();
        String strWrite = readsignedexpgolombcodedint.write();
        String strAudioAttributesImplBaseParcelizer = readsignedexpgolombcodedint.AudioAttributesImplBaseParcelizer();
        int iMediaBrowserCompatItemReceiver = readsignedexpgolombcodedint.MediaBrowserCompatItemReceiver();
        int iAudioAttributesCompatParcelizer = readsignedexpgolombcodedint.AudioAttributesCompatParcelizer();
        int iIconCompatParcelizer = parsableByteArray.IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = parsableByteArray.RemoteActionCompatParcelizer();
        List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(list);
        long jRemoteActionCompatParcelizer = readsignedexpgolombcodedint.RemoteActionCompatParcelizer();
        long jIconCompatParcelizer = readsignedexpgolombcodedint.IconCompatParcelizer();
        int iWrite = parsableByteArray.write();
        int iAudioAttributesImplApi21Parcelizer = parsableByteArray.AudioAttributesImplApi21Parcelizer();
        return new getIcon(strWrite, readsignedexpgolombcodedint.MediaDescriptionCompat(), strMediaBrowserCompatSearchResultReceiver, strAudioAttributesImplBaseParcelizer, str, iMediaBrowserCompatItemReceiver, iAudioAttributesCompatParcelizer, jIconCompatParcelizer, jRemoteActionCompatParcelizer, iIconCompatParcelizer, iRemoteActionCompatParcelizer, listAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer(parsableByteArray, readsignedexpgolombcodedint.AudioAttributesImplApi26Parcelizer()), iWrite, iAudioAttributesImplApi21Parcelizer, readsignedexpgolombcodedint.RatingCompat(), z, readsignedexpgolombcodedint.AudioAttributesCompatParcelizer() == 2);
    }
}
