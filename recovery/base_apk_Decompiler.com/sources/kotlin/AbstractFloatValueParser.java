package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.convertSurrogate;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0015J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u0005\u0010\fJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u000fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\rH&¢\u0006\u0004\b\b\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/AbstractFloatValueParser;", "E", "Lo/reportInvalid;", "Lo/convertSurrogate;", "p0", "write", "(Ljava/lang/Object;)Lo/AbstractFloatValueParser;", "", "IconCompatParcelizer", "(Ljava/util/Collection;)Lo/AbstractFloatValueParser;", "Lkotlin/Function1;", "", "(Lo/getAnswerMap;)Lo/AbstractFloatValueParser;", "", "p1", "(ILjava/lang/Object;)Lo/AbstractFloatValueParser;", "read", "(I)Lo/AbstractFloatValueParser;", "Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AbstractFloatValueParser<E> extends reportInvalid<E>, convertSurrogate<E> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;", "E", "", "Lo/convertSurrogate$RemoteActionCompatParcelizer;", "Lo/AbstractFloatValueParser;", "IconCompatParcelizer", "()Lo/AbstractFloatValueParser;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AudioAttributesCompatParcelizer<E> extends List<E>, convertSurrogate.RemoteActionCompatParcelizer<E>, getModulesCompleted {
        AbstractFloatValueParser<E> IconCompatParcelizer();
    }

    AbstractFloatValueParser<E> IconCompatParcelizer(int p0);

    AbstractFloatValueParser<E> IconCompatParcelizer(int p0, E p1);

    AbstractFloatValueParser<E> IconCompatParcelizer(E p0);

    AbstractFloatValueParser<E> IconCompatParcelizer(Collection<? extends E> p0);

    AudioAttributesCompatParcelizer<E> RemoteActionCompatParcelizer();

    AbstractFloatValueParser<E> read(int p0, E p1);

    AbstractFloatValueParser<E> write(E p0);

    AbstractFloatValueParser<E> write(Collection<? extends E> p0);

    AbstractFloatValueParser<E> write(getAnswerMap<? super E, Boolean> p0);
}
