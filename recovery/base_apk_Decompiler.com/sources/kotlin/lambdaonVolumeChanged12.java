package kotlin;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B7\b\u0016\u0012.\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005J\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/PersistedEvents;", "Ljava/io/Serializable;", "()V", "appEventMap", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "events", "addEvents", "", "accessTokenAppIdPair", "appEvents", "", "containsKey", "", "get", "keySet", "", "writeReplace", "", "Companion", "SerializationProxyV1", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public final class lambdaonVolumeChanged12 implements Serializable {
    public static final IconCompatParcelizer write = new IconCompatParcelizer(null);
    private final HashMap<lambdaonSkipSilenceEnabledChanged53, List<lambdaonUpstreamDiscarded27>> read;

    public lambdaonVolumeChanged12() {
        this.read = new HashMap<>();
    }

    public lambdaonVolumeChanged12(HashMap<lambdaonSkipSilenceEnabledChanged53, List<lambdaonUpstreamDiscarded27>> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        HashMap<lambdaonSkipSilenceEnabledChanged53, List<lambdaonUpstreamDiscarded27>> map2 = new HashMap<>();
        this.read = map2;
        map2.putAll(map);
    }

    public final Set<lambdaonSkipSilenceEnabledChanged53> IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            Set<lambdaonSkipSilenceEnabledChanged53> setKeySet = this.read.keySet();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
            return setKeySet;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    public final List<lambdaonUpstreamDiscarded27> write(lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(lambdaonskipsilenceenabledchanged53, "");
            return this.read.get(lambdaonskipsilenceenabledchanged53);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    public final void write(lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53, List<lambdaonUpstreamDiscarded27> list) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(lambdaonskipsilenceenabledchanged53, "");
            toMagicModuleMetaRepoModel.write(list, "");
            if (!this.read.containsKey(lambdaonskipsilenceenabledchanged53)) {
                this.read.put(lambdaonskipsilenceenabledchanged53, IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list));
                return;
            }
            List<lambdaonUpstreamDiscarded27> list2 = this.read.get(lambdaonskipsilenceenabledchanged53);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB5\u0012.\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002R6\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1;", "Ljava/io/Serializable;", "proxyEvents", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "readResolve", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class RemoteActionCompatParcelizer implements Serializable {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
        private final HashMap<lambdaonSkipSilenceEnabledChanged53, List<lambdaonUpstreamDiscarded27>> read;

        public RemoteActionCompatParcelizer(HashMap<lambdaonSkipSilenceEnabledChanged53, List<lambdaonUpstreamDiscarded27>> map) {
            toMagicModuleMetaRepoModel.write(map, "");
            this.read = map;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new lambdaonVolumeChanged12(this.read);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lambdaonVolumeChanged12$RemoteActionCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {1, 4, 0})
        public static final class IconCompatParcelizer {
            private IconCompatParcelizer() {
            }

            public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            return new RemoteActionCompatParcelizer(this.read);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lambdaonVolumeChanged12$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {1, 4, 0})
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
