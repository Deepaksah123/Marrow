###### Class com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent (com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent)
.class public Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field private IconCompatParcelizer:Ljava/lang/String;

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private MediaBrowserCompatItemReceiver:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Ljava/lang/String;

.field private read:Ljava/lang/String;

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 15
    new-instance v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent$2;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent$2;-><init>()V

    sput-object v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->read:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->write:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->IconCompatParcelizer:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 13
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 11

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 53
    iput-object p4, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 54
    iput-object p5, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->read:Ljava/lang/String;

    .line 55
    iput-object p6, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->write:Ljava/lang/String;

    .line 56
    iput-object p7, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->IconCompatParcelizer:Ljava/lang/String;

    .line 57
    iput-object p8, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    .line 58
    iput-object p9, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 59
    iput-object p10, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method static write(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;
    .registers 26

    move-object/from16 v0, p0

    .line 258
    const-string v1, "android"

    const-string v2, "poster"

    const-string v3, "content_type"

    const-string v4, "action"

    const-string v5, "media"

    const-string v6, "icon"

    const-string v7, "message"

    const-string v8, "title"

    :try_start_12
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_1e

    .line 259
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_1d} :catch_119

    goto :goto_1f

    :cond_1e
    move-object v8, v10

    .line 260
    :goto_1f
    const-string v9, "color"

    const-string v11, "text"

    const-string v12, ""

    if-eqz v8, :cond_44

    .line 261
    :try_start_27
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_32

    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_33

    :cond_32
    move-object v13, v12

    .line 262
    :goto_33
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_40

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v16, v8

    goto :goto_42

    :cond_40
    move-object/from16 v16, v12

    :goto_42
    move-object v15, v13

    goto :goto_47

    :cond_44
    move-object v15, v12

    move-object/from16 v16, v15

    .line 264
    :goto_47
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_52

    .line 265
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    goto :goto_53

    :cond_52
    move-object v7, v10

    :goto_53
    if-eqz v7, :cond_75

    .line 267
    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_60

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_61

    :cond_60
    move-object v8, v12

    .line 268
    :goto_61
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_70

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v18, v7

    move-object/from16 v17, v8

    goto :goto_79

    :cond_70
    move-object/from16 v17, v8

    move-object/from16 v18, v12

    goto :goto_79

    :cond_75
    move-object/from16 v17, v12

    move-object/from16 v18, v17

    .line 270
    :goto_79
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_84

    .line 271
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6
    :try_end_83
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_83} :catch_119

    goto :goto_85

    :cond_84
    move-object v6, v10

    .line 272
    :goto_85
    const-string v7, "url"

    if-eqz v6, :cond_96

    .line 273
    :try_start_89
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_96

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v19, v6

    goto :goto_98

    :cond_96
    move-object/from16 v19, v12

    .line 275
    :goto_98
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a3

    .line 276
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    goto :goto_a4

    :cond_a3
    move-object v5, v10

    :goto_a4
    if-eqz v5, :cond_d6

    .line 278
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b1

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_b2

    :cond_b1
    move-object v6, v12

    .line 279
    :goto_b2
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_bd

    .line 280
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_be

    :cond_bd
    move-object v3, v12

    .line 281
    :goto_be
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_cf

    .line 282
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v22, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v6

    goto :goto_dc

    :cond_cf
    move-object/from16 v21, v3

    move-object/from16 v20, v6

    move-object/from16 v22, v12

    goto :goto_dc

    :cond_d6
    move-object/from16 v20, v12

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    .line 285
    :goto_dc
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e7

    .line 286
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_e8

    :cond_e7
    move-object v0, v10

    :goto_e8
    if-eqz v0, :cond_10e

    .line 288
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f5

    .line 289
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_f6

    :cond_f5
    move-object v0, v10

    :goto_f6
    if-eqz v0, :cond_10e

    .line 291
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_102

    .line 292
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    :cond_102
    if-eqz v10, :cond_10e

    .line 294
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10e

    .line 295
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :cond_10e
    move-object/from16 v23, v12

    .line 300
    new-instance v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    const/16 v24, 0x0

    move-object v14, v0

    invoke-direct/range {v14 .. v24}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_118
    .catch Ljava/lang/Exception; {:try_start_89 .. :try_end_118} :catch_119

    return-object v0

    :catch_119
    move-exception v0

    .line 306
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 305
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error Creating DisplayUnit Content from JSON : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    new-instance v2, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const-string v8, ""

    const-string v9, ""

    const-string v10, ""

    const-string v11, ""

    const-string v12, ""

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    move-object v3, v2

    invoke-direct/range {v3 .. v13}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Ljava/lang/String;
    .registers 1

    .line 109
    iget-object p0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[ title:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", titleColor:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " message:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageColor:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", media:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->write:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", contentType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", posterUrl:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", actionUrl:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", icon:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->read:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", error:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " ]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 234
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 235
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 237
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 238
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 239
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 240
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 241
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 242
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 243
    iget-object p0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent.AnonymousClass2 (com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent$2)
.class final Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;
    .registers 1

    .line 23
    new-array p0, p0, [Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;
    .registers 3

    .line 18
    new-instance v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 15
    invoke-static {p1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent$2;->write(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 15
    invoke-static {p1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent$2;->IconCompatParcelizer(I)[Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    move-result-object p0

    return-object p0
.end method
