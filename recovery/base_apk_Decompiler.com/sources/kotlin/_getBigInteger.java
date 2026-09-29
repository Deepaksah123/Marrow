package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "instances", "Landroidx/collection/ObjectList;", "", "reused", "operations", "Landroidx/collection/IntList;", "lastOperation", "", "cause", "", "<init>", "(Landroidx/collection/ObjectList;Landroidx/collection/ObjectList;Landroidx/collection/IntList;ILjava/lang/Throwable;)V", "operationsSequence", "Lkotlin/sequences/Sequence;", "", "message", "getMessage$annotations", "()V", "getMessage", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _getBigInteger extends RuntimeException {
    private final setTextAppearance<Object> AudioAttributesCompatParcelizer;
    private final setWindowTitle RemoteActionCompatParcelizer;
    private final setTextAppearance<Object> read;
    private final int write;

    public _getBigInteger(setTextAppearance<Object> settextappearance, setTextAppearance<Object> settextappearance2, setWindowTitle setwindowtitle, int i, Throwable th) {
        super(th);
        this.AudioAttributesCompatParcelizer = settextappearance;
        this.read = settextappearance2;
        this.RemoteActionCompatParcelizer = setwindowtitle;
        this.write = i;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super String>, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            setStateResult setstateresult;
            int i;
            int i2;
            int i3;
            String strConcat;
            int i4;
            int i5;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i6 = this.IconCompatParcelizer;
            if (i6 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setstateresult = (setStateResult) this.AudioAttributesImplApi21Parcelizer;
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.AudioAttributesCompatParcelizer;
                i2 = this.RemoteActionCompatParcelizer;
                i3 = this.read;
                setstateresult = (setStateResult) this.AudioAttributesImplApi21Parcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            while (true) {
                if (i3 < Math.min(_getBigInteger.this.write + 10, _getBigInteger.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer)) {
                    int i7 = i3 + 1;
                    int i8 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i3);
                    switch (i8) {
                        case 0:
                            strConcat = "up";
                            break;
                        case 1:
                            strConcat = "down ".concat(String.valueOf(_getBigInteger.this.AudioAttributesCompatParcelizer.read(i2)));
                            i2++;
                            break;
                        case 2:
                            int i9 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i7);
                            int i10 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i3 + 2);
                            StringBuilder sb = new StringBuilder("remove ");
                            sb.append(i9);
                            sb.append(' ');
                            sb.append(i10);
                            strConcat = sb.toString();
                            i7 = i3 + 3;
                            break;
                        case 3:
                            int i11 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i7);
                            int i12 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i3 + 2);
                            int i13 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i3 + 3);
                            StringBuilder sb2 = new StringBuilder("move ");
                            sb2.append(i11);
                            sb2.append(' ');
                            sb2.append(i12);
                            sb2.append(' ');
                            sb2.append(i13);
                            strConcat = sb2.toString();
                            i7 = i3 + 4;
                            break;
                        case 4:
                            strConcat = "clear";
                            break;
                        case 5:
                            i4 = i3 + 2;
                            int i14 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i7);
                            i5 = i2 + 1;
                            Object obj2 = _getBigInteger.this.AudioAttributesCompatParcelizer.read(i2);
                            StringBuilder sb3 = new StringBuilder("insertBottomUp ");
                            sb3.append(i14);
                            sb3.append(' ');
                            sb3.append(obj2);
                            strConcat = sb3.toString();
                            i7 = i4;
                            i2 = i5;
                            break;
                        case 6:
                            i4 = i3 + 2;
                            int i15 = _getBigInteger.this.RemoteActionCompatParcelizer.read(i7);
                            i5 = i2 + 1;
                            Object obj3 = _getBigInteger.this.AudioAttributesCompatParcelizer.read(i2);
                            StringBuilder sb4 = new StringBuilder("insertTopDown ");
                            sb4.append(i15);
                            sb4.append(' ');
                            sb4.append(obj3);
                            strConcat = sb4.toString();
                            i7 = i4;
                            i2 = i5;
                            break;
                        case 7:
                            Object obj4 = _getBigInteger.this.AudioAttributesCompatParcelizer.read(i2);
                            toMagicModuleMetaRepoModel.read(obj4, "");
                            i2 += 2;
                            strConcat = "apply ".concat(String.valueOf((MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(obj4, 2)));
                            break;
                        case 8:
                            StringBuilder sb5 = new StringBuilder("reuse ");
                            sb5.append(_getBigInteger.this.read.read(i));
                            strConcat = sb5.toString();
                            i++;
                            break;
                        case 9:
                            strConcat = "recompose pending";
                            break;
                        default:
                            strConcat = "unknown op: ".concat(String.valueOf(i8));
                            break;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i3);
                    sb6.append(": ");
                    sb6.append(strConcat);
                    this.AudioAttributesImplApi21Parcelizer = setstateresult;
                    this.read = i7;
                    this.RemoteActionCompatParcelizer = i2;
                    this.AudioAttributesCompatParcelizer = i;
                    this.IconCompatParcelizer = 1;
                    if (setstateresult.IconCompatParcelizer(sb6.toString(), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    i3 = i7;
                } else {
                    return getShowPopup.INSTANCE;
                }
            }
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = _getBigInteger.this.new AudioAttributesCompatParcelizer(sampleVideos);
            audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setStateResult<? super String> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final getTopRankers<String> IconCompatParcelizer() {
        return StateResult.IconCompatParcelizer((MagicModuleSubmissionRequestBody) new AudioAttributesCompatParcelizer(null));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.write);
        sb.append(":\n            |");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(StateResult.MediaBrowserCompatItemReceiver(IconCompatParcelizer()), 50), "\n", null, null, 0, null, null, 62));
        sb.append("\n            ");
        return TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|");
    }
}
