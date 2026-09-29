package kotlin;

import kotlin.StdKeySerializers;
import kotlin.buildIterableSerializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _constructSimple {
    private read IconCompatParcelizer;
    private _fromWellKnownInterface read;

    public interface read {
        default void IconCompatParcelizer() {
        }

        void write();
    }

    public abstract _findPrimitive RemoteActionCompatParcelizer(buildIterableSerializer[] builditerableserializerArr, _writeAsBinary _writeasbinary, StdKeySerializers.write writeVar, PolymorphicTypeValidator polymorphicTypeValidator) throws addNull;

    public buildIterableSerializer.write RemoteActionCompatParcelizer() {
        return null;
    }

    public void read(SubtypeResolver subtypeResolver) {
    }

    public void write(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
    }

    public boolean write() {
        return false;
    }

    public final void IconCompatParcelizer(read readVar, _fromWellKnownInterface _fromwellknowninterface) {
        this.IconCompatParcelizer = readVar;
        this.read = _fromwellknowninterface;
    }

    public void read() {
        this.IconCompatParcelizer = null;
        this.read = null;
    }

    public SubtypeResolver AudioAttributesCompatParcelizer() {
        return SubtypeResolver.RemoteActionCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        read readVar = this.IconCompatParcelizer;
        if (readVar != null) {
            readVar.write();
        }
    }

    protected final void MediaBrowserCompatItemReceiver() {
        read readVar = this.IconCompatParcelizer;
        if (readVar != null) {
            readVar.IconCompatParcelizer();
        }
    }

    protected final _fromWellKnownInterface AudioAttributesImplBaseParcelizer() {
        return (_fromWellKnownInterface) buildTypeSerializer.AudioAttributesCompatParcelizer(this.read);
    }
}
