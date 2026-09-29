package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0010\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\b\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\b\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/isJavaLangObject;", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "IconCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "write", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isJavaLangObject extends _handleOddName.RemoteActionCompatParcelizer {
    withHandlersFrom IconCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j);

    default int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return withValueHandler.INSTANCE.read(this, getvaluehandler, hashandlers, i);
    }

    default int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return withValueHandler.INSTANCE.RemoteActionCompatParcelizer(this, getvaluehandler, hashandlers, i);
    }

    default int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return withValueHandler.INSTANCE.write(this, getvaluehandler, hashandlers, i);
    }

    default int IconCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return withValueHandler.INSTANCE.AudioAttributesCompatParcelizer(this, getvaluehandler, hashandlers, i);
    }
}
