package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes2.dex */
public final class getLiveOffsetUs extends _handleOddName.IconCompatParcelizer implements _initForReading {
    private int RemoteActionCompatParcelizer;
    private int write;

    public final void AudioAttributesCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(int i) {
        this.write = i;
    }

    public getLiveOffsetUs(int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        long j2;
        toMagicModuleMetaRepoModel.write(withcontentvaluehandler, "");
        toMagicModuleMetaRepoModel.write(istypeorsupertypeof, "");
        long jWrite = PropertyValueBuffer.write(j, SetterlessProperty.read(this.RemoteActionCompatParcelizer, this.write));
        if (PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) == Integer.MAX_VALUE && PropertyValueAny.AudioAttributesImplBaseParcelizer(j) != Integer.MAX_VALUE) {
            j2 = PropertyValueBuffer.read(getKey.write(jWrite), getKey.write(jWrite), (getKey.write(jWrite) * this.write) / this.RemoteActionCompatParcelizer, (getKey.write(jWrite) * this.write) / this.RemoteActionCompatParcelizer);
        } else if (PropertyValueAny.AudioAttributesImplBaseParcelizer(j) == Integer.MAX_VALUE && PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) != Integer.MAX_VALUE) {
            j2 = PropertyValueBuffer.read((getKey.RemoteActionCompatParcelizer(jWrite) * this.RemoteActionCompatParcelizer) / this.write, (getKey.RemoteActionCompatParcelizer(jWrite) * this.RemoteActionCompatParcelizer) / this.write, getKey.RemoteActionCompatParcelizer(jWrite), getKey.RemoteActionCompatParcelizer(jWrite));
        } else {
            j2 = PropertyValueBuffer.read(getKey.write(jWrite), getKey.write(jWrite), getKey.RemoteActionCompatParcelizer(jWrite), getKey.RemoteActionCompatParcelizer(jWrite));
        }
        _parser _parserVarWrite = istypeorsupertypeof.write(j2);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass4(_parserVarWrite), 4, null);
    }

    /* JADX INFO: renamed from: o.getLiveOffsetUs$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        private /* synthetic */ _parser $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            read(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, this.$IconCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(_parser _parserVar) {
            super(1);
            this.$IconCompatParcelizer = _parserVar;
        }
    }
}
