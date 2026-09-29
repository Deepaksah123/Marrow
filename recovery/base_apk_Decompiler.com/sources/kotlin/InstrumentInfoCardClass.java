package kotlin;

import com.marrow.R;

/* JADX INFO: loaded from: classes4.dex */
public final class InstrumentInfoCardClass {

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[PaymentDataRequestBuilder.values().length];
            try {
                iArr[PaymentDataRequestBuilder.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentDataRequestBuilder.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(final kotlin.setCardRequirements r40, final kotlin.PaymentDataRequestBuilder r41, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r42, kotlin._handleOddName r43, kotlin._handleUnrecognizedCharacterEscape r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.InstrumentInfoCardClass.IconCompatParcelizer(o.setCardRequirements, o.PaymentDataRequestBuilder, o.getCreatedOnDateMs, o._handleOddName, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static final String read(int i, PaymentDataRequestBuilder paymentDataRequestBuilder, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        String strRemoteActionCompatParcelizer;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-828855837, i2, -1, "com.marrow2.ui.test.gtanalytics.composable.metricValueText (GtaSubjectStatCard.kt:101)");
        }
        int i3 = write.write[paymentDataRequestBuilder.ordinal()];
        if (i3 == 1) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1961505875);
            strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.percentage_in_string, new Object[]{Integer.valueOf(i), CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(i)}, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            if (i3 != 2) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1961507268);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                throw new RenewEligibleCreator();
            }
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1961501442);
            strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.gta_metric_percentage_value, new Object[]{Integer.valueOf(i)}, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return strRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setCardRequirements setcardrequirements, PaymentDataRequestBuilder paymentDataRequestBuilder, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(setcardrequirements, paymentDataRequestBuilder, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
