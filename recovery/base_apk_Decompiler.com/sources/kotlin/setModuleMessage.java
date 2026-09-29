package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface setModuleMessage {
    public static final setModuleMessage RemoteActionCompatParcelizer = new setModuleMessage() { // from class: o.setModuleMessage.4
        private static /* synthetic */ void write(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.setModuleMessage
        public final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getNotesCount getnotescount) {
            if (getnotescount != null) {
                return null;
            }
            write(0);
            return null;
        }

        @Override // kotlin.setModuleMessage
        public final void read(isPaused ispaused) {
            if (ispaused == null) {
                write(7);
            }
        }

        @Override // kotlin.setModuleMessage
        public final void read(HomeQbankModelCompanion homeQbankModelCompanion, CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard) {
            if (homeQbankModelCompanion == null) {
                write(3);
            }
            if (courseConfigV2GtAnalyticsCard == null) {
                write(4);
            }
        }

        @Override // kotlin.setModuleMessage
        public final void write(getExpiryTimeStamp getexpirytimestamp, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
            if (getexpirytimestamp == null) {
                write(5);
            }
            if (courseConfigV2SettingsItems == null) {
                write(6);
            }
        }

        @Override // kotlin.setModuleMessage
        public final void IconCompatParcelizer(getResultTimeStamp getresulttimestamp, CourseConfigV2SupportItem courseConfigV2SupportItem) {
            if (getresulttimestamp == null) {
                write(1);
            }
            if (courseConfigV2SupportItem == null) {
                write(2);
            }
        }
    };

    CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getNotesCount getnotescount);

    void IconCompatParcelizer(getResultTimeStamp getresulttimestamp, CourseConfigV2SupportItem courseConfigV2SupportItem);

    void read(HomeQbankModelCompanion homeQbankModelCompanion, CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard);

    void read(isPaused ispaused);

    void write(getExpiryTimeStamp getexpirytimestamp, CourseConfigV2SettingsItems courseConfigV2SettingsItems);
}
