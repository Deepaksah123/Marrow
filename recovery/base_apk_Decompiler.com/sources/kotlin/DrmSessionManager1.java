package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.getDummyDrmSessionManager;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionManager1 {

    static final class write extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ getAnswerMap<WebView, getShowPopup> AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ getAnswerMap<Context, WebView> AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ _handleOddName AudioAttributesImplBaseParcelizer;
        private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 IconCompatParcelizer;
        private /* synthetic */ getAnswerMap<WebView, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ DrmSessionManager MediaBrowserCompatItemReceiver;
        private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 MediaBrowserCompatMediaItem;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ boolean read;
        private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5, _handleOddName _handleoddname, boolean z, DrmSessionManager drmSessionManager, getAnswerMap<? super WebView, getShowPopup> getanswermap, getAnswerMap<? super WebView, getShowPopup> getanswermap2, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 drmSessionEventListenerEventDispatcherExternalSyntheticLambda1, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 drmSessionEventListenerEventDispatcherExternalSyntheticLambda4, getAnswerMap<? super Context, ? extends WebView> getanswermap3, int i, int i2) {
            super(2);
            this.MediaBrowserCompatMediaItem = drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
            this.AudioAttributesImplBaseParcelizer = _handleoddname;
            this.read = z;
            this.MediaBrowserCompatItemReceiver = drmSessionManager;
            this.AudioAttributesImplApi21Parcelizer = getanswermap;
            this.MediaBrowserCompatCustomActionResultReceiver = getanswermap2;
            this.IconCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda1;
            this.write = drmSessionEventListenerEventDispatcherExternalSyntheticLambda4;
            this.AudioAttributesImplApi26Parcelizer = getanswermap3;
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape);
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
            DrmSessionManager1.write(this.MediaBrowserCompatMediaItem, this.AudioAttributesImplBaseParcelizer, this.read, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, this.write, this.AudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.AudioAttributesCompatParcelizer);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        private /* synthetic */ parseDouble<getAnswerMap<WebView, getShowPopup>> AudioAttributesCompatParcelizer;
        private /* synthetic */ WebView write;

        public static final class write implements _wrapError {
            private /* synthetic */ parseDouble IconCompatParcelizer;
            private /* synthetic */ WebView read;

            public write(WebView webView, parseDouble parsedouble) {
                this.read = webView;
                this.IconCompatParcelizer = parsedouble;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                DrmSessionManager1.RemoteActionCompatParcelizer(this.IconCompatParcelizer).invoke(this.read);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
            return new write(this.write, this.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplBaseParcelizer(WebView webView, parseDouble<? extends getAnswerMap<? super WebView, getShowPopup>> parsedouble) {
            super(1);
            this.write = webView;
            this.AudioAttributesCompatParcelizer = parsedouble;
        }
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<WebView, getShowPopup> {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(WebView webView) {
            read(webView);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }

        private static void read(WebView webView) {
            toMagicModuleMetaRepoModel.write(webView, "");
        }
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<WebView, getShowPopup> {
        public static final read write = new read();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(WebView webView) {
            AudioAttributesCompatParcelizer(webView);
            return getShowPopup.INSTANCE;
        }

        read() {
            super(1);
        }

        private static void AudioAttributesCompatParcelizer(WebView webView) {
            toMagicModuleMetaRepoModel.write(webView, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0319 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 r19, kotlin._handleOddName r20, boolean r21, kotlin.DrmSessionManager r22, kotlin.getAnswerMap<? super android.webkit.WebView, kotlin.getShowPopup> r23, kotlin.getAnswerMap<? super android.webkit.WebView, kotlin.getShowPopup> r24, kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 r25, kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 r26, kotlin.getAnswerMap<? super android.content.Context, ? extends android.webkit.WebView> r27, kotlin._handleUnrecognizedCharacterEscape r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DrmSessionManager1.write(o.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5, o._handleOddName, boolean, o.DrmSessionManager, o.getAnswerMap, o.getAnswerMap, o.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1, o.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView AudioAttributesCompatParcelizer(InputAccessor<WebView> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        private /* synthetic */ InputAccessor<WebView> IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        private void write() {
            WebView webViewAudioAttributesCompatParcelizer = DrmSessionManager1.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            if (webViewAudioAttributesCompatParcelizer != null) {
                webViewAudioAttributesCompatParcelizer.goBack();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(InputAccessor<WebView> inputAccessor) {
            super(0);
            this.IconCompatParcelizer = inputAccessor;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 IconCompatParcelizer;
        private /* synthetic */ InputAccessor<WebView> RemoteActionCompatParcelizer;
        private int write;

        /* JADX INFO: renamed from: o.DrmSessionManager1$MediaBrowserCompatCustomActionResultReceiver$4, reason: invalid class name */
        static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getDummyDrmSessionManager> {
            private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 IconCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getDummyDrmSessionManager invoke() {
                return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5) {
                super(0);
                this.IconCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(InputAccessor<WebView> inputAccessor, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = inputAccessor;
            this.IconCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (DrmSessionManager1.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer) == null) {
                    return getShowPopup.INSTANCE;
                }
                NewNumberOtpResendRequest newNumberOtpResendRequestIconCompatParcelizer = _qbuf.IconCompatParcelizer(new AnonymousClass4(this.IconCompatParcelizer));
                final InputAccessor<WebView> inputAccessor = this.RemoteActionCompatParcelizer;
                this.write = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken<getDummyDrmSessionManager>() { // from class: o.DrmSessionManager1.MediaBrowserCompatCustomActionResultReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(getDummyDrmSessionManager getdummydrmsessionmanager, SampleVideos sampleVideos) {
                        return write(getdummydrmsessionmanager);
                    }

                    private Object write(getDummyDrmSessionManager getdummydrmsessionmanager) {
                        WebView webViewAudioAttributesCompatParcelizer;
                        if (getdummydrmsessionmanager instanceof getDummyDrmSessionManager.AudioAttributesCompatParcelizer) {
                            WebView webViewAudioAttributesCompatParcelizer2 = DrmSessionManager1.AudioAttributesCompatParcelizer(inputAccessor);
                            if (webViewAudioAttributesCompatParcelizer2 != null) {
                                getDummyDrmSessionManager.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (getDummyDrmSessionManager.AudioAttributesCompatParcelizer) getdummydrmsessionmanager;
                                webViewAudioAttributesCompatParcelizer2.loadUrl(audioAttributesCompatParcelizer.getRead(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                            }
                        } else if ((getdummydrmsessionmanager instanceof getDummyDrmSessionManager.IconCompatParcelizer) && (webViewAudioAttributesCompatParcelizer = DrmSessionManager1.AudioAttributesCompatParcelizer(inputAccessor)) != null) {
                            getDummyDrmSessionManager.IconCompatParcelizer iconCompatParcelizer = (getDummyDrmSessionManager.IconCompatParcelizer) getdummydrmsessionmanager;
                            webViewAudioAttributesCompatParcelizer.loadDataWithBaseURL(iconCompatParcelizer.getWrite(), iconCompatParcelizer.getRemoteActionCompatParcelizer(), iconCompatParcelizer.getRead(), iconCompatParcelizer.getAudioAttributesCompatParcelizer(), iconCompatParcelizer.getIconCompatParcelizer());
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
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

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getModuleData<setDrawerShadow, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 AudioAttributesCompatParcelizer;
        private /* synthetic */ getAnswerMap<WebView, getShowPopup> IconCompatParcelizer;
        private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 RemoteActionCompatParcelizer;
        private /* synthetic */ getAnswerMap<Context, WebView> read;
        private /* synthetic */ InputAccessor<WebView> write;

        @Override // kotlin.getModuleData
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            write(setdrawershadow, _handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        private void write(setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            int i2;
            toMagicModuleMetaRepoModel.write(setdrawershadow, "");
            if ((i & 14) == 0) {
                i2 = (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setdrawershadow) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !_handleunrecognizedcharacterescape.onPlay()) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-1606035789, i, -1, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:131)");
                }
                AtomicLongDeserializer.AudioAttributesCompatParcelizer(new AnonymousClass2(this.read, PropertyValueAny.AudioAttributesImplApi26Parcelizer(setdrawershadow.getAudioAttributesCompatParcelizer()) ? -1 : -2, PropertyValueAny.IconCompatParcelizer(setdrawershadow.getAudioAttributesCompatParcelizer()) ? -1 : -2, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write), null, null, _handleunrecognizedcharacterescape, 0, 6);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        /* JADX INFO: renamed from: o.DrmSessionManager1$AudioAttributesImplApi21Parcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Context, FrameLayout> {
            private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 AudioAttributesCompatParcelizer;
            private /* synthetic */ int AudioAttributesImplApi21Parcelizer;
            private /* synthetic */ getAnswerMap<Context, WebView> IconCompatParcelizer;
            private /* synthetic */ InputAccessor<WebView> MediaBrowserCompatCustomActionResultReceiver;
            private /* synthetic */ int RemoteActionCompatParcelizer;
            private /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 read;
            private /* synthetic */ getAnswerMap<WebView, getShowPopup> write;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public FrameLayout invoke(Context context) {
                WebView webView;
                toMagicModuleMetaRepoModel.write(context, "");
                getAnswerMap<Context, WebView> getanswermap = this.IconCompatParcelizer;
                if (getanswermap == null || (webView = getanswermap.invoke(context)) == null) {
                    webView = new WebView(context);
                }
                getAnswerMap<WebView, getShowPopup> getanswermap2 = this.write;
                int i = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.RemoteActionCompatParcelizer;
                DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 drmSessionEventListenerEventDispatcherExternalSyntheticLambda4 = this.read;
                DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 drmSessionEventListenerEventDispatcherExternalSyntheticLambda1 = this.AudioAttributesCompatParcelizer;
                getanswermap2.invoke(webView);
                webView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
                webView.setWebChromeClient(drmSessionEventListenerEventDispatcherExternalSyntheticLambda4);
                webView.setWebViewClient(drmSessionEventListenerEventDispatcherExternalSyntheticLambda1);
                DrmSessionManager1.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, webView);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer));
                frameLayout.addView(webView);
                return frameLayout;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(getAnswerMap<? super Context, ? extends WebView> getanswermap, int i, int i2, getAnswerMap<? super WebView, getShowPopup> getanswermap2, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 drmSessionEventListenerEventDispatcherExternalSyntheticLambda4, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 drmSessionEventListenerEventDispatcherExternalSyntheticLambda1, InputAccessor<WebView> inputAccessor) {
                super(1);
                this.IconCompatParcelizer = getanswermap;
                this.AudioAttributesImplApi21Parcelizer = i;
                this.RemoteActionCompatParcelizer = i2;
                this.write = getanswermap2;
                this.read = drmSessionEventListenerEventDispatcherExternalSyntheticLambda4;
                this.AudioAttributesCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda1;
                this.MediaBrowserCompatCustomActionResultReceiver = inputAccessor;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplApi21Parcelizer(getAnswerMap<? super Context, ? extends WebView> getanswermap, getAnswerMap<? super WebView, getShowPopup> getanswermap2, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 drmSessionEventListenerEventDispatcherExternalSyntheticLambda4, DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 drmSessionEventListenerEventDispatcherExternalSyntheticLambda1, InputAccessor<WebView> inputAccessor) {
            super(3);
            this.read = getanswermap;
            this.IconCompatParcelizer = getanswermap2;
            this.AudioAttributesCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda4;
            this.RemoteActionCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda1;
            this.write = inputAccessor;
        }
    }

    private static DrmSessionManager AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.read(1602323198);
        _handleunrecognizedcharacterescape.read(773894976);
        _handleunrecognizedcharacterescape.read(-492369756);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            Object _longnumberdesc = new _longNumberDesc(StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape));
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(_longnumberdesc);
            objOnPause = _longnumberdesc;
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        TopUserCompanion remoteActionCompatParcelizer = ((_longNumberDesc) objOnPause).getRemoteActionCompatParcelizer();
        _handleunrecognizedcharacterescape.RatingCompat();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1602323198, 0, -1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:483)");
        }
        _handleunrecognizedcharacterescape.read(1157296644);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new DrmSessionManager(remoteActionCompatParcelizer);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        DrmSessionManager drmSessionManager = (DrmSessionManager) objOnPause2;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return drmSessionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(InputAccessor<WebView> inputAccessor, WebView webView) {
        inputAccessor.write(webView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getAnswerMap<WebView, getShowPopup> RemoteActionCompatParcelizer(parseDouble<? extends getAnswerMap<? super WebView, getShowPopup>> parsedouble) {
        return (getAnswerMap) parsedouble.getRemoteActionCompatParcelizer();
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<WebView> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ DrmSessionManager RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(DrmSessionManager drmSessionManager, InputAccessor<WebView> inputAccessor, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = drmSessionManager;
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                DrmSessionManager drmSessionManager = this.RemoteActionCompatParcelizer;
                WebView webViewAudioAttributesCompatParcelizer = DrmSessionManager1.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
                if (webViewAudioAttributesCompatParcelizer == null) {
                    return getShowPopup.INSTANCE;
                }
                this.IconCompatParcelizer = 1;
                if (drmSessionManager.RemoteActionCompatParcelizer(webViewAudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }
    }
}
