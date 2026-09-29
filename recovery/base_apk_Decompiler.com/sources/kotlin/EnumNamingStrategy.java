package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._parser;
import kotlin._reportUndetectableSource;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0013J#\u0010\u0010\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0016H&¢\u0006\u0004\b\u0010\u0010\u0017J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u0005\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0016H&¢\u0006\u0004\b\u0005\u0010\u0017J#\u0010\u0019\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/EnumNamingStrategy;", "Lo/_initForReading;", "Lo/getKey;", "p0", "", "AudioAttributesCompatParcelizer", "(J)Z", "Lo/_parser$IconCompatParcelizer;", "Lo/isAbstract;", "RemoteActionCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;Lo/isAbstract;)Z", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/weirdStringException;", "(Lo/weirdStringException;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/DeserializationContext1;", "Lo/hasHandlers;", "", "(Lo/DeserializationContext1;Lo/hasHandlers;I)I", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EnumNamingStrategy extends _initForReading {
    boolean AudioAttributesCompatParcelizer(long p0);

    default boolean RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, isAbstract isabstract) {
        return false;
    }

    withHandlersFrom read(weirdStringException weirdstringexception, isTypeOrSuperTypeOf istypeorsupertypeof, long j);

    /* JADX INFO: renamed from: o.EnumNamingStrategy$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "IconCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $write;

        public final void IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, this.$write, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            IconCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(_parser _parserVar) {
            super(1);
            this.$write = _parserVar;
        }
    }

    @Override // kotlin._initForReading
    default withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass4(_parserVarWrite), 4, null);
    }

    default int read(DeserializationContext1 deserializationContext1, hasHandlers hashandlers, int i) {
        _bindAndClose audioAttributesImplApi21Parcelizer = getRead().getAudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
        readerFor write = audioAttributesImplApi21Parcelizer.getWrite();
        toMagicModuleMetaRepoModel.write(write);
        if (write.onPlay()) {
            return _reportUndetectableSource.INSTANCE.AudioAttributesCompatParcelizer(new _reportUndetectableSource.read() { // from class: o.EnumNamingStrategy.3
                @Override // o._reportUndetectableSource.read
                public final withHandlersFrom RemoteActionCompatParcelizer(weirdStringException weirdstringexception, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                    return EnumNamingStrategy.this.read(weirdstringexception, istypeorsupertypeof, j);
                }
            }, deserializationContext1, hashandlers, i);
        }
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    default int write(DeserializationContext1 deserializationContext1, hasHandlers hashandlers, int i) {
        _bindAndClose audioAttributesImplApi21Parcelizer = getRead().getAudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
        readerFor write = audioAttributesImplApi21Parcelizer.getWrite();
        toMagicModuleMetaRepoModel.write(write);
        if (write.onPlay()) {
            return _reportUndetectableSource.INSTANCE.write(new _reportUndetectableSource.read() { // from class: o.EnumNamingStrategy.2
                @Override // o._reportUndetectableSource.read
                public final withHandlersFrom RemoteActionCompatParcelizer(weirdStringException weirdstringexception, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                    return EnumNamingStrategy.this.read(weirdstringexception, istypeorsupertypeof, j);
                }
            }, deserializationContext1, hashandlers, i);
        }
        return hashandlers.read(i);
    }

    default int AudioAttributesCompatParcelizer(DeserializationContext1 deserializationContext1, hasHandlers hashandlers, int i) {
        _bindAndClose audioAttributesImplApi21Parcelizer = getRead().getAudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
        readerFor write = audioAttributesImplApi21Parcelizer.getWrite();
        toMagicModuleMetaRepoModel.write(write);
        if (write.onPlay()) {
            return _reportUndetectableSource.INSTANCE.IconCompatParcelizer(new _reportUndetectableSource.read() { // from class: o.EnumNamingStrategy.5
                @Override // o._reportUndetectableSource.read
                public final withHandlersFrom RemoteActionCompatParcelizer(weirdStringException weirdstringexception, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                    return EnumNamingStrategy.this.read(weirdstringexception, istypeorsupertypeof, j);
                }
            }, deserializationContext1, hashandlers, i);
        }
        return hashandlers.write(i);
    }

    default int IconCompatParcelizer(DeserializationContext1 deserializationContext1, hasHandlers hashandlers, int i) {
        _bindAndClose audioAttributesImplApi21Parcelizer = getRead().getAudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
        readerFor write = audioAttributesImplApi21Parcelizer.getWrite();
        toMagicModuleMetaRepoModel.write(write);
        if (write.onPlay()) {
            return _reportUndetectableSource.INSTANCE.read(new _reportUndetectableSource.read() { // from class: o.EnumNamingStrategy.1
                @Override // o._reportUndetectableSource.read
                public final withHandlersFrom RemoteActionCompatParcelizer(weirdStringException weirdstringexception, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
                    return EnumNamingStrategy.this.read(weirdstringexception, istypeorsupertypeof, j);
                }
            }, deserializationContext1, hashandlers, i);
        }
        return hashandlers.IconCompatParcelizer(i);
    }
}
