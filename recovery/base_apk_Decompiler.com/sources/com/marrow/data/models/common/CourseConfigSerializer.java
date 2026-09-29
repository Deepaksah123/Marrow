package com.marrow.data.models.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.marrow.data.models.common.CourseConfigV2;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigSerializer;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Lcom/marrow/data/models/common/CourseConfigV2;", "<init>", "()V", "p0", "Lcom/fasterxml/jackson/core/JsonGenerator;", "p1", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "p2", "", "serialize", "(Lcom/marrow/data/models/common/CourseConfigV2;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "", "getNavDrawerKey", "(Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;)Ljava/lang/String;", "Lcom/marrow/data/models/common/CourseConfigV2$SettingsItem;", "getSettingsKey", "(Lcom/marrow/data/models/common/CourseConfigV2$SettingsItem;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CourseConfigSerializer extends StdSerializer<CourseConfigV2> {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[CourseConfigV2.BottomTabItem.values().length];
            try {
                iArr[CourseConfigV2.BottomTabItem.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.BottomTabItem.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.BottomTabItem.QBANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CourseConfigV2.BottomTabItem.HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CourseConfigV2.SupportItem.values().length];
            try {
                iArr2[CourseConfigV2.SupportItem.FAQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CourseConfigV2.SupportItem.GET_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CourseConfigV2.SupportItem.SUPPORT_MAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CourseConfigV2.SupportItem.PRIVACY_POLICY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CourseConfigV2.SupportItem.CANCEL_POLICY.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CourseConfigV2.QbankItem.values().length];
            try {
                iArr3[CourseConfigV2.QbankItem.QBANK_MANIFESTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CourseConfigV2.QbankItem.WOQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CourseConfigV2.QbankItem.CUSTOM_MODULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CourseConfigV2.QbankItem.SCHEMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CourseConfigV2.SearchItem.values().length];
            try {
                iArr4[CourseConfigV2.SearchItem.MCQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[CourseConfigV2.SearchItem.PEARL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[CourseConfigV2.SearchItem.QBANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[CourseConfigV2.SearchItem.TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[CourseConfigV2.SearchItem.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CourseConfigV2.TestItem.values().length];
            try {
                iArr5[CourseConfigV2.TestItem.STATE_RANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[CourseConfigV2.TestTabItem.values().length];
            try {
                iArr6[CourseConfigV2.TestTabItem.MCQ_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[CourseConfigV2.TestTabItem.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[CourseConfigV2.TestTabItem.GRAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[CourseConfigV2.TestTabItem.MINI.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[CourseConfigV2.TestTabItem.SUBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[CourseConfigV2.VideoItem.values().length];
            try {
                iArr7[CourseConfigV2.VideoItem.EDITION_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[CourseConfigV2.VideoItem.GO_PRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[CourseConfigV2.VideoItem.INTERN_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[CourseConfigV2.VideoItem.OPTIONAL_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[CourseConfigV2.VideoItem.SAMPLE_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[CourseConfigV2.VideoItem.KEY_VIDEO_BOOKMARKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[CourseConfigV2.VideoPageItem.values().length];
            try {
                iArr8[CourseConfigV2.VideoPageItem.RELATED_MODULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr8[CourseConfigV2.VideoPageItem.NOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr8[CourseConfigV2.VideoPageItem.OVERVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[CourseConfigV2.PracticalItems.values().length];
            try {
                iArr9[CourseConfigV2.PracticalItems.SUBJECT_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr9[CourseConfigV2.PracticalItems.MCQ_OF_THE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[CourseConfigV2.HomePageItems.values().length];
            try {
                iArr10[CourseConfigV2.HomePageItems.FEATURED_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.SUGGESTED_TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.SUGGESTED_QBANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.SUGGESTED_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.PEARLS.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.RECENT_UPDATES.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.MCQ_OF_THE_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.RENEW_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr10[CourseConfigV2.HomePageItems.MAGIC_MODULE.ordinal()] = 9;
            } catch (NoSuchFieldError unused44) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[CourseConfigV2.SettingsItem.values().length];
            try {
                iArr11[CourseConfigV2.SettingsItem.CHANGE_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.CHANGE_PH_NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.KYC_VERIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.PLAN_PAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.THEME.ordinal()] = 6;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.VIBRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr11[CourseConfigV2.SettingsItem.PLAN_UPGRADE.ordinal()] = 8;
            } catch (NoSuchFieldError unused52) {
            }
            $EnumSwitchMapping$10 = iArr11;
        }
    }

    public CourseConfigSerializer() {
        super(CourseConfigV2.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(CourseConfigV2 p0, JsonGenerator p1, SerializerProvider p2) throws IOException {
        List<CourseConfigV2.CustomModuleQuestionSource> questionSource;
        List<Integer> questionLimit;
        Integer introDurationSeconds;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        p1.writeStartObject();
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_IS_BOOKMARK_ON_TEST_TOOLBAR, p0.isBookmarkOnTestToolbar());
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_BOOKMARK_ON_HOME_TOOLBAR_ENABLED, p0.getBookmarkOnHomeToolbarEnabled());
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_IS_TEST_INTRO_FOOTER_ENABLED, p0.isTestIntroFooterEnabled());
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_DEFAULT_PLAN_BANNER_DESIGN, p0.getDefaultPlanBannerDesign());
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_SHOW_GO_PRO_BUTTON, p0.getShowGoProButton());
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_MAGIC_MODULE_ENABLED, p0.isMagicModuleEnabled());
        int i = WhenMappings.$EnumSwitchMapping$0[p0.getDefaultBottomTab().ordinal()];
        if (i == 1) {
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_DEFAULT_BOTTOM_TAB, "video");
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } else if (i == 2) {
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_DEFAULT_BOTTOM_TAB, "test");
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        } else if (i == 3) {
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_DEFAULT_BOTTOM_TAB, "qbank");
            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
        } else {
            if (i != 4) {
                throw new RenewEligibleCreator();
            }
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_DEFAULT_BOTTOM_TAB, CourseConfigKeyConstantsKt.KEY_HOME);
            getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
        }
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_SUPPORT_ITEMS);
        Iterator<T> it = p0.getSupportViews().iterator();
        while (it.hasNext()) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[((CourseConfigV2.SupportItem) it.next()).ordinal()];
            if (i2 == 1) {
                p1.writeString("faq");
                getShowPopup getshowpopup5 = getShowPopup.INSTANCE;
            } else if (i2 == 2) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_GET_CALL);
                getShowPopup getshowpopup6 = getShowPopup.INSTANCE;
            } else if (i2 == 3) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_SUPPORT_MAIL);
                getShowPopup getshowpopup7 = getShowPopup.INSTANCE;
            } else if (i2 == 4) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_PRIVACY_POLICY);
                getShowPopup getshowpopup8 = getShowPopup.INSTANCE;
            } else {
                if (i2 != 5) {
                    throw new RenewEligibleCreator();
                }
                p1.writeString(CourseConfigKeyConstantsKt.KEY_CANCEL_POLICY);
                getShowPopup getshowpopup9 = getShowPopup.INSTANCE;
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_QBANK_ITEMS);
        Iterator<T> it2 = p0.getQbankItems().iterator();
        while (it2.hasNext()) {
            int i3 = WhenMappings.$EnumSwitchMapping$2[((CourseConfigV2.QbankItem) it2.next()).ordinal()];
            if (i3 == 1) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_QBANK_MANIFESTO);
                getShowPopup getshowpopup10 = getShowPopup.INSTANCE;
            } else if (i3 == 2) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_WOQ);
                getShowPopup getshowpopup11 = getShowPopup.INSTANCE;
            } else if (i3 == 3) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE);
                getShowPopup getshowpopup12 = getShowPopup.INSTANCE;
            } else {
                if (i3 != 4) {
                    throw new RenewEligibleCreator();
                }
                p1.writeString("schema");
                getShowPopup getshowpopup13 = getShowPopup.INSTANCE;
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_SEARCH_ITEMS);
        Iterator<T> it3 = p0.getSearchItems().iterator();
        while (it3.hasNext()) {
            int i4 = WhenMappings.$EnumSwitchMapping$3[((CourseConfigV2.SearchItem) it3.next()).ordinal()];
            if (i4 == 1) {
                p1.writeString("mcq");
                getShowPopup getshowpopup14 = getShowPopup.INSTANCE;
            } else if (i4 == 2) {
                p1.writeString("pearl");
                getShowPopup getshowpopup15 = getShowPopup.INSTANCE;
            } else if (i4 == 3) {
                p1.writeString("qbank");
                getShowPopup getshowpopup16 = getShowPopup.INSTANCE;
            } else if (i4 == 4) {
                p1.writeString("test");
                getShowPopup getshowpopup17 = getShowPopup.INSTANCE;
            } else {
                if (i4 != 5) {
                    throw new RenewEligibleCreator();
                }
                p1.writeString("video");
                getShowPopup getshowpopup18 = getShowPopup.INSTANCE;
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_SUPPORTED_BOTTOM_TABS);
        Iterator<T> it4 = p0.getSupportedBottomTabs().iterator();
        while (it4.hasNext()) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[((CourseConfigV2.BottomTabItem) it4.next()).ordinal()];
            if (i5 == 1) {
                p1.writeString("video");
                getShowPopup getshowpopup19 = getShowPopup.INSTANCE;
            } else if (i5 == 2) {
                p1.writeString("test");
                getShowPopup getshowpopup20 = getShowPopup.INSTANCE;
            } else if (i5 != 3) {
                if (i5 != 4) {
                    throw new RenewEligibleCreator();
                }
                p1.writeString(CourseConfigKeyConstantsKt.KEY_HOME);
                getShowPopup getshowpopup21 = getShowPopup.INSTANCE;
            } else {
                p1.writeString("qbank");
                getShowPopup getshowpopup22 = getShowPopup.INSTANCE;
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_TEST_ITEMS);
        Iterator<T> it5 = p0.getTestItems().iterator();
        while (it5.hasNext()) {
            if (WhenMappings.$EnumSwitchMapping$4[((CourseConfigV2.TestItem) it5.next()).ordinal()] != 1) {
                throw new RenewEligibleCreator();
            }
            p1.writeString("state_rank");
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_TEST_TAB_ITEMS);
        Iterator<T> it6 = p0.getTestTabItems().iterator();
        while (it6.hasNext()) {
            int i6 = WhenMappings.$EnumSwitchMapping$5[((CourseConfigV2.TestTabItem) it6.next()).ordinal()];
            if (i6 == 1) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_200MCQ);
                getShowPopup getshowpopup23 = getShowPopup.INSTANCE;
            } else if (i6 == 2) {
                p1.writeString("all");
                getShowPopup getshowpopup24 = getShowPopup.INSTANCE;
            } else if (i6 == 3) {
                p1.writeString("grand");
                getShowPopup getshowpopup25 = getShowPopup.INSTANCE;
            } else if (i6 == 4) {
                p1.writeString("mini");
                getShowPopup getshowpopup26 = getShowPopup.INSTANCE;
            } else {
                if (i6 != 5) {
                    throw new RenewEligibleCreator();
                }
                p1.writeString("subject");
                getShowPopup getshowpopup27 = getShowPopup.INSTANCE;
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_VIDEO_ITEMS);
        Iterator<T> it7 = p0.getVideoItems().iterator();
        while (it7.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$6[((CourseConfigV2.VideoItem) it7.next()).ordinal()]) {
                case 1:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_EDITION_SWITCH);
                    getShowPopup getshowpopup28 = getShowPopup.INSTANCE;
                    break;
                case 2:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_GO_PRO);
                    getShowPopup getshowpopup29 = getShowPopup.INSTANCE;
                    break;
                case 3:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_INTERN_MODE);
                    getShowPopup getshowpopup30 = getShowPopup.INSTANCE;
                    break;
                case 4:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_OPTIONAL_VIDEOS);
                    getShowPopup getshowpopup31 = getShowPopup.INSTANCE;
                    break;
                case 5:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_SAMPLE_VIDEOS);
                    getShowPopup getshowpopup32 = getShowPopup.INSTANCE;
                    break;
                case 6:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_VIDEO_BOOKMARKS);
                    getShowPopup getshowpopup33 = getShowPopup.INSTANCE;
                    break;
                default:
                    throw new RenewEligibleCreator();
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_VIDEO_PAGE_TABS);
        Iterator<T> it8 = p0.getVideoPageTabs().iterator();
        while (it8.hasNext()) {
            int i7 = WhenMappings.$EnumSwitchMapping$7[((CourseConfigV2.VideoPageItem) it8.next()).ordinal()];
            if (i7 == 1) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_RELATED_MODULE);
                getShowPopup getshowpopup34 = getShowPopup.INSTANCE;
            } else if (i7 == 2) {
                p1.writeString(CourseConfigKeyConstantsKt.KEY_NOTES);
                getShowPopup getshowpopup35 = getShowPopup.INSTANCE;
            } else {
                if (i7 != 3) {
                    throw new RenewEligibleCreator();
                }
                p1.writeString(CourseConfigKeyConstantsKt.KEY_OVERVIEW);
                getShowPopup getshowpopup36 = getShowPopup.INSTANCE;
            }
        }
        p1.writeEndArray();
        CourseConfigV2.VideoProperties videoProperties = p0.getVideoProperties();
        if (videoProperties != null && (introDurationSeconds = videoProperties.getIntroDurationSeconds()) != null) {
            int iIntValue = introDurationSeconds.intValue();
            p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_VIDEO_PROPERTIES);
            p1.writeNumberField(CourseConfigKeyConstantsKt.KEY_INTRO_DURATION_SECONDS, iIntValue);
            p1.writeEndObject();
            getShowPopup getshowpopup37 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup38 = getShowPopup.INSTANCE;
        }
        p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_NAV_DRAWER_ITEMS);
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_TOP_SECTION);
        Iterator<T> it9 = p0.getNavDrawerItems().getTopSection().iterator();
        while (it9.hasNext()) {
            p1.writeString(getNavDrawerKey((CourseConfigV2.NavDrawerItem) it9.next()));
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_MIDDLE_SECTION);
        Iterator<T> it10 = p0.getNavDrawerItems().getMiddleSection().iterator();
        while (it10.hasNext()) {
            p1.writeString(getNavDrawerKey((CourseConfigV2.NavDrawerItem) it10.next()));
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_MID_SECTION);
        for (CourseConfigV2.NavDrawerItem navDrawerItem : p0.getNavDrawerItems().getMiddleSection()) {
            if (navDrawerItem instanceof CourseConfigV2.NavDrawerItem.DownloadPdfNotes) {
                p1.writeStartObject();
                p1.writeStringField("key", CourseConfigKeyConstantsKt.KEY_DOWNLOAD_NOTES);
                CourseConfigV2.NavDrawerItem.DownloadPdfNotes downloadPdfNotes = (CourseConfigV2.NavDrawerItem.DownloadPdfNotes) navDrawerItem;
                p1.writeStringField("title", downloadPdfNotes.getTitle());
                p1.writeObjectFieldStart("action");
                p1.writeStringField(CourseConfigKeyConstantsKt.KEY_HREF, downloadPdfNotes.getUrl());
                p1.writeEndObject();
                p1.writeEndObject();
            }
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_BOTTOM_SECTION);
        Iterator<T> it11 = p0.getNavDrawerItems().getBottomSection().iterator();
        while (it11.hasNext()) {
            p1.writeString(getNavDrawerKey((CourseConfigV2.NavDrawerItem) it11.next()));
        }
        p1.writeEndArray();
        p1.writeEndObject();
        p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_SETTINGS_ITEMS);
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_ACCOUNT_SETTINGS);
        Iterator<T> it12 = p0.getSettingsItems().getAccountSettings().iterator();
        while (it12.hasNext()) {
            p1.writeString(getSettingsKey((CourseConfigV2.SettingsItem) it12.next()));
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_APP_SETTINGS);
        Iterator<T> it13 = p0.getSettingsItems().getAppSettings().iterator();
        while (it13.hasNext()) {
            p1.writeString(getSettingsKey((CourseConfigV2.SettingsItem) it13.next()));
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_MAIN_SETTINGS);
        Iterator<T> it14 = p0.getSettingsItems().getMainSettings().iterator();
        while (it14.hasNext()) {
            p1.writeString(getSettingsKey((CourseConfigV2.SettingsItem) it14.next()));
        }
        p1.writeEndArray();
        p1.writeEndObject();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_DEEPLINKS);
        Iterator<T> it15 = p0.getDeeplinks().iterator();
        while (it15.hasNext()) {
            p1.writeString((String) it15.next());
        }
        p1.writeEndArray();
        List<CourseConfigV2.PracticalItems> practicalItems = p0.getPracticalItems();
        if (practicalItems != null) {
            p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_PRACTICAL_ITEMS);
            Iterator<T> it16 = practicalItems.iterator();
            while (it16.hasNext()) {
                int i8 = WhenMappings.$EnumSwitchMapping$8[((CourseConfigV2.PracticalItems) it16.next()).ordinal()];
                if (i8 == 1) {
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_PRACTICAL_ITEMS_SUBJECT_LIST);
                    getShowPopup getshowpopup39 = getShowPopup.INSTANCE;
                } else {
                    if (i8 != 2) {
                        throw new RenewEligibleCreator();
                    }
                    p1.writeString("mcq_of_the_day");
                    getShowPopup getshowpopup40 = getShowPopup.INSTANCE;
                }
            }
            p1.writeEndArray();
            getShowPopup getshowpopup41 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup42 = getShowPopup.INSTANCE;
        }
        List<CourseConfigV2.ZenAreaItem> zenArea = p0.getZenArea();
        if (zenArea != null) {
            p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_ZEN_AREA);
            for (CourseConfigV2.ZenAreaItem zenAreaItem : zenArea) {
                p1.writeStartObject();
                p1.writeObjectFieldStart("meta");
                for (Map.Entry<String, Object> entry : zenAreaItem.getMeta().entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        p1.writeStringField(key, (String) value);
                    } else if (value instanceof Integer) {
                        p1.writeNumberField(key, ((Number) value).intValue());
                    } else if (value instanceof List) {
                        p1.writeArrayFieldStart(key);
                        for (Object obj : (Iterable) value) {
                            if (obj instanceof String) {
                                p1.writeString((String) obj);
                            } else if (obj instanceof Integer) {
                                p1.writeNumber(((Number) obj).intValue());
                            }
                        }
                        p1.writeEndArray();
                    }
                }
                p1.writeEndObject();
                p1.writeStringField("type", zenAreaItem.getType());
                p1.writeEndObject();
            }
            p1.writeEndArray();
            getShowPopup getshowpopup43 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup44 = getShowPopup.INSTANCE;
        }
        Map<String, CourseConfigV2.QBankGroupItem> qBankGroupMeta = p0.getQBankGroupMeta();
        if (qBankGroupMeta != null) {
            p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_QBANK_GROUP_META);
            for (Map.Entry<String, CourseConfigV2.QBankGroupItem> entry2 : qBankGroupMeta.entrySet()) {
                String key2 = entry2.getKey();
                CourseConfigV2.QBankGroupItem value2 = entry2.getValue();
                p1.writeObjectFieldStart(key2);
                p1.writeStringField(CourseConfigKeyConstantsKt.KEY_QBANK_GROUP_META_SUBJECT_PREFIX, value2.getSubjectPrefix());
                p1.writeEndObject();
            }
            p1.writeEndObject();
            getShowPopup getshowpopup45 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup46 = getShowPopup.INSTANCE;
        }
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_HOME_PAGE_ITEMS);
        Iterator<T> it17 = p0.getHomePageItems().iterator();
        while (it17.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$9[((CourseConfigV2.HomePageItems) it17.next()).ordinal()]) {
                case 1:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_FEATURED_CARD);
                    getShowPopup getshowpopup47 = getShowPopup.INSTANCE;
                    break;
                case 2:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_SUGGESTED_TEST);
                    getShowPopup getshowpopup48 = getShowPopup.INSTANCE;
                    break;
                case 3:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_SUGGESTED_QBANK);
                    getShowPopup getshowpopup49 = getShowPopup.INSTANCE;
                    break;
                case 4:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_SUGGESTED_VIDEO);
                    getShowPopup getshowpopup50 = getShowPopup.INSTANCE;
                    break;
                case 5:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_PEARLS);
                    getShowPopup getshowpopup51 = getShowPopup.INSTANCE;
                    break;
                case 6:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_RECENT_UPDATES);
                    getShowPopup getshowpopup52 = getShowPopup.INSTANCE;
                    break;
                case 7:
                    p1.writeString("mcq_of_the_day");
                    getShowPopup getshowpopup53 = getShowPopup.INSTANCE;
                    break;
                case 8:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_RENEW_CARD);
                    getShowPopup getshowpopup54 = getShowPopup.INSTANCE;
                    break;
                case 9:
                    p1.writeString(CourseConfigKeyConstantsKt.KEY_MAGIC_MODULE);
                    getShowPopup getshowpopup55 = getShowPopup.INSTANCE;
                    break;
                default:
                    throw new RenewEligibleCreator();
            }
        }
        p1.writeEndArray();
        p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_COPY_TEXT);
        CourseConfigV2.CourseStrings courseStrings = p0.getCourseStrings();
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_QBANK_HEADER_TITLE, courseStrings.getQbankHeaderTitle());
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_TEST_HEADER_TITLE, courseStrings.getTestHeaderTitle());
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_VIDEO_HEADER_TITLE, courseStrings.getVideoHeaderTitle());
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_SEARCH_DESCRIPTION, courseStrings.getSearchDescription());
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_SEARCH_HINT, courseStrings.getSearchHint());
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_VIDEO_NOTES_TITLE, courseStrings.getVideoPageNotesTitle());
        p1.writeStringField(CourseConfigKeyConstantsKt.KEY_BUY_NOW_HIGHLIGHT_VALUE, courseStrings.getBuyNowHighlight());
        p1.writeEndObject();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_ACADEMIC_YEAR);
        for (CourseConfigV2.AcademicYear academicYear : p0.getAcademicYears()) {
            p1.writeStartObject();
            p1.writeNumberField(CourseConfigKeyConstantsKt.KEY_AY_START_DATE, academicYear.getStartDate());
            p1.writeNumberField(CourseConfigKeyConstantsKt.KEY_AY_END_DATE, academicYear.getEndDate());
            p1.writeStringField("label", academicYear.getLabel());
            p1.writeEndObject();
        }
        p1.writeEndArray();
        CourseConfigV2.EditionSwitch editionSwitch = p0.getEditionSwitch();
        if (editionSwitch != null) {
            p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_EDITION_SWITCH);
            p1.writeStringField("title", editionSwitch.getTitle());
            p1.writeEndObject();
            getShowPopup getshowpopup56 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup57 = getShowPopup.INSTANCE;
        }
        CourseConfigV2.CustomModuleConfig customModuleConfig = p0.getCustomModuleConfig();
        p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE_BASE_CONFIG);
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_QUESTION_COUNT);
        if (customModuleConfig != null && (questionLimit = customModuleConfig.getQuestionLimit()) != null) {
            Iterator<T> it18 = questionLimit.iterator();
            while (it18.hasNext()) {
                p1.writeNumber(((Number) it18.next()).intValue());
            }
            getShowPopup getshowpopup58 = getShowPopup.INSTANCE;
        }
        p1.writeEndArray();
        p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_QUESTION_SOURCE);
        if (customModuleConfig != null && (questionSource = customModuleConfig.getQuestionSource()) != null) {
            for (CourseConfigV2.CustomModuleQuestionSource customModuleQuestionSource : questionSource) {
                p1.writeStartObject();
                p1.writeStringField("label", customModuleQuestionSource.getLabel());
                p1.writeStringField("type", customModuleQuestionSource.getType());
                p1.writeStringField("category", customModuleQuestionSource.getCategory());
                p1.writeEndObject();
            }
            getShowPopup getshowpopup59 = getShowPopup.INSTANCE;
        }
        p1.writeEndArray();
        p1.writeEndObject();
        getShowPopup getshowpopup60 = getShowPopup.INSTANCE;
        p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_SHOW_NOTES_WATERMARK, p0.getShowNotesWatermark());
        CourseConfigV2.GtAnalyticsCard gtAnalyticsCard = p0.getGtAnalyticsCard();
        if (gtAnalyticsCard != null) {
            p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_GT_ANALYTICS_CARD);
            String title = gtAnalyticsCard.getTitle();
            if (title != null) {
                p1.writeStringField("title", title);
                getShowPopup getshowpopup61 = getShowPopup.INSTANCE;
                getShowPopup getshowpopup62 = getShowPopup.INSTANCE;
            }
            String subText = gtAnalyticsCard.getSubText();
            if (subText != null) {
                p1.writeStringField("sub_text", subText);
                getShowPopup getshowpopup63 = getShowPopup.INSTANCE;
                getShowPopup getshowpopup64 = getShowPopup.INSTANCE;
            }
            String badge = gtAnalyticsCard.getBadge();
            if (badge != null) {
                p1.writeStringField("badge", badge);
                getShowPopup getshowpopup65 = getShowPopup.INSTANCE;
                getShowPopup getshowpopup66 = getShowPopup.INSTANCE;
            }
            p1.writeEndObject();
            getShowPopup getshowpopup67 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup68 = getShowPopup.INSTANCE;
        }
        List<CourseConfigV2.VideoSubjectPageItem> videoSubjectPageItems = p0.getVideoSubjectPageItems();
        if (videoSubjectPageItems != null) {
            p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEMS);
            for (CourseConfigV2.VideoSubjectPageItem videoSubjectPageItem : videoSubjectPageItems) {
                p1.writeStartObject();
                p1.writeStringField("id", videoSubjectPageItem.getId());
                p1.writeStringField("title", videoSubjectPageItem.getTitle());
                String target = videoSubjectPageItem.getTarget();
                if (target != null) {
                    p1.writeStringField(CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, target);
                    getShowPopup getshowpopup69 = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup70 = getShowPopup.INSTANCE;
                }
                String badgeText = videoSubjectPageItem.getBadgeText();
                if (badgeText != null) {
                    p1.writeStringField("badge", badgeText);
                    getShowPopup getshowpopup71 = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup72 = getShowPopup.INSTANCE;
                }
                String subText2 = videoSubjectPageItem.getSubText();
                if (subText2 != null) {
                    p1.writeStringField("sub_text", subText2);
                    getShowPopup getshowpopup73 = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup74 = getShowPopup.INSTANCE;
                }
                List<Integer> linkedGroupIds = videoSubjectPageItem.getLinkedGroupIds();
                if (linkedGroupIds.isEmpty()) {
                    linkedGroupIds = null;
                }
                if (linkedGroupIds != null) {
                    p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_LINKED_GROUP_IDS);
                    Iterator<T> it19 = linkedGroupIds.iterator();
                    while (it19.hasNext()) {
                        p1.writeNumber(((Number) it19.next()).intValue());
                    }
                    p1.writeEndArray();
                    getShowPopup getshowpopup75 = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup76 = getShowPopup.INSTANCE;
                }
                p1.writeEndObject();
            }
            p1.writeEndArray();
            getShowPopup getshowpopup77 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup78 = getShowPopup.INSTANCE;
        }
        List<CourseConfigV2.AnnouncementBanner> announcementBanners = p0.getAnnouncementBanners();
        if (announcementBanners.isEmpty()) {
            announcementBanners = null;
        }
        if (announcementBanners != null) {
            p1.writeArrayFieldStart(CourseConfigKeyConstantsKt.KEY_ANNOUNCEMENT_BANNERS);
            for (CourseConfigV2.AnnouncementBanner announcementBanner : announcementBanners) {
                p1.writeStartObject();
                p1.writeStringField("id", announcementBanner.getId());
                p1.writeBooleanField("is_active", announcementBanner.isActive());
                p1.writeStringField("text", announcementBanner.getText());
                List<String> subjectIds = announcementBanner.getSubjectIds();
                if (subjectIds.isEmpty()) {
                    subjectIds = null;
                }
                if (subjectIds != null) {
                    p1.writeArrayFieldStart("subject_ids");
                    Iterator<T> it20 = subjectIds.iterator();
                    while (it20.hasNext()) {
                        p1.writeString((String) it20.next());
                    }
                    p1.writeEndArray();
                    getShowPopup getshowpopup79 = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup80 = getShowPopup.INSTANCE;
                }
                CourseConfigV2.AnnouncementPopup popup = announcementBanner.getPopup();
                if (popup != null) {
                    p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_ANNOUNCEMENT_POPUP);
                    p1.writeArrayFieldStart("body");
                    Iterator<T> it21 = popup.getBody().iterator();
                    while (it21.hasNext()) {
                        p1.writeString((String) it21.next());
                    }
                    p1.writeEndArray();
                    p1.writeEndObject();
                    getShowPopup getshowpopup81 = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup82 = getShowPopup.INSTANCE;
                }
                p1.writeEndObject();
            }
            p1.writeEndArray();
            getShowPopup getshowpopup83 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup84 = getShowPopup.INSTANCE;
        }
        CourseConfigV2.EditionUpdatePopup editionUpdatePopup = p0.getEditionUpdatePopup();
        if (editionUpdatePopup != null) {
            p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_EDITION_UPDATE_POPUP);
            p1.writeBooleanField("is_active", editionUpdatePopup.isActive());
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_EDITION_UPDATE_POPUP_VARIANT, editionUpdatePopup.getVariant());
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_EDITION_UPDATE_POPUP_ACK_KEY, editionUpdatePopup.getAckKey());
            p1.writeEndObject();
            getShowPopup getshowpopup85 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup86 = getShowPopup.INSTANCE;
        }
        CourseConfigV2.PlanScreenConfig planScreenConfig = p0.getPlanScreenConfig();
        if (planScreenConfig != null) {
            p1.writeObjectFieldStart(CourseConfigKeyConstantsKt.KEY_PLAN_SCREEN_CONFIG);
            p1.writeStringField(CourseConfigKeyConstantsKt.KEY_EMPTY_BUY_PLAN_TEXT, planScreenConfig.getEmptyBuyPlanText());
            p1.writeBooleanField(CourseConfigKeyConstantsKt.KEY_SHOULD_SHOW_EMPTY_PLAN_SCREEN, planScreenConfig.getShouldShowEmptyPlanScreen());
            p1.writeEndObject();
            getShowPopup getshowpopup87 = getShowPopup.INSTANCE;
            getShowPopup getshowpopup88 = getShowPopup.INSTANCE;
        }
        p1.writeEndObject();
    }

    private final String getNavDrawerKey(CourseConfigV2.NavDrawerItem p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.AboutUs.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_ABOUT_US;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.AddVideo.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_ADD_VIDEO;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.BuyNow.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_BUY_NOW;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.ContactUs.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_CONTACT_US;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.Faq.INSTANCE)) {
            return "faq";
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.FreeExtension.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_FREE_EXTENSION;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.KnowMore.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_KNOW_MORE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.MarrowNotes.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_MARROW_NOTES;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.MyPlan.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_MY_PLAN;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.RateUs.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_RATE_US;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.ReportPiracy.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_REPORT_PIRACY;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.Share.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_SHARE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.Tnc.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_TNC;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CourseConfigV2.NavDrawerItem.YourCourse.INSTANCE)) {
            return CourseConfigKeyConstantsKt.KEY_YOUR_COURSE;
        }
        if (p0 instanceof CourseConfigV2.NavDrawerItem.DownloadPdfNotes) {
            return CourseConfigKeyConstantsKt.KEY_DOWNLOAD_NOTES;
        }
        throw new RenewEligibleCreator();
    }

    private final String getSettingsKey(CourseConfigV2.SettingsItem p0) {
        switch (WhenMappings.$EnumSwitchMapping$10[p0.ordinal()]) {
            case 1:
                return CourseConfigKeyConstantsKt.KEY_CHANGE_PASSWORD;
            case 2:
                return CourseConfigKeyConstantsKt.KEY_CHANGE_PHONE_NO;
            case 3:
                return CourseConfigKeyConstantsKt.KEY_KYC_VERIFICATION;
            case 4:
                return CourseConfigKeyConstantsKt.KEY_PLAN_PAGE;
            case 5:
                return CourseConfigKeyConstantsKt.KEY_RESET;
            case 6:
                return CourseConfigKeyConstantsKt.KEY_THEME;
            case 7:
                return CourseConfigKeyConstantsKt.KEY_VIBRATION;
            case 8:
                return CourseConfigKeyConstantsKt.KEY_PLAN_UPGRADE;
            default:
                throw new RenewEligibleCreator();
        }
    }
}
