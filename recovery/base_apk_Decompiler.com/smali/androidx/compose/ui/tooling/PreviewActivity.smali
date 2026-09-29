###### Class androidx.compose.ui.tooling.PreviewActivity (androidx.compose.ui.tooling.PreviewActivity)
.class public final Landroidx/compose/ui/tooling/PreviewActivity;
.super Lo/MediaBrowserCompatMediaItem;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/PreviewActivity;",
        "Lo/MediaBrowserCompatMediaItem;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "p0",
        "",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "",
        "RemoteActionCompatParcelizer",
        "(Ljava/lang/String;)V",
        "p1",
        "p2",
        "AudioAttributesCompatParcelizer",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "read",
        "Ljava/lang/String;",
        "write"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final read:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 47
    invoke-direct {p0}, Lo/MediaBrowserCompatMediaItem;-><init>()V

    .line 50
    const-string v0, "PreviewActivity"

    iput-object v0, p0, Landroidx/compose/ui/tooling/PreviewActivity;->read:Ljava/lang/String;

    return-void
.end method

.method private static final AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 8

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    and-int/lit8 v1, p4, 0x1

    invoke-interface {p3, v0, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)"

    const v2, -0x7155c95a

    invoke-static {v2, p4, v0, v1}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 129
    :cond_1f
    sget-object p4, Lo/injection;->INSTANCE:Lo/injection;

    .line 133
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    .line 129
    invoke-virtual {p4, p0, p1, p3, p2}, Lo/injection;->read(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;[Ljava/lang/Object;)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result p0

    if-eqz p0, :cond_36

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_36

    .line 128
    :cond_33
    invoke-interface {p3}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 135
    :cond_36
    :goto_36
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/hasMoreBytes;Lo/getReturnTransition;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 7

    .line 194
    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/tooling/PreviewActivity;->read(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/hasMoreBytes;Lo/getReturnTransition;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method private final AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 7

    .line 95
    invoke-static {p3}, Lo/_deserializeMissingToken;->read(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    .line 96
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "parameterProviderIndex"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 94
    invoke-static {p3, v0}, Lo/_deserializeMissingToken;->write(Ljava/lang/Class;I)[Ljava/lang/Object;

    move-result-object p3

    .line 102
    array-length v0, p3

    const/4 v1, 0x1

    if-le v0, v1, :cond_2b

    .line 103
    check-cast p0, Lo/MediaBrowserCompatMediaItem;

    new-instance v0, Lo/setDefaultCreator;

    invoke-direct {v0, p3, p1, p2}, Lo/setDefaultCreator;-><init>([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    const p1, -0x33602623    # -8.3807976E7f

    invoke-static {p1, v1, v0}, Lo/multiplyFft;->IconCompatParcelizer(IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;

    move-result-object p1

    check-cast p1, Lo/MagicModuleSubmissionRequestBody;

    invoke-static {p0, p1}, Lo/ParcelableVolumeInfo;->read(Lo/MediaBrowserCompatMediaItem;Lo/MagicModuleSubmissionRequestBody;)V

    return-void

    .line 128
    :cond_2b
    check-cast p0, Lo/MediaBrowserCompatMediaItem;

    new-instance v0, Lo/_deserializeAndSet;

    invoke-direct {v0, p1, p2, p3}, Lo/_deserializeAndSet;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const p1, -0x7155c95a

    invoke-static {p1, v1, v0}, Lo/multiplyFft;->IconCompatParcelizer(IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;

    move-result-object p1

    check-cast p1, Lo/MagicModuleSubmissionRequestBody;

    invoke-static {p0, p1}, Lo/ParcelableVolumeInfo;->read(Lo/MediaBrowserCompatMediaItem;Lo/MagicModuleSubmissionRequestBody;)V

    return-void
.end method

.method private static final RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 8

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    move v0, v2

    :goto_9
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)"

    const v3, -0x321af304

    invoke-static {v3, p3, v0, v1}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 75
    :cond_20
    sget-object p3, Lo/injection;->INSTANCE:Lo/injection;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p3, p0, p1, p2, v0}, Lo/injection;->read(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;[Ljava/lang/Object;)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result p0

    if-eqz p0, :cond_34

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_34

    :cond_31
    invoke-interface {p2}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    :cond_34
    :goto_34
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method private static final RemoteActionCompatParcelizer([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 33

    move-object/from16 v0, p0

    move-object/from16 v15, p3

    move/from16 v1, p4

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_f

    move v2, v5

    goto :goto_10

    :cond_f
    move v2, v4

    :goto_10
    and-int/lit8 v3, v1, 0x1

    invoke-interface {v15, v2, v3}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v2

    if-eqz v2, :cond_8e

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v2

    if-eqz v2, :cond_27

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)"

    const v6, -0x33602623    # -8.3807976E7f

    invoke-static {v6, v1, v2, v3}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 141
    :cond_27
    invoke-interface/range {p3 .. p3}, Lo/_handleUnrecognizedCharacterEscape;->onPause()Ljava/lang/Object;

    move-result-object v1

    .line 142
    sget-object v2, Lo/_handleUnrecognizedCharacterEscape;->write:Lo/_handleUnrecognizedCharacterEscape$write;

    invoke-virtual {v2}, Lo/_handleUnrecognizedCharacterEscape$write;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3a

    .line 104
    invoke-static {v4}, Lo/_appendByte;->RemoteActionCompatParcelizer(I)Lo/hasMoreBytes;

    move-result-object v1

    .line 144
    invoke-interface {v15, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    .line 104
    :cond_3a
    check-cast v1, Lo/hasMoreBytes;

    .line 117
    new-instance v2, Lo/_handleTypePropertyValue;

    invoke-direct {v2, v0, v1}, Lo/_handleTypePropertyValue;-><init>([Ljava/lang/Object;Lo/hasMoreBytes;)V

    const v3, 0x392326a5

    const/16 v4, 0x36

    invoke-static {v3, v5, v2, v15, v4}, Lo/multiplyFft;->AudioAttributesCompatParcelizer(IZLjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/FastIntegerMathUInt128;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lo/MagicModuleSubmissionRequestBody;

    .line 107
    new-instance v2, Lo/verifyNonDup;

    move-object/from16 v3, p1

    move-object/from16 v7, p2

    invoke-direct {v2, v3, v7, v0, v1}, Lo/verifyNonDup;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/hasMoreBytes;)V

    const v0, 0x36a7e9b

    invoke-static {v0, v5, v2, v15, v4}, Lo/multiplyFft;->AudioAttributesCompatParcelizer(IZLjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/FastIntegerMathUInt128;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lo/getModuleData;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/high16 v25, 0x30000

    const/high16 v26, 0xc00000

    const v27, 0x1ffdf

    move-object/from16 v24, p3

    .line 106
    invoke-static/range {v1 .. v27}, Lo/JsonIncludeInclude;->IconCompatParcelizer(Lo/_handleOddName;Lo/JsonManagedReference;Lo/MagicModuleSubmissionRequestBody;Lo/MagicModuleSubmissionRequestBody;Lo/getModuleData;Lo/MagicModuleSubmissionRequestBody;IZLo/getModuleData;ZLo/findAndAddVirtualProperties;FJJJJJLo/getModuleData;Lo/_handleUnrecognizedCharacterEscape;III)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_91

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_91

    .line 103
    :cond_8e
    invoke-interface/range {p3 .. p3}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 126
    :cond_91
    :goto_91
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method private static final RemoteActionCompatParcelizer([Ljava/lang/Object;Lo/hasMoreBytes;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 19

    move-object v0, p0

    move-object/from16 v11, p2

    move/from16 v1, p3

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_c

    const/4 v2, 0x1

    goto :goto_d

    :cond_c
    const/4 v2, 0x0

    :goto_d
    and-int/lit8 v3, v1, 0x1

    invoke-interface {v11, v2, v3}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v2

    if-eqz v2, :cond_6f

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v2

    if-eqz v2, :cond_24

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)"

    const v4, 0x392326a5

    invoke-static {v4, v1, v2, v3}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    :cond_24
    sget-object v1, Lo/propertyDef;->read:Lo/propertyDef;

    invoke-virtual {v1}, Lo/propertyDef;->read()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v1

    .line 120
    invoke-interface {v11, p0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v2

    .line 147
    invoke-interface/range {p2 .. p2}, Lo/_handleUnrecognizedCharacterEscape;->onPause()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3c

    .line 148
    sget-object v2, Lo/_handleUnrecognizedCharacterEscape;->write:Lo/_handleUnrecognizedCharacterEscape$write;

    invoke-virtual {v2}, Lo/_handleUnrecognizedCharacterEscape$write;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_46

    .line 120
    :cond_3c
    new-instance v3, Lo/ExternalTypeHandler;

    move-object/from16 v2, p1

    invoke-direct {v3, v2, p0}, Lo/ExternalTypeHandler;-><init>(Lo/hasMoreBytes;[Ljava/lang/Object;)V

    .line 150
    invoke-interface {v11, v3}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    .line 120
    :cond_46
    move-object v2, v3

    check-cast v2, Lo/getCreatedOnDateMs;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x6

    const/16 v14, 0x1fc

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-wide v6, v7

    move-wide v8, v9

    move-object v10, v12

    move-object/from16 v11, p2

    move v12, v13

    move v13, v14

    .line 118
    invoke-static/range {v0 .. v13}, Lo/onAttachedToWindow;->IconCompatParcelizer(Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;Lo/_handleOddName;Lo/MagicModuleSubmissionRequestBody;Lo/hashCode;Lo/findAndAddVirtualProperties;JJLo/onDetachedFromWindow;Lo/_handleUnrecognizedCharacterEscape;II)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_72

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_72

    .line 117
    :cond_6f
    invoke-interface/range {p2 .. p2}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 124
    :cond_72
    :goto_72
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method private final RemoteActionCompatParcelizer(Ljava/lang/String;)V
    .registers 5

    const/16 v0, 0x2e

    .line 67
    invoke-static {p1, v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    .line 68
    invoke-static {p1, v0}, Lo/TestGroupLSModel;->RemoteActionCompatParcelizer(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    .line 70
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "parameterProviderClassName"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 71
    invoke-direct {p0, v1, p1, v0}, Landroidx/compose/ui/tooling/PreviewActivity;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 75
    :cond_1a
    check-cast p0, Lo/MediaBrowserCompatMediaItem;

    new-instance v0, Lo/ErrorThrowingDeserializer;

    invoke-direct {v0, v1, p1}, Lo/ErrorThrowingDeserializer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const p1, -0x321af304

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lo/multiplyFft;->IconCompatParcelizer(IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;

    move-result-object p1

    check-cast p1, Lo/MagicModuleSubmissionRequestBody;

    invoke-static {p0, p1}, Lo/ParcelableVolumeInfo;->read(Lo/MediaBrowserCompatMediaItem;Lo/MagicModuleSubmissionRequestBody;)V

    return-void
.end method

.method public static synthetic read(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 5

    .line 193
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/tooling/PreviewActivity;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method private static final read(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/hasMoreBytes;Lo/getReturnTransition;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 11

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_e

    invoke-interface {p5, p4}, Lo/_handleUnrecognizedCharacterEscape;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x4

    goto :goto_d

    :cond_c
    const/4 v0, 0x2

    :goto_d
    or-int/2addr p6, v0

    :cond_e
    and-int/lit8 v0, p6, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    if-eq v0, v1, :cond_17

    const/4 v0, 0x1

    goto :goto_18

    :cond_17
    move v0, v2

    :goto_18
    and-int/lit8 v1, p6, 0x1

    invoke-interface {p5, v0, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v0

    if-eqz v0, :cond_c7

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_2f

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)"

    const v3, 0x36a7e9b

    invoke-static {v3, p6, v0, v1}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 108
    :cond_2f
    sget-object p6, Lo/_handleOddName;->AudioAttributesCompatParcelizer:Lo/_handleOddName$AudioAttributesCompatParcelizer;

    check-cast p6, Lo/_handleOddName;

    invoke-static {p6, p4}, Lo/getParentFragment;->read(Lo/_handleOddName;Lo/getReturnTransition;)Lo/_handleOddName;

    move-result-object p4

    .line 154
    sget-object p6, Lo/_skipWSOrEnd;->IconCompatParcelizer:Lo/_skipWSOrEnd$IconCompatParcelizer;

    invoke-virtual {p6}, Lo/_skipWSOrEnd$IconCompatParcelizer;->MediaBrowserCompatSearchResultReceiver()Lo/_skipWSOrEnd;

    move-result-object p6

    .line 158
    invoke-static {p6, v2}, Lo/AbsSavedState1;->write(Lo/_skipWSOrEnd;Z)Lo/withTypeHandler;

    move-result-object p6

    .line 164
    invoke-static {p5, v2}, Lo/_getBigDecimal;->RemoteActionCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    .line 165
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->handleMediaPlayPauseIfPendingOnHandler()Lo/_getCharDesc;

    move-result-object v1

    .line 166
    invoke-static {p5, p4}, Lo/_verifyNLZ2;->RemoteActionCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;Lo/_handleOddName;)Lo/_handleOddName;

    move-result-object p4

    .line 168
    sget-object v2, Lo/getDependencies;->AudioAttributesCompatParcelizer:Lo/getDependencies$AudioAttributesCompatParcelizer;

    invoke-virtual {v2}, Lo/getDependencies$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Lo/getCreatedOnDateMs;

    move-result-object v2

    .line 170
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->MediaMetadataCompat()Lo/_closeInput;

    move-result-object v3

    instance-of v3, v3, Lo/_closeInput;

    if-nez v3, :cond_62

    invoke-static {}, Lo/_getBigDecimal;->write()V

    .line 171
    :cond_62
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromMediaId()V

    .line 172
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->onPlayFromMediaId()Z

    move-result v3

    if-eqz v3, :cond_6f

    .line 173
    invoke-interface {p5, v2}, Lo/_handleUnrecognizedCharacterEscape;->read(Lo/getCreatedOnDateMs;)V

    goto :goto_72

    .line 175
    :cond_6f
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->onPlayFromUri()V

    .line 177
    :goto_72
    invoke-static {p5}, Lo/NumberOutput;->read(Lo/_handleUnrecognizedCharacterEscape;)Lo/_handleUnrecognizedCharacterEscape;

    move-result-object v2

    .line 178
    sget-object v3, Lo/getDependencies;->AudioAttributesCompatParcelizer:Lo/getDependencies$AudioAttributesCompatParcelizer;

    invoke-virtual {v3}, Lo/getDependencies$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v3

    invoke-static {v2, p6, v3}, Lo/NumberOutput;->write(Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V

    .line 179
    sget-object p6, Lo/getDependencies;->AudioAttributesCompatParcelizer:Lo/getDependencies$AudioAttributesCompatParcelizer;

    invoke-virtual {p6}, Lo/getDependencies$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver()Lo/MagicModuleSubmissionRequestBody;

    move-result-object p6

    invoke-static {v2, v1, p6}, Lo/NumberOutput;->write(Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V

    .line 180
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    sget-object v0, Lo/getDependencies;->AudioAttributesCompatParcelizer:Lo/getDependencies$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/getDependencies$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v0

    invoke-static {v2, p6, v0}, Lo/NumberOutput;->RemoteActionCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V

    .line 181
    sget-object p6, Lo/getDependencies;->AudioAttributesCompatParcelizer:Lo/getDependencies$AudioAttributesCompatParcelizer;

    invoke-virtual {p6}, Lo/getDependencies$AudioAttributesCompatParcelizer;->write()Lo/getAnswerMap;

    move-result-object p6

    invoke-static {v2, p6}, Lo/NumberOutput;->write(Lo/_handleUnrecognizedCharacterEscape;Lo/getAnswerMap;)V

    .line 182
    sget-object p6, Lo/getDependencies;->AudioAttributesCompatParcelizer:Lo/getDependencies$AudioAttributesCompatParcelizer;

    invoke-virtual {p6}, Lo/getDependencies$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver()Lo/MagicModuleSubmissionRequestBody;

    move-result-object p6

    invoke-static {v2, p4, p6}, Lo/NumberOutput;->write(Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V

    .line 160
    sget-object p4, Lo/setDrawerElevation;->INSTANCE:Lo/setDrawerElevation;

    check-cast p4, Lo/writeReplace;

    .line 109
    sget-object p4, Lo/injection;->INSTANCE:Lo/injection;

    .line 113
    invoke-interface {p3}, Lo/hasMoreBytes;->IconCompatParcelizer()I

    move-result p3

    aget-object p2, p2, p3

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 109
    invoke-virtual {p4, p0, p1, p5, p2}, Lo/injection;->read(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;[Ljava/lang/Object;)V

    .line 185
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->AudioAttributesImplBaseParcelizer()V

    .line 188
    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result p0

    if-eqz p0, :cond_ca

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_ca

    .line 107
    :cond_c7
    invoke-interface {p5}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 116
    :cond_ca
    :goto_ca
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method private static final read(Lo/hasMoreBytes;[Ljava/lang/Object;)Lo/getShowPopup;
    .registers 3

    .line 121
    invoke-interface {p0}, Lo/hasMoreBytes;->IconCompatParcelizer()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    array-length p1, p1

    rem-int/2addr v0, p1

    invoke-interface {p0, v0}, Lo/hasMoreBytes;->read(I)V

    .line 122
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public static synthetic read([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 5

    .line 189
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/tooling/PreviewActivity;->RemoteActionCompatParcelizer([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 4

    .line 190
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/tooling/PreviewActivity;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write(Lo/hasMoreBytes;[Ljava/lang/Object;)Lo/getShowPopup;
    .registers 2

    .line 192
    invoke-static {p0, p1}, Landroidx/compose/ui/tooling/PreviewActivity;->read(Lo/hasMoreBytes;[Ljava/lang/Object;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write([Ljava/lang/Object;Lo/hasMoreBytes;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 4

    .line 191
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/tooling/PreviewActivity;->RemoteActionCompatParcelizer([Ljava/lang/Object;Lo/hasMoreBytes;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final attachBaseContext(Landroid/content/Context;)V
    .registers 2

    .line 198
    invoke-super {p0, p1}, Lo/MediaBrowserCompatMediaItem;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .registers 3

    .line 53
    invoke-super {p0, p1}, Lo/MediaBrowserCompatMediaItem;->onCreate(Landroid/os/Bundle;)V

    .line 54
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_11

    .line 56
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 60
    :cond_11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_22

    const-string v0, "composable"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-direct {p0, p1}, Landroidx/compose/ui/tooling/PreviewActivity;->RemoteActionCompatParcelizer(Ljava/lang/String;)V

    :cond_22
    return-void
.end method

.method public final onPause()V
    .registers 1

    .line 197
    invoke-super {p0}, Lo/MediaBrowserCompatMediaItem;->onPause()V

    return-void
.end method

.method public final onResume()V
    .registers 1

    .line 196
    invoke-super {p0}, Lo/MediaBrowserCompatMediaItem;->onResume()V

    return-void
.end method

.method public final onStart()V
    .registers 1

    .line 195
    invoke-super {p0}, Lo/MediaBrowserCompatMediaItem;->onStart()V

    return-void
.end method

###### Class kotlin.ErrorThrowingDeserializer (o.ErrorThrowingDeserializer)
.class public final synthetic Lo/ErrorThrowingDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final synthetic write:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ErrorThrowingDeserializer;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iput-object p2, p0, Lo/ErrorThrowingDeserializer;->write:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 0
    iget-object v0, p0, Lo/ErrorThrowingDeserializer;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object p0, p0, Lo/ErrorThrowingDeserializer;->write:Ljava/lang/String;

    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, Landroidx/compose/ui/tooling/PreviewActivity;->write(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.ExternalTypeHandler (o.ExternalTypeHandler)
.class public final synthetic Lo/ExternalTypeHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:Lo/hasMoreBytes;

.field public final synthetic write:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lo/hasMoreBytes;[Ljava/lang/Object;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ExternalTypeHandler;->RemoteActionCompatParcelizer:Lo/hasMoreBytes;

    iput-object p2, p0, Lo/ExternalTypeHandler;->write:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    .line 0
    iget-object v0, p0, Lo/ExternalTypeHandler;->RemoteActionCompatParcelizer:Lo/hasMoreBytes;

    iget-object p0, p0, Lo/ExternalTypeHandler;->write:[Ljava/lang/Object;

    invoke-static {v0, p0}, Landroidx/compose/ui/tooling/PreviewActivity;->write(Lo/hasMoreBytes;[Ljava/lang/Object;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin._deserializeAndSet (o._deserializeAndSet)
.class public final synthetic Lo/_deserializeAndSet;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:[Ljava/lang/Object;

.field public final synthetic IconCompatParcelizer:Ljava/lang/String;

.field public final synthetic write:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_deserializeAndSet;->write:Ljava/lang/String;

    iput-object p2, p0, Lo/_deserializeAndSet;->IconCompatParcelizer:Ljava/lang/String;

    iput-object p3, p0, Lo/_deserializeAndSet;->AudioAttributesCompatParcelizer:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 0
    iget-object v0, p0, Lo/_deserializeAndSet;->write:Ljava/lang/String;

    iget-object v1, p0, Lo/_deserializeAndSet;->IconCompatParcelizer:Ljava/lang/String;

    iget-object p0, p0, Lo/_deserializeAndSet;->AudioAttributesCompatParcelizer:[Ljava/lang/Object;

    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, v1, p0, p1, p2}, Landroidx/compose/ui/tooling/PreviewActivity;->read(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin._handleTypePropertyValue (o._handleTypePropertyValue)
.class public final synthetic Lo/_handleTypePropertyValue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Lo/hasMoreBytes;

.field public final synthetic RemoteActionCompatParcelizer:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Object;Lo/hasMoreBytes;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_handleTypePropertyValue;->RemoteActionCompatParcelizer:[Ljava/lang/Object;

    iput-object p2, p0, Lo/_handleTypePropertyValue;->AudioAttributesCompatParcelizer:Lo/hasMoreBytes;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 0
    iget-object v0, p0, Lo/_handleTypePropertyValue;->RemoteActionCompatParcelizer:[Ljava/lang/Object;

    iget-object p0, p0, Lo/_handleTypePropertyValue;->AudioAttributesCompatParcelizer:Lo/hasMoreBytes;

    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, Landroidx/compose/ui/tooling/PreviewActivity;->write([Ljava/lang/Object;Lo/hasMoreBytes;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.setDefaultCreator (o.setDefaultCreator)
.class public final synthetic Lo/setDefaultCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:[Ljava/lang/Object;

.field public final synthetic IconCompatParcelizer:Ljava/lang/String;

.field public final synthetic RemoteActionCompatParcelizer:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/setDefaultCreator;->AudioAttributesCompatParcelizer:[Ljava/lang/Object;

    iput-object p2, p0, Lo/setDefaultCreator;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iput-object p3, p0, Lo/setDefaultCreator;->IconCompatParcelizer:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 0
    iget-object v0, p0, Lo/setDefaultCreator;->AudioAttributesCompatParcelizer:[Ljava/lang/Object;

    iget-object v1, p0, Lo/setDefaultCreator;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object p0, p0, Lo/setDefaultCreator;->IconCompatParcelizer:Ljava/lang/String;

    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, v1, p0, p1, p2}, Landroidx/compose/ui/tooling/PreviewActivity;->read([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.verifyNonDup (o.verifyNonDup)
.class public final synthetic Lo/verifyNonDup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getModuleData;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Lo/hasMoreBytes;

.field public final synthetic IconCompatParcelizer:[Ljava/lang/Object;

.field public final synthetic RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final synthetic read:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/hasMoreBytes;)V
    .registers 5

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/verifyNonDup;->read:Ljava/lang/String;

    iput-object p2, p0, Lo/verifyNonDup;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iput-object p3, p0, Lo/verifyNonDup;->IconCompatParcelizer:[Ljava/lang/Object;

    iput-object p4, p0, Lo/verifyNonDup;->AudioAttributesCompatParcelizer:Lo/hasMoreBytes;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    .line 0
    iget-object v0, p0, Lo/verifyNonDup;->read:Ljava/lang/String;

    iget-object v1, p0, Lo/verifyNonDup;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p0, Lo/verifyNonDup;->IconCompatParcelizer:[Ljava/lang/Object;

    iget-object v3, p0, Lo/verifyNonDup;->AudioAttributesCompatParcelizer:Lo/hasMoreBytes;

    move-object v4, p1

    check-cast v4, Lo/getReturnTransition;

    move-object v5, p2

    check-cast v5, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/tooling/PreviewActivity;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lo/hasMoreBytes;Lo/getReturnTransition;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method
