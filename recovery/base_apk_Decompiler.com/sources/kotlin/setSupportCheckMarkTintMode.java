package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;
import kotlin.setSupportImageTintList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\f\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0012J)\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u001b\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\f\u0010\u0016"}, d2 = {"Lo/setSupportCheckMarkTintMode;", "Lo/withTypeHandler;", "Lo/setSupportImageTintList;", "p0", "<init>", "(Lo/setSupportImageTintList;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "write", "(Lo/getValueHandler;Ljava/util/List;I)I", "RemoteActionCompatParcelizer", "read", "Lo/setSupportImageTintList;", "()Lo/setSupportImageTintList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setSupportCheckMarkTintMode implements withTypeHandler {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setSupportImageTintList<?> read;

    public setSupportCheckMarkTintMode(setSupportImageTintList<?> setsupportimagetintlist) {
        this.read = setsupportimagetintlist;
    }

    public final setSupportImageTintList<?> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        int i;
        _parser _parserVar;
        int read;
        _parser _parserVar2;
        int remoteActionCompatParcelizer;
        setSupportCheckMarkTintMode setsupportcheckmarktintmode;
        int i2;
        List<? extends isTypeOrSuperTypeOf> list2 = list;
        long j2 = j;
        int size = list.size();
        _parser[] _parserVarArr = new _parser[size];
        long jRemoteActionCompatParcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();
        List<? extends isTypeOrSuperTypeOf> list3 = list2;
        int size2 = list3.size();
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= size2) {
                break;
            }
            isTypeOrSuperTypeOf istypeorsupertypeof = list2.get(i3);
            Object objQ_ = istypeorsupertypeof.getOnPrepareFromUri();
            setSupportImageTintList.write writeVar = objQ_ instanceof setSupportImageTintList.write ? (setSupportImageTintList.write) objQ_ : null;
            if (writeVar == null || !writeVar.AudioAttributesCompatParcelizer()) {
                i2 = size2;
            } else {
                _parser _parserVarWrite = istypeorsupertypeof.write(j2);
                i2 = size2;
                long j3 = -1;
                long j4 = getKey.read((((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & ((long) _parserVarWrite.getRemoteActionCompatParcelizer())) | (((long) _parserVarWrite.getRead()) << 32));
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                _parserVarArr[i3] = _parserVarWrite;
                jRemoteActionCompatParcelizer = j4;
            }
            i3++;
            list2 = list;
            j2 = j;
            size2 = i2;
        }
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            isTypeOrSuperTypeOf istypeorsupertypeof2 = list.get(i4);
            if (_parserVarArr[i4] == null) {
                _parserVarArr[i4] = istypeorsupertypeof2.write(j);
            }
        }
        if (withcontentvaluehandler.r_()) {
            read = (int) (jRemoteActionCompatParcelizer >> 32);
        } else {
            if (size == 0) {
                _parserVar = null;
            } else {
                _parserVar = _parserVarArr[0];
                int iMediaDescriptionCompat = getOrderDetails.MediaDescriptionCompat(_parserVarArr);
                if (iMediaDescriptionCompat != 0) {
                    int read2 = _parserVar != null ? _parserVar.getRead() : 0;
                    if (iMediaDescriptionCompat > 0) {
                        int i5 = 1;
                        while (true) {
                            _parser _parserVar3 = _parserVarArr[i5];
                            int read3 = _parserVar3 != null ? _parserVar3.getRead() : 0;
                            if (read2 < read3) {
                                _parserVar = _parserVar3;
                                read2 = read3;
                            }
                            if (i5 == iMediaDescriptionCompat) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
            read = _parserVar != null ? _parserVar.getRead() : 0;
        }
        if (withcontentvaluehandler.r_()) {
            remoteActionCompatParcelizer = (int) jRemoteActionCompatParcelizer;
        } else {
            if (size == 0) {
                _parserVar2 = null;
            } else {
                _parser _parserVar4 = _parserVarArr[0];
                int iMediaDescriptionCompat2 = getOrderDetails.MediaDescriptionCompat(_parserVarArr);
                if (iMediaDescriptionCompat2 != 0) {
                    int remoteActionCompatParcelizer2 = _parserVar4 != null ? _parserVar4.getRemoteActionCompatParcelizer() : 0;
                    if (iMediaDescriptionCompat2 > 0) {
                        while (true) {
                            _parser _parserVar5 = _parserVarArr[i];
                            int remoteActionCompatParcelizer3 = _parserVar5 != null ? _parserVar5.getRemoteActionCompatParcelizer() : 0;
                            if (remoteActionCompatParcelizer2 < remoteActionCompatParcelizer3) {
                                _parserVar4 = _parserVar5;
                                remoteActionCompatParcelizer2 = remoteActionCompatParcelizer3;
                            }
                            if (i == iMediaDescriptionCompat2) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                _parserVar2 = _parserVar4;
            }
            remoteActionCompatParcelizer = _parserVar2 != null ? _parserVar2.getRemoteActionCompatParcelizer() : 0;
        }
        if (withcontentvaluehandler.r_()) {
            setsupportcheckmarktintmode = this;
        } else {
            setsupportcheckmarktintmode = this;
            long j5 = -1;
            setsupportcheckmarktintmode.read.read(getKey.read((((long) read) << 32) | (((long) remoteActionCompatParcelizer) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32))))));
        }
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, read, remoteActionCompatParcelizer, null, new AnonymousClass2(_parserVarArr, setsupportcheckmarktintmode, read, remoteActionCompatParcelizer), 4, null);
    }

    /* JADX INFO: renamed from: o.setSupportCheckMarkTintMode$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "write", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser[] $IconCompatParcelizer;
        final /* synthetic */ int $RemoteActionCompatParcelizer;
        final /* synthetic */ int $write;
        final /* synthetic */ setSupportCheckMarkTintMode read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            write(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void write(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser[] _parserVarArr;
            setSupportCheckMarkTintMode setsupportcheckmarktintmode;
            int i;
            int i2;
            int i3;
            int i4;
            _parser[] _parserVarArr2 = this.$IconCompatParcelizer;
            setSupportCheckMarkTintMode setsupportcheckmarktintmode2 = this.read;
            int i5 = this.$RemoteActionCompatParcelizer;
            int i6 = this.$write;
            int length = _parserVarArr2.length;
            int i7 = 0;
            int i8 = 0;
            while (i8 < length) {
                _parser _parserVar = _parserVarArr2[i8];
                if (_parserVar != null) {
                    _parserVarArr = _parserVarArr2;
                    setsupportcheckmarktintmode = setsupportcheckmarktintmode2;
                    long j = ((long) i7) << 32;
                    i4 = i8;
                    long j2 = -1;
                    i = i5;
                    i2 = length;
                    long j3 = -1;
                    i3 = 0;
                    long jIconCompatParcelizer = setsupportcheckmarktintmode2.AudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().IconCompatParcelizer(getKey.read(((j | (j2 - ((j2 >> 63) << 32))) & ((long) _parserVar.getRemoteActionCompatParcelizer())) | (((long) _parserVar.getRead()) << 32)), getKey.read((((long) i5) << 32) | (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) i6))), tryToResolveUnresolved.write);
                    _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, hasReferringProperties.IconCompatParcelizer(jIconCompatParcelizer), hasReferringProperties.AudioAttributesCompatParcelizer(jIconCompatParcelizer), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                } else {
                    _parserVarArr = _parserVarArr2;
                    setsupportcheckmarktintmode = setsupportcheckmarktintmode2;
                    i = i5;
                    i2 = length;
                    i3 = i7;
                    i4 = i8;
                }
                i8 = i4 + 1;
                i7 = i3;
                _parserVarArr2 = _parserVarArr;
                setsupportcheckmarktintmode2 = setsupportcheckmarktintmode;
                i5 = i;
                length = i2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(_parser[] _parserVarArr, setSupportCheckMarkTintMode setsupportcheckmarktintmode, int i, int i2) {
            super(1);
            this.$IconCompatParcelizer = _parserVarArr;
            this.read = setsupportcheckmarktintmode;
            this.$RemoteActionCompatParcelizer = i;
            this.$write = i2;
        }
    }

    @Override // kotlin.withTypeHandler
    public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).AudioAttributesCompatParcelizer(i));
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).AudioAttributesCompatParcelizer(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iWrite) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // kotlin.withTypeHandler
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).read(i));
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).read(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iWrite) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // kotlin.withTypeHandler
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).write(i));
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).write(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iWrite) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // kotlin.withTypeHandler
    public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).IconCompatParcelizer(i));
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).IconCompatParcelizer(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iWrite) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
