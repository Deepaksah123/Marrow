package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lo/complete;", "Lkotlin/Function1;", "", "p0", "read", "(Ljava/util/List;Lo/getAnswerMap;)Ljava/util/List;", "", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;ILo/getAnswerMap;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class addExternal {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(complete completeVar) {
        return true;
    }

    private static final List<complete> read(List<complete> list, getAnswerMap<? super complete, Boolean> getanswermap) {
        List listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (complete completeVar : list) {
            List<complete> list2 = read(completeVar.RemoteActionCompatParcelizer(), getanswermap);
            ArrayList arrayList2 = new ArrayList();
            for (complete completeVar2 : list2) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) (completeVar2.getAudioAttributesCompatParcelizer() == null ? completeVar2.RemoteActionCompatParcelizer() : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(completeVar2)));
            }
            ArrayList arrayList3 = arrayList2;
            if (getanswermap.invoke(completeVar).booleanValue()) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new complete(completeVar.getRead(), completeVar.getRemoteActionCompatParcelizer(), completeVar.getWrite(), completeVar.getAudioAttributesCompatParcelizer(), arrayList3, completeVar.getAudioAttributesImplApi21Parcelizer(), completeVar.getMediaBrowserCompatCustomActionResultReceiver()));
            } else {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new complete("<root>", -1, appendReferring.INSTANCE.IconCompatParcelizer(), null, arrayList3, null, null));
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) listRemoteActionCompatParcelizer);
        }
        return arrayList;
    }

    public static /* synthetic */ String AudioAttributesCompatParcelizer$default(List list, int i, getAnswerMap getanswermap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            getanswermap = new getAnswerMap() { // from class: o._addPropertyIndex
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(addExternal.AudioAttributesCompatParcelizer((complete) obj2));
                }
            };
        }
        return AudioAttributesCompatParcelizer(list, i, getanswermap);
    }

    public static final String AudioAttributesCompatParcelizer(List<complete> list, int i, getAnswerMap<? super complete, Boolean> getanswermap) {
        String str = TestGroupLSModel.read((CharSequence) ".", i);
        StringBuilder sb = new StringBuilder();
        for (complete completeVar : IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) read(list, getanswermap), getConfigExpirySeconds.read(new getAnswerMap() { // from class: o.start
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return addExternal.AudioAttributesImplApi21Parcelizer((complete) obj);
            }
        }, new getAnswerMap() { // from class: o.ExternalTypeHandlerExtTypedProperty
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return addExternal.AudioAttributesImplBaseParcelizer((complete) obj);
            }
        }, new getAnswerMap() { // from class: o.ExternalTypeHandlerBuilder
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return addExternal.AudioAttributesImplApi26Parcelizer((complete) obj);
            }
        }))) {
            if (completeVar.getAudioAttributesCompatParcelizer() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('|');
                sb2.append(completeVar.getRead());
                sb2.append(':');
                sb2.append(completeVar.getRemoteActionCompatParcelizer());
                sb.append(sb2.toString());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
                sb.append('\n');
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("|<root>");
                sb.append(sb3.toString());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
                sb.append('\n');
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            }
            String string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) AudioAttributesCompatParcelizer(completeVar.RemoteActionCompatParcelizer(), i + 1, getanswermap)).toString();
            if (string.length() > 0) {
                sb.append(string);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
                sb.append('\n');
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable AudioAttributesImplApi21Parcelizer(complete completeVar) {
        return completeVar.getRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable AudioAttributesImplApi26Parcelizer(complete completeVar) {
        return Integer.valueOf(completeVar.write().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable AudioAttributesImplBaseParcelizer(complete completeVar) {
        return Integer.valueOf(completeVar.getRemoteActionCompatParcelizer());
    }
}
