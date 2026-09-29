package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\t\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u000e\u0010\u0006"}, d2 = {"Lo/_handleOddName;", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "p0", "read", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;", "Lo/_reportInvalidChar;", "Lo/parseMediumName;", "RemoteActionCompatParcelizer", "Lo/findName;", "write", "(Lo/getAnswerMap;)Lo/findName;", "Lo/findSerializer;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WriterBasedJsonGenerator {
    public static final _handleOddName read(_handleOddName _handleoddname, getAnswerMap<? super findSetterInfo, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new parseEscapedName(getanswermap));
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super _reportInvalidChar, parseMediumName> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new slowParseName(getanswermap));
    }

    public static final findName write(getAnswerMap<? super _reportInvalidChar, parseMediumName> getanswermap) {
        return new _reportInvalidInitial(new _reportInvalidChar(), getanswermap);
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super findSerializer, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new _appendCharacterEscape(getanswermap));
    }
}
