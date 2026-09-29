package kotlin;

import java.util.concurrent.Executor;
import kotlin.EnumDeserializer;
import kotlin.onTransact;

/* JADX INFO: loaded from: classes2.dex */
public final class q {
    public static final onTransact RemoteActionCompatParcelizer(final getConcatenatedUid getconcatenateduid, final String str, final Executor executor, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getconcatenateduid, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(executor, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        final POJOPropertyBuilder2 pOJOPropertyBuilder2 = new POJOPropertyBuilder2(onTransact.AudioAttributesCompatParcelizer);
        Mp4ExtractorExternalSyntheticLambda0 mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer = EnumDeserializer.AudioAttributesCompatParcelizer(new EnumDeserializer.write() { // from class: o.qa
            @Override // o.EnumDeserializer.write
            public final Object AudioAttributesCompatParcelizer(EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return q.RemoteActionCompatParcelizer(executor, getconcatenateduid, str, getcreatedondatems, pOJOPropertyBuilder2, remoteActionCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer, "");
        return new o(pOJOPropertyBuilder2, mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Executor executor, final getConcatenatedUid getconcatenateduid, final String str, final getCreatedOnDateMs getcreatedondatems, final POJOPropertyBuilder2 pOJOPropertyBuilder2, final EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        executor.execute(new Runnable() { // from class: o.p
            @Override // java.lang.Runnable
            public final void run() {
                q.read(getconcatenateduid, str, getcreatedondatems, pOJOPropertyBuilder2, remoteActionCompatParcelizer);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getConcatenatedUid getconcatenateduid, String str, getCreatedOnDateMs getcreatedondatems, POJOPropertyBuilder2 pOJOPropertyBuilder2, EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        boolean zIconCompatParcelizer = getconcatenateduid.IconCompatParcelizer();
        if (zIconCompatParcelizer) {
            try {
                getconcatenateduid.read(str);
            } finally {
                if (zIconCompatParcelizer) {
                    getconcatenateduid.RemoteActionCompatParcelizer();
                }
            }
        }
        try {
            getcreatedondatems.invoke();
            pOJOPropertyBuilder2.AudioAttributesCompatParcelizer(onTransact.read);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(onTransact.read);
        } catch (Throwable th) {
            pOJOPropertyBuilder2.AudioAttributesCompatParcelizer(new onTransact.IconCompatParcelizer.RemoteActionCompatParcelizer(th));
            remoteActionCompatParcelizer.IconCompatParcelizer(th);
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
    }
}
