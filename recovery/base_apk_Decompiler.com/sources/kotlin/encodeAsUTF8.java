package kotlin;

import in.juspay.hyper.constants.LogCategory;
import kotlin.DoubleToDecimal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\t\u001a\u0002H\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n\u001a \u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\u001a%\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"collectAsState", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/StateFlow;", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "Lkotlinx/coroutines/flow/Flow;", "initial", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "snapshotFlow", "block", "Lkotlin/Function0;", "intersects", "", "Landroidx/collection/MutableScatterSet;", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class encodeAsUTF8 {
    public static final <T> parseDouble<T> read(setUpdatedStatus<? extends T> setupdatedstatus, CurrentQuery currentQuery, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            currentQuery = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        }
        CurrentQuery currentQuery2 = currentQuery;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        parseDouble<T> parsedouble = _qbuf.read(setupdatedstatus, setupdatedstatus.IconCompatParcelizer(), currentQuery2, _handleunrecognizedcharacterescape, (i & 14) | ((i << 3) & 896), 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble;
    }

    public static final <T extends R, R> parseDouble<R> read(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, R r, CurrentQuery currentQuery, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 2) != 0) {
            currentQuery = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        }
        CurrentQuery currentQuery2 = currentQuery;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(currentQuery2);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(newNumberOtpResendRequest);
        IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            iconCompatParcelizerOnPause = new IconCompatParcelizer(currentQuery2, newNumberOtpResendRequest, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
        }
        parseDouble<R> parsedouble = _qbuf.read(r, newNumberOtpResendRequest, currentQuery2, (MagicModuleSubmissionRequestBody<? super getEscapeCodesForAscii<R>, ? super SampleVideos<? super getShowPopup>, ? extends Object>) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescape, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Landroidx/compose/runtime/ProduceStateScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer<R> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getEscapeCodesForAscii<R>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ CurrentQuery AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        final /* synthetic */ NewNumberOtpResendRequest<T> write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r1.write((kotlin.getValidationToken<? super T>) r2, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r6.AudioAttributesCompatParcelizer, new o.encodeAsUTF8.IconCompatParcelizer.AnonymousClass2(r6.write, r7, null), r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            return r0;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L59
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                java.lang.Object r7 = r6.read
                o.getEscapeCodesForAscii r7 = (kotlin.getEscapeCodesForAscii) r7
                o.CurrentQuery r1 = r6.AudioAttributesCompatParcelizer
                o.VideoSessionResponseBody r4 = kotlin.VideoSessionResponseBody.RemoteActionCompatParcelizer
                boolean r1 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r1, r4)
                if (r1 == 0) goto L41
                o.NewNumberOtpResendRequest<T> r1 = r6.write
                o.encodeAsUTF8$IconCompatParcelizer$3 r2 = new o.encodeAsUTF8$IconCompatParcelizer$3
                r2.<init>()
                o.getValidationToken r2 = (kotlin.getValidationToken) r2
                r7 = r6
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r6.RemoteActionCompatParcelizer = r3
                java.lang.Object r6 = r1.write(r2, r7)
                if (r6 != r0) goto L59
                goto L58
            L41:
                o.CurrentQuery r1 = r6.AudioAttributesCompatParcelizer
                o.encodeAsUTF8$IconCompatParcelizer$2 r3 = new o.encodeAsUTF8$IconCompatParcelizer$2
                o.NewNumberOtpResendRequest<T> r4 = r6.write
                r5 = 0
                r3.<init>(r4, r7, r5)
                o.MagicModuleSubmissionRequestBody r3 = (kotlin.MagicModuleSubmissionRequestBody) r3
                r7 = r6
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r6.RemoteActionCompatParcelizer = r2
                java.lang.Object r6 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r1, r3, r7)
                if (r6 != r0) goto L59
            L58:
                return r0
            L59:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encodeAsUTF8.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.encodeAsUTF8$IconCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ NewNumberOtpResendRequest<T> IconCompatParcelizer;
            final /* synthetic */ getEscapeCodesForAscii<R> read;
            int write;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.write;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    NewNumberOtpResendRequest<T> newNumberOtpResendRequest = this.IconCompatParcelizer;
                    final getEscapeCodesForAscii<R> getescapecodesforascii = this.read;
                    getValidationToken getvalidationtoken = new getValidationToken() { // from class: o.encodeAsUTF8.IconCompatParcelizer.2.5
                        @Override // kotlin.getValidationToken
                        public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
                            getescapecodesforascii.write(t);
                            return getShowPopup.INSTANCE;
                        }
                    };
                    this.write = 1;
                    if (newNumberOtpResendRequest.write((getValidationToken<? super T>) getvalidationtoken, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, getEscapeCodesForAscii<R> getescapecodesforascii, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = newNumberOtpResendRequest;
                this.read = getescapecodesforascii;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.IconCompatParcelizer, this.read, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(CurrentQuery currentQuery, NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = currentQuery;
            this.write = newNumberOtpResendRequest;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
            iconCompatParcelizer.read = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getEscapeCodesForAscii<R> getescapecodesforascii, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(getescapecodesforascii, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write<T> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super T>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getCreatedOnDateMs<T> AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
        
            if (r14 == r0) goto L58;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:35:0x00d6, B:39:0x00df], limit reached: 81 */
        /* JADX WARN: Path cross not found for [B:43:0x00ee, B:72:0x00b8], limit reached: 81 */
        /* JADX WARN: Path cross not found for [B:72:0x00b8, B:43:0x00ee], limit reached: 81 */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #4 {all -> 0x0038, blocks: (B:11:0x0033, B:33:0x00d2, B:35:0x00d6, B:40:0x00e0, B:43:0x00ee, B:47:0x0104, B:49:0x010d, B:56:0x012b, B:57:0x012e, B:44:0x00f9, B:46:0x0101, B:53:0x0126, B:54:0x0129), top: B:79:0x0033, inners: #5 }] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, o.getValidationToken] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ec -> B:72:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010b -> B:72:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0122 -> B:18:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encodeAsUTF8.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(setEmojiCompatEnabled setemojicompatenabled, Object obj) {
            if (obj instanceof constructParser) {
                DoubleToDecimal.Companion companion = DoubleToDecimal.INSTANCE;
                ((constructParser) obj).RemoteActionCompatParcelizer(DoubleToDecimal.AudioAttributesCompatParcelizer(4));
            }
            setemojicompatenabled.write(obj);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final kotlin.getShowPopup write(kotlin.fromCursor r16, java.util.Set r17, kotlin.parseDigitsRecursive r18) {
            /*
                r0 = r17
                boolean r1 = r0 instanceof kotlin.loadMore
                r2 = 4
                if (r1 == 0) goto L60
                r1 = r0
                o.loadMore r1 = (kotlin.loadMore) r1
                o.setButtonDrawable r1 = r1.RemoteActionCompatParcelizer()
                java.lang.Object[] r3 = r1.write
                long[] r1 = r1.AudioAttributesCompatParcelizer
                int r4 = r1.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L93
                r5 = 0
                r6 = r5
            L19:
                r7 = r1[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L5b
                int r9 = r6 - r4
                int r9 = ~r9
                int r9 = r9 >>> 31
                r10 = 8
                int r9 = 8 - r9
                r11 = r5
            L33:
                if (r11 >= r9) goto L59
                r12 = 255(0xff, double:1.26E-321)
                long r12 = r12 & r7
                r14 = 128(0x80, double:6.3E-322)
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L55
                int r12 = r6 << 3
                int r12 = r12 + r11
                r12 = r3[r12]
                boolean r13 = r12 instanceof kotlin.constructParser
                if (r13 == 0) goto L90
                o.constructParser r12 = (kotlin.constructParser) r12
                o.DoubleToDecimal$read r13 = kotlin.DoubleToDecimal.INSTANCE
                int r13 = kotlin.DoubleToDecimal.AudioAttributesCompatParcelizer(r2)
                boolean r12 = r12.IconCompatParcelizer(r13)
                if (r12 != 0) goto L90
            L55:
                long r7 = r7 >> r10
                int r11 = r11 + 1
                goto L33
            L59:
                if (r9 != r10) goto L93
            L5b:
                if (r6 == r4) goto L93
                int r6 = r6 + 1
                goto L19
            L60:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r3 = r1 instanceof java.util.Collection
                if (r3 == 0) goto L70
                r3 = r1
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L93
            L70:
                java.util.Iterator r1 = r1.iterator()
            L74:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L93
                java.lang.Object r3 = r1.next()
                boolean r4 = r3 instanceof kotlin.constructParser
                if (r4 == 0) goto L90
                o.constructParser r3 = (kotlin.constructParser) r3
                o.DoubleToDecimal$read r4 = kotlin.DoubleToDecimal.INSTANCE
                int r4 = kotlin.DoubleToDecimal.AudioAttributesCompatParcelizer(r2)
                boolean r3 = r3.IconCompatParcelizer(r4)
                if (r3 == 0) goto L74
            L90:
                r16.read(r17)
            L93:
                o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.encodeAsUTF8.write.write(o.fromCursor, java.util.Set, o.parseDigitsRecursive):o.getShowPopup");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(getCreatedOnDateMs<? extends T> getcreatedondatems, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.AudioAttributesCompatParcelizer, sampleVideos);
            writeVar.MediaBrowserCompatCustomActionResultReceiver = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <T> NewNumberOtpResendRequest<T> IconCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        return VerifyNewNumberRequest.read((MagicModuleSubmissionRequestBody) new write(getcreatedondatems, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean RemoteActionCompatParcelizer(kotlin.setEmojiCompatEnabled<java.lang.Object> r13, java.util.Set<? extends java.lang.Object> r14) {
        /*
            o.setButtonDrawable r13 = (kotlin.setButtonDrawable) r13
            java.lang.Object[] r0 = r13.write
            long[] r13 = r13.AudioAttributesCompatParcelizer
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L4a
            r3 = r2
        Ld:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L45
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L27:
            if (r8 >= r6) goto L43
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3f
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L3f
            r13 = 1
            return r13
        L3f:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L27
        L43:
            if (r6 != r7) goto L4a
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto Ld
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.encodeAsUTF8.RemoteActionCompatParcelizer(o.setEmojiCompatEnabled, java.util.Set):boolean");
    }
}
