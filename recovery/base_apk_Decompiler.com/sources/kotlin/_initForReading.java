package kotlin;

import kotlin.Metadata;
import kotlin._reportUndetectableSource;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\b\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\b\u0010\rJ#\u0010\u000e\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u000f\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\rJ#\u0010\u0010\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_initForReading;", "Lo/Module;", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _initForReading extends Module {
    withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j);

    default int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return _reportUndetectableSource.INSTANCE.read(new _reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver() { // from class: o._initForReading.5
            @Override // o._reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver
            public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                return _initForReading.this.read(withcontentvaluehandler, istypeorsupertypeof, j);
            }
        }, getvaluehandler, hashandlers, i);
    }

    default int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return _reportUndetectableSource.INSTANCE.write(new _reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver() { // from class: o._initForReading.1
            @Override // o._reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver
            public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                return _initForReading.this.read(withcontentvaluehandler, istypeorsupertypeof, j);
            }
        }, getvaluehandler, hashandlers, i);
    }

    default int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return _reportUndetectableSource.INSTANCE.RemoteActionCompatParcelizer(new _reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver() { // from class: o._initForReading.4
            @Override // o._reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver
            public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                return _initForReading.this.read(withcontentvaluehandler, istypeorsupertypeof, j);
            }
        }, getvaluehandler, hashandlers, i);
    }

    default int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return _reportUndetectableSource.INSTANCE.IconCompatParcelizer(new _reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver() { // from class: o._initForReading.2
            @Override // o._reportUndetectableSource.MediaBrowserCompatCustomActionResultReceiver
            public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                return _initForReading.this.read(withcontentvaluehandler, istypeorsupertypeof, j);
            }
        }, getvaluehandler, hashandlers, i);
    }
}
