package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\f\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0012J)\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u0013\u001a\u00020\u00168\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Lo/setImageURI;", "Lo/withTypeHandler;", "Lo/AppCompatRadioButton;", "p0", "<init>", "(Lo/AppCompatRadioButton;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "write", "(Lo/getValueHandler;Ljava/util/List;I)I", "RemoteActionCompatParcelizer", "read", "Lo/AppCompatRadioButton;", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setImageURI implements withTypeHandler {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AppCompatRadioButton read;

    public setImageURI(AppCompatRadioButton appCompatRadioButton) {
        this.read = appCompatRadioButton;
    }

    /* JADX INFO: renamed from: o.setImageURI$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ List<_parser> $IconCompatParcelizer;

        public final void AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            List<_parser> list = this.$IconCompatParcelizer;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, list.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(List<? extends _parser> list) {
            super(1);
            this.$IconCompatParcelizer = list;
        }
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            _parser _parserVarWrite = list.get(i).write(j);
            iMax = Math.max(iMax, _parserVarWrite.getRead());
            iMax2 = Math.max(iMax2, _parserVarWrite.getRemoteActionCompatParcelizer());
            arrayList.add(_parserVarWrite);
        }
        ArrayList arrayList2 = arrayList;
        if (withcontentvaluehandler.r_()) {
            this.RemoteActionCompatParcelizer = true;
            long j2 = -1;
            this.read.IconCompatParcelizer().write(getKey.AudioAttributesCompatParcelizer(getKey.read((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) iMax2)) | (((long) iMax) << 32))));
        } else if (!this.RemoteActionCompatParcelizer) {
            long j3 = -1;
            this.read.IconCompatParcelizer().write(getKey.AudioAttributesCompatParcelizer(getKey.read((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) iMax2)) | (((long) iMax) << 32))));
        }
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iMax, iMax2, null, new AnonymousClass5(arrayList2), 4, null);
    }

    @Override // kotlin.withTypeHandler
    public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iAudioAttributesCompatParcelizer = list.get(0).AudioAttributesCompatParcelizer(i);
        int iWrite = IntermediateLoginResponseBody.write((List) list);
        if (iWrite > 0) {
            int i2 = 1;
            while (true) {
                int iAudioAttributesCompatParcelizer2 = list.get(i2).AudioAttributesCompatParcelizer(i);
                if (iAudioAttributesCompatParcelizer2 > iAudioAttributesCompatParcelizer) {
                    iAudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer2;
                }
                if (i2 == iWrite) {
                    break;
                }
                i2++;
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.withTypeHandler
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int i2 = list.get(0).read(i);
        int iWrite = IntermediateLoginResponseBody.write((List) list);
        if (iWrite > 0) {
            int i3 = 1;
            while (true) {
                int i4 = list.get(i3).read(i);
                if (i4 > i2) {
                    i2 = i4;
                }
                if (i3 == iWrite) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    @Override // kotlin.withTypeHandler
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iWrite = list.get(0).write(i);
        int iWrite2 = IntermediateLoginResponseBody.write((List) list);
        if (iWrite2 > 0) {
            int i2 = 1;
            while (true) {
                int iWrite3 = list.get(i2).write(i);
                if (iWrite3 > iWrite) {
                    iWrite = iWrite3;
                }
                if (i2 == iWrite2) {
                    break;
                }
                i2++;
            }
        }
        return iWrite;
    }

    @Override // kotlin.withTypeHandler
    public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iIconCompatParcelizer = list.get(0).IconCompatParcelizer(i);
        int iWrite = IntermediateLoginResponseBody.write((List) list);
        if (iWrite > 0) {
            int i2 = 1;
            while (true) {
                int iIconCompatParcelizer2 = list.get(i2).IconCompatParcelizer(i);
                if (iIconCompatParcelizer2 > iIconCompatParcelizer) {
                    iIconCompatParcelizer = iIconCompatParcelizer2;
                }
                if (i2 == iWrite) {
                    break;
                }
                i2++;
            }
        }
        return iIconCompatParcelizer;
    }
}
