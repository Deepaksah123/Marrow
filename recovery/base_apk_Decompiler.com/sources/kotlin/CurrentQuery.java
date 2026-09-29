package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/CurrentQuery;", "", "Lo/CurrentQuery$write;", "E", "Lo/CurrentQuery$IconCompatParcelizer;", "p0", "get", "(Lo/CurrentQuery$IconCompatParcelizer;)Lo/CurrentQuery$write;", "R", "Lkotlin/Function2;", "p1", "fold", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/lang/Object;", "plus", "(Lo/CurrentQuery;)Lo/CurrentQuery;", "minusKey", "(Lo/CurrentQuery$IconCompatParcelizer;)Lo/CurrentQuery;", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CurrentQuery {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003"}, d2 = {"Lo/CurrentQuery$IconCompatParcelizer;", "Lo/CurrentQuery$write;", "E", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface IconCompatParcelizer<E extends write> {
    }

    <R> R fold(R p0, MagicModuleSubmissionRequestBody<? super R, ? super write, ? extends R> p1);

    <E extends write> E get(IconCompatParcelizer<E> p0);

    CurrentQuery minusKey(IconCompatParcelizer<?> p0);

    CurrentQuery plus(CurrentQuery p0);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static CurrentQuery plus(CurrentQuery currentQuery, CurrentQuery currentQuery2) {
            toMagicModuleMetaRepoModel.write(currentQuery2, "");
            return currentQuery2 == VideoSessionResponseBody.RemoteActionCompatParcelizer ? currentQuery : (CurrentQuery) currentQuery2.fold(currentQuery, new MagicModuleSubmissionRequestBody() { // from class: o.CalendarDayMatrix
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CurrentQuery.DefaultImpls.RemoteActionCompatParcelizer((CurrentQuery) obj, (CurrentQuery.write) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CurrentQuery RemoteActionCompatParcelizer(CurrentQuery currentQuery, write writeVar) {
            setDecoderLevel setdecoderlevel;
            toMagicModuleMetaRepoModel.write(currentQuery, "");
            toMagicModuleMetaRepoModel.write(writeVar, "");
            CurrentQuery currentQueryMinusKey = currentQuery.minusKey(writeVar.getKey());
            if (currentQueryMinusKey == VideoSessionResponseBody.RemoteActionCompatParcelizer) {
                return writeVar;
            }
            getPlaybackInterval getplaybackinterval = (getPlaybackInterval) currentQueryMinusKey.get(getPlaybackInterval.INSTANCE);
            if (getplaybackinterval == null) {
                setdecoderlevel = new setDecoderLevel(currentQueryMinusKey, writeVar);
            } else {
                CurrentQuery currentQueryMinusKey2 = currentQueryMinusKey.minusKey(getPlaybackInterval.INSTANCE);
                setdecoderlevel = currentQueryMinusKey2 == VideoSessionResponseBody.RemoteActionCompatParcelizer ? new setDecoderLevel(writeVar, getplaybackinterval) : new setDecoderLevel(new setDecoderLevel(currentQueryMinusKey2, writeVar), getplaybackinterval);
            }
            return setdecoderlevel;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/CurrentQuery$write;", "Lo/CurrentQuery;", "E", "Lo/CurrentQuery$IconCompatParcelizer;", "p0", "get", "(Lo/CurrentQuery$IconCompatParcelizer;)Lo/CurrentQuery$write;", "R", "Lkotlin/Function2;", "p1", "fold", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/lang/Object;", "minusKey", "(Lo/CurrentQuery$IconCompatParcelizer;)Lo/CurrentQuery;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface write extends CurrentQuery {
        @Override // kotlin.CurrentQuery
        <R> R fold(R p0, MagicModuleSubmissionRequestBody<? super R, ? super write, ? extends R> p1);

        @Override // kotlin.CurrentQuery
        <E extends write> E get(IconCompatParcelizer<E> p0);

        IconCompatParcelizer<?> getKey();

        @Override // kotlin.CurrentQuery
        CurrentQuery minusKey(IconCompatParcelizer<?> p0);

        /* JADX INFO: loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static CurrentQuery AudioAttributesCompatParcelizer(write writeVar, CurrentQuery currentQuery) {
                toMagicModuleMetaRepoModel.write(currentQuery, "");
                return DefaultImpls.plus(writeVar, currentQuery);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends write> E get(write writeVar, IconCompatParcelizer<E> iconCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.getKey(), iconCompatParcelizer)) {
                    return null;
                }
                toMagicModuleMetaRepoModel.read(writeVar, "");
                return writeVar;
            }

            public static <R> R fold(write writeVar, R r, MagicModuleSubmissionRequestBody<? super R, ? super write, ? extends R> magicModuleSubmissionRequestBody) {
                toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
                return magicModuleSubmissionRequestBody.invoke(r, writeVar);
            }

            public static CurrentQuery minusKey(write writeVar, IconCompatParcelizer<?> iconCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.getKey(), iconCompatParcelizer) ? VideoSessionResponseBody.RemoteActionCompatParcelizer : writeVar;
            }
        }
    }
}
