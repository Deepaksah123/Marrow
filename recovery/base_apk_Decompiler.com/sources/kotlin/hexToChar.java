package kotlin;

import kotlin.Metadata;
import kotlin.illegalSurrogate;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0011J/\u0010\t\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR$\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/hexToChar;", "Lo/illegalSurrogate;", "Lo/getTokenColumnNr;", "", "Lo/_leading3;", "Lo/_getCharDesc;", "Lo/reportInvalidBase64Char;", "p0", "p1", "read", "(Lo/getTokenColumnNr;Lo/_leading3;)Lo/hexToChar;", "Lo/hexToChar$write;", "IconCompatParcelizer", "()Lo/hexToChar$write;", "T", "RemoteActionCompatParcelizer", "(Lo/getTokenColumnNr;)Ljava/lang/Object;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface hexToChar extends illegalSurrogate<getTokenColumnNr<Object>, _leading3<Object>>, _getCharDesc, reportInvalidBase64Char {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/hexToChar$write;", "Lo/illegalSurrogate$AudioAttributesCompatParcelizer;", "Lo/getTokenColumnNr;", "", "Lo/_leading3;", "Lo/hexToChar;", "RemoteActionCompatParcelizer", "()Lo/hexToChar;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write extends illegalSurrogate.AudioAttributesCompatParcelizer<getTokenColumnNr<Object>, _leading3<Object>> {
        hexToChar RemoteActionCompatParcelizer();
    }

    write IconCompatParcelizer();

    hexToChar read(getTokenColumnNr<Object> p0, _leading3<Object> p1);

    @Override // kotlin.reportInvalidBase64Char
    default <T> T RemoteActionCompatParcelizer(getTokenColumnNr<T> gettokencolumnnr) {
        return (T) resetInt.read(this, gettokencolumnnr);
    }
}
