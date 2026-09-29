package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import in.juspay.hyper.constants.LogCategory;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.CurrentQuery;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0096\u0002¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0013\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\u0019\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", TtmlNode.LEFT, "element", "Lkotlin/coroutines/CoroutineContext$Element;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "size", "", "contains", "", "containsAll", LogCategory.CONTEXT, "equals", "other", "", "hashCode", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setDecoderLevel implements CurrentQuery, Serializable {
    private final CurrentQuery.write AudioAttributesCompatParcelizer;
    private final CurrentQuery IconCompatParcelizer;

    public setDecoderLevel(CurrentQuery currentQuery, CurrentQuery.write writeVar) {
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.IconCompatParcelizer = currentQuery;
        this.AudioAttributesCompatParcelizer = writeVar;
    }

    @Override // kotlin.CurrentQuery
    public final /* bridge */ CurrentQuery plus(CurrentQuery currentQuery) {
        return CurrentQuery.DefaultImpls.plus(this, currentQuery);
    }

    @Override // kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        while (true) {
            E e = (E) this.AudioAttributesCompatParcelizer.get(iconCompatParcelizer);
            if (e != null) {
                return e;
            }
            CurrentQuery currentQuery = this.IconCompatParcelizer;
            if (currentQuery instanceof setDecoderLevel) {
                this = (setDecoderLevel) currentQuery;
            } else {
                return (E) currentQuery.get(iconCompatParcelizer);
            }
        }
    }

    @Override // kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        return magicModuleSubmissionRequestBody.invoke((Object) this.IconCompatParcelizer.fold(r, magicModuleSubmissionRequestBody), this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        if (this.AudioAttributesCompatParcelizer.get(iconCompatParcelizer) != null) {
            return this.IconCompatParcelizer;
        }
        CurrentQuery currentQueryMinusKey = this.IconCompatParcelizer.minusKey(iconCompatParcelizer);
        return currentQueryMinusKey == this.IconCompatParcelizer ? this : currentQueryMinusKey == VideoSessionResponseBody.RemoteActionCompatParcelizer ? this.AudioAttributesCompatParcelizer : new setDecoderLevel(currentQueryMinusKey, this.AudioAttributesCompatParcelizer);
    }

    private final int AudioAttributesCompatParcelizer() {
        int i = 2;
        while (true) {
            CurrentQuery currentQuery = this.IconCompatParcelizer;
            this = currentQuery instanceof setDecoderLevel ? (setDecoderLevel) currentQuery : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean AudioAttributesCompatParcelizer(CurrentQuery.write writeVar) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(get(writeVar.getKey()), writeVar);
    }

    private final boolean IconCompatParcelizer(setDecoderLevel setdecoderlevel) {
        while (AudioAttributesCompatParcelizer(setdecoderlevel.AudioAttributesCompatParcelizer)) {
            CurrentQuery currentQuery = setdecoderlevel.IconCompatParcelizer;
            if (currentQuery instanceof setDecoderLevel) {
                setdecoderlevel = (setDecoderLevel) currentQuery;
            } else {
                toMagicModuleMetaRepoModel.read(currentQuery, "");
                return AudioAttributesCompatParcelizer((CurrentQuery.write) currentQuery);
            }
        }
        return false;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setDecoderLevel)) {
            return false;
        }
        setDecoderLevel setdecoderlevel = (setDecoderLevel) other;
        return setdecoderlevel.AudioAttributesCompatParcelizer() == AudioAttributesCompatParcelizer() && setdecoderlevel.IconCompatParcelizer(this);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((String) fold("", new MagicModuleSubmissionRequestBody() { // from class: o.getScreen
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return setDecoderLevel.RemoteActionCompatParcelizer((String) obj, (CurrentQuery.write) obj2);
            }
        }));
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RemoteActionCompatParcelizer(String str, CurrentQuery.write writeVar) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        if (str.length() == 0) {
            return writeVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(writeVar);
        return sb.toString();
    }

    private final Object writeReplace() {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        final CurrentQuery[] currentQueryArr = new CurrentQuery[iAudioAttributesCompatParcelizer];
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        fold(getShowPopup.INSTANCE, new MagicModuleSubmissionRequestBody() { // from class: o.getErrorTitle
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return setDecoderLevel.RemoteActionCompatParcelizer(currentQueryArr, iconCompatParcelizer, (getShowPopup) obj, (CurrentQuery.write) obj2);
            }
        });
        if (iconCompatParcelizer.AudioAttributesCompatParcelizer != iAudioAttributesCompatParcelizer) {
            throw new IllegalStateException("Check failed.");
        }
        return new write(currentQueryArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CurrentQuery[] currentQueryArr, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, getShowPopup getshowpopup, CurrentQuery.write writeVar) {
        toMagicModuleMetaRepoModel.write(getshowpopup, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        int i = iconCompatParcelizer.AudioAttributesCompatParcelizer;
        iconCompatParcelizer.AudioAttributesCompatParcelizer = i + 1;
        currentQueryArr[i] = writeVar;
        return getShowPopup.INSTANCE;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class write implements Serializable {
        public static final C0138write IconCompatParcelizer = new C0138write(null);
        private final CurrentQuery[] AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.setDecoderLevel$write$write, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setDecoderLevel$write$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0138write {
            private C0138write() {
            }

            public /* synthetic */ C0138write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public write(CurrentQuery[] currentQueryArr) {
            toMagicModuleMetaRepoModel.write(currentQueryArr, "");
            this.AudioAttributesCompatParcelizer = currentQueryArr;
        }

        private final Object readResolve() {
            CurrentQuery[] currentQueryArr = this.AudioAttributesCompatParcelizer;
            CurrentQuery currentQueryPlus = VideoSessionResponseBody.RemoteActionCompatParcelizer;
            for (CurrentQuery currentQuery : currentQueryArr) {
                currentQueryPlus = currentQueryPlus.plus(currentQuery);
            }
            return currentQueryPlus;
        }
    }
}
