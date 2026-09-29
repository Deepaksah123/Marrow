package kotlin;

import kotlin.KotlinKeySerializersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class MissingKotlinParameterException {
    private static final KotlinKeySerializers write;

    static {
        KotlinKeySerializersKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new KotlinKeySerializersKt.RemoteActionCompatParcelizer(false);
        write = new KotlinKeySerializers(KotlinKeySerializersKt.IconCompatParcelizer.INSTANCE, remoteActionCompatParcelizer, remoteActionCompatParcelizer);
    }

    public static final <T> MethodValueCreatorCompanion<T> AudioAttributesCompatParcelizer(NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<T>> newNumberOtpResendRequest, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        toMagicModuleMetaRepoModel.write(newNumberOtpResendRequest, "");
        _handleunrecognizedcharacterescape.read(388053246);
        VideoSessionResponseBody videoSessionResponseBody = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(388053246, 0, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:264)");
        }
        _handleunrecognizedcharacterescape.read(1157296644);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(newNumberOtpResendRequest);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new MethodValueCreatorCompanion(newNumberOtpResendRequest);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        MethodValueCreatorCompanion<T> methodValueCreatorCompanion = (MethodValueCreatorCompanion) objOnPause;
        StreamReadException.IconCompatParcelizer(methodValueCreatorCompanion, new IconCompatParcelizer(videoSessionResponseBody, methodValueCreatorCompanion, null), _handleunrecognizedcharacterescape, 72);
        StreamReadException.IconCompatParcelizer(methodValueCreatorCompanion, new RemoteActionCompatParcelizer(videoSessionResponseBody, methodValueCreatorCompanion, null), _handleunrecognizedcharacterescape, 72);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return methodValueCreatorCompanion;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ CurrentQuery AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        final /* synthetic */ MethodValueCreatorCompanion<T> write;

        /* JADX INFO: renamed from: o.MissingKotlinParameterException$IconCompatParcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ MethodValueCreatorCompanion<T> AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MethodValueCreatorCompanion<T> methodValueCreatorCompanion, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = methodValueCreatorCompanion;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    MethodValueCreatorCompanion<T> methodValueCreatorCompanion = this.AudioAttributesCompatParcelizer;
                    this.IconCompatParcelizer = 1;
                    if (methodValueCreatorCompanion.IconCompatParcelizer(this) == objIconCompatParcelizer) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(CurrentQuery currentQuery, MethodValueCreatorCompanion<T> methodValueCreatorCompanion, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = currentQuery;
            this.write = methodValueCreatorCompanion;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r6.IconCompatParcelizer(r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r5.AudioAttributesCompatParcelizer, new o.MissingKotlinParameterException.IconCompatParcelizer.AnonymousClass2(r5.write, null), r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L4e
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                o.CurrentQuery r6 = r5.AudioAttributesCompatParcelizer
                o.VideoSessionResponseBody r1 = kotlin.VideoSessionResponseBody.RemoteActionCompatParcelizer
                boolean r6 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r6, r1)
                if (r6 == 0) goto L36
                o.MethodValueCreatorCompanion<T> r6 = r5.write
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.IconCompatParcelizer = r3
                java.lang.Object r5 = r6.IconCompatParcelizer(r1)
                if (r5 != r0) goto L4e
                goto L4d
            L36:
                o.CurrentQuery r6 = r5.AudioAttributesCompatParcelizer
                o.MissingKotlinParameterException$IconCompatParcelizer$2 r1 = new o.MissingKotlinParameterException$IconCompatParcelizer$2
                o.MethodValueCreatorCompanion<T> r3 = r5.write
                r4 = 0
                r1.<init>(r3, r4)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.IconCompatParcelizer = r2
                java.lang.Object r5 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r6, r1, r3)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.MissingKotlinParameterException.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MethodValueCreatorCompanion<T> AudioAttributesCompatParcelizer;
        final /* synthetic */ CurrentQuery RemoteActionCompatParcelizer;
        private int read;

        /* JADX INFO: renamed from: o.MissingKotlinParameterException$RemoteActionCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            final /* synthetic */ MethodValueCreatorCompanion<T> RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(MethodValueCreatorCompanion<T> methodValueCreatorCompanion, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = methodValueCreatorCompanion;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    MethodValueCreatorCompanion<T> methodValueCreatorCompanion = this.RemoteActionCompatParcelizer;
                    this.IconCompatParcelizer = 1;
                    if (methodValueCreatorCompanion.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(CurrentQuery currentQuery, MethodValueCreatorCompanion<T> methodValueCreatorCompanion, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = currentQuery;
            this.AudioAttributesCompatParcelizer = methodValueCreatorCompanion;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r6.AudioAttributesCompatParcelizer(r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r5.RemoteActionCompatParcelizer, new o.MissingKotlinParameterException.RemoteActionCompatParcelizer.AnonymousClass4(r5.AudioAttributesCompatParcelizer, null), r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L4e
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                o.CurrentQuery r6 = r5.RemoteActionCompatParcelizer
                o.VideoSessionResponseBody r1 = kotlin.VideoSessionResponseBody.RemoteActionCompatParcelizer
                boolean r6 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r6, r1)
                if (r6 == 0) goto L36
                o.MethodValueCreatorCompanion<T> r6 = r5.AudioAttributesCompatParcelizer
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.read = r3
                java.lang.Object r5 = r6.AudioAttributesCompatParcelizer(r1)
                if (r5 != r0) goto L4e
                goto L4d
            L36:
                o.CurrentQuery r6 = r5.RemoteActionCompatParcelizer
                o.MissingKotlinParameterException$RemoteActionCompatParcelizer$4 r1 = new o.MissingKotlinParameterException$RemoteActionCompatParcelizer$4
                o.MethodValueCreatorCompanion<T> r3 = r5.AudioAttributesCompatParcelizer
                r4 = 0
                r1.<init>(r3, r4)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.read = r2
                java.lang.Object r5 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r6, r1, r3)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.MissingKotlinParameterException.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
