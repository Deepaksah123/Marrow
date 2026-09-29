package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin._parser;
import kotlin.addInfoModuleDataLabeValueRow;

/* JADX INFO: loaded from: classes4.dex */
public final class addInfoModuleDataLabeValueRow {
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(6.0f);
    private static final float write = assignParameter.IconCompatParcelizer(8.0f);
    private static final float read = assignParameter.IconCompatParcelizer(2.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(3.0f);

    public static final /* synthetic */ int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        return read(i, 1, i2, i3);
    }

    private static final int read(int i, int i2, int i3, int i4) {
        return (i == 0 || i == 1) ? i3 : i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final kotlin.setShippingAddressRequired r33, kotlin._handleOddName r34, kotlin._handleUnrecognizedCharacterEscape r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addInfoModuleDataLabeValueRow.AudioAttributesCompatParcelizer(o.setShippingAddressRequired, o._handleOddName, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    static final class RemoteActionCompatParcelizer implements withTypeHandler {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.withTypeHandler
        public final /* bridge */ int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return super.AudioAttributesCompatParcelizer(getvaluehandler, list, i);
        }

        @Override // kotlin.withTypeHandler
        public final /* bridge */ int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return super.RemoteActionCompatParcelizer(getvaluehandler, list, i);
        }

        @Override // kotlin.withTypeHandler
        public final /* bridge */ int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return super.read(getvaluehandler, list, i);
        }

        @Override // kotlin.withTypeHandler
        public final /* bridge */ int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return super.write(getvaluehandler, list, i);
        }

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            toMagicModuleMetaRepoModel.write(withcontentvaluehandler, "");
            toMagicModuleMetaRepoModel.write(list, "");
            long jAudioAttributesCompatParcelizer$default = PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, Integer.MAX_VALUE, 0, 0, 12, null);
            int size = list.size();
            final _parser[] _parserVarArr = new _parser[size];
            final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    IntermediateLoginResponseBody.read();
                }
                isTypeOrSuperTypeOf istypeorsupertypeof = (isTypeOrSuperTypeOf) obj;
                if (i != 1) {
                    _parser _parserVarWrite = istypeorsupertypeof.write(jAudioAttributesCompatParcelizer$default);
                    _parserVarArr[i] = _parserVarWrite;
                    iconCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer.AudioAttributesCompatParcelizer, _parserVarWrite.getRemoteActionCompatParcelizer());
                }
                i++;
            }
            _parserVarArr[1] = list.get(1).write(PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer));
            int read = 0;
            for (int i2 = 0; i2 < size; i2++) {
                _parser _parserVar = _parserVarArr[i2];
                read += _parserVar != null ? _parserVar.getRead() : 0;
            }
            final int size2 = list.size() - 1;
            int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j) - read;
            int i3 = iAudioAttributesImplBaseParcelizer <= 0 ? this.write : iAudioAttributesImplBaseParcelizer / size2;
            final int[] iArr = new int[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                iArr[i4] = getQues.write(i3, this.write, addInfoModuleDataLabeValueRow.AudioAttributesCompatParcelizer(i4, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer));
            }
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, getQues.write(read + getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(iArr), 0, PropertyValueAny.AudioAttributesImplBaseParcelizer(j)), iconCompatParcelizer.AudioAttributesCompatParcelizer, null, new getAnswerMap() { // from class: o.setProgramName
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return addInfoModuleDataLabeValueRow.RemoteActionCompatParcelizer.IconCompatParcelizer(_parserVarArr, iconCompatParcelizer, size2, iArr, (_parser.IconCompatParcelizer) obj2);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(_parser[] _parserVarArr, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, int i, int[] iArr, _parser.IconCompatParcelizer iconCompatParcelizer2) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer2, "");
            int length = _parserVarArr.length;
            int i2 = 0;
            int read = 0;
            int i3 = 0;
            while (i2 < length) {
                _parser _parserVar = _parserVarArr[i2];
                if (_parserVar != null) {
                    _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer2, _parserVar, read, (iconCompatParcelizer.AudioAttributesCompatParcelizer - _parserVar.getRemoteActionCompatParcelizer()) / 2, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                }
                if (i3 < i) {
                    read += (_parserVar != null ? _parserVar.getRead() : 0) + iArr[i3];
                }
                i2++;
                i3++;
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
            this.IconCompatParcelizer = i3;
            this.RemoteActionCompatParcelizer = i4;
        }
    }

    private static final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-15043793);
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i != 0, i & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-15043793, i, -1, "com.marrow2.ui.test.gtanalytics.composable.BreakdownDot (TopicBreakdownRow.kt:132)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, RemoteActionCompatParcelizer), setPlayer.IconCompatParcelizer());
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            AbsSavedState1.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetCaptioningEnabled(), null, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getRedemptionCode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return addInfoModuleDataLabeValueRow.IconCompatParcelizer(i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setShippingAddressRequired setshippingaddressrequired, _handleOddName _handleoddname, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(setshippingaddressrequired, _handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
