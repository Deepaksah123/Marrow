###### Class com.clevertap.android.sdk.inbox.CTInboxMessageContent (com.clevertap.android.sdk.inbox.CTInboxMessageContent)
.class public Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

.field private AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplBaseParcelizer:Lorg/json/JSONArray;

.field private IconCompatParcelizer:Ljava/lang/Boolean;

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private MediaBrowserCompatItemReceiver:Ljava/lang/String;

.field private MediaBrowserCompatMediaItem:Ljava/lang/String;

.field private MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

.field private MediaDescriptionCompat:Ljava/lang/String;

.field private RatingCompat:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Ljava/lang/String;

.field private read:Ljava/lang/String;

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 21
    new-instance v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent$2;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent$2;-><init>()V

    sput-object v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RatingCompat:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaDescriptionCompat:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_31

    move v0, v1

    goto :goto_32

    :cond_31
    move v0, v2

    :goto_32
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->IconCompatParcelizer:Ljava/lang/Boolean;

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_3f

    goto :goto_40

    :cond_3f
    move v1, v2

    :goto_40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->write:Ljava/lang/String;

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->read:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 78
    :try_start_58
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-nez v0, :cond_60

    const/4 v0, 0x0

    goto :goto_69

    :cond_60
    new-instance v0, Lorg/json/JSONArray;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    :goto_69
    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplBaseParcelizer:Lorg/json/JSONArray;
    :try_end_6b
    .catch Lorg/json/JSONException; {:try_start_58 .. :try_end_6b} :catch_6c

    goto :goto_73

    :catch_6c
    move-exception v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    .line 82
    :goto_73
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Ljava/lang/String;
    .registers 5

    .line 182
    const-string v0, "text"

    const-string v1, "copyText"

    const-string v2, ""

    if-nez p0, :cond_9

    return-object v2

    .line 186
    :cond_9
    :try_start_9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    goto :goto_15

    :cond_14
    const/4 p0, 0x0

    :goto_15
    if-eqz p0, :cond_22

    .line 188
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_21
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_21} :catch_23

    return-object p0

    :cond_22
    return-object v2

    :catch_23
    move-exception p0

    .line 193
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v2
.end method

.method public static AudioAttributesImplApi26Parcelizer(Lorg/json/JSONObject;)Ljava/lang/String;
    .registers 6

    .line 251
    const-string v0, "text"

    const-string v1, "android"

    const-string v2, "url"

    const/4 v3, 0x0

    if-nez p0, :cond_a

    return-object v3

    .line 255
    :cond_a
    :try_start_a
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    goto :goto_16

    :cond_15
    move-object p0, v3

    :goto_16
    if-nez p0, :cond_19

    return-object v3

    .line 260
    :cond_19
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_24

    .line 261
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    goto :goto_25

    :cond_24
    move-object p0, v3

    :goto_25
    if-eqz p0, :cond_32

    .line 263
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_32

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_31
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_31} :catch_35

    return-object p0

    :cond_32
    const-string p0, ""

    return-object p0

    :catch_35
    move-exception p0

    .line 268
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v3
.end method

.method public static AudioAttributesImplBaseParcelizer(Lorg/json/JSONObject;)Ljava/lang/String;
    .registers 4

    .line 294
    const-string v0, "type"

    const/4 v1, 0x0

    if-nez p0, :cond_6

    return-object v1

    .line 298
    :cond_6
    :try_start_6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_10} :catch_14

    return-object p0

    :cond_11
    const-string p0, ""

    return-object p0

    :catch_14
    move-exception p0

    .line 300
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v1
.end method

.method public static IconCompatParcelizer(Lorg/json/JSONObject;)Ljava/util/HashMap;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_41

    .line 202
    const-string v1, "kv"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_41

    .line 206
    :try_start_b
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 207
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 208
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 210
    :cond_18
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_32

    .line 211
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 212
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 213
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_18

    .line 214
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_18

    .line 217
    :cond_32
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result p0
    :try_end_36
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_36} :catch_3a

    if-nez p0, :cond_39

    return-object v2

    :cond_39
    return-object v0

    :catch_3a
    move-exception p0

    .line 220
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    :cond_41
    return-object v0
.end method

.method public static MediaBrowserCompatItemReceiver(Lorg/json/JSONObject;)Z
    .registers 4

    .line 306
    const-string v0, "fbSettings"

    const/4 v1, 0x0

    if-nez p0, :cond_6

    return v1

    .line 310
    :cond_6
    :try_start_6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 311
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p0
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_10} :catch_12

    return p0

    :cond_11
    return v1

    :catch_12
    move-exception p0

    .line 313
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return v1
.end method

.method public static RemoteActionCompatParcelizer(Lorg/json/JSONObject;)Ljava/lang/String;
    .registers 4

    .line 163
    const-string v0, "color"

    const/4 v1, 0x0

    if-nez p0, :cond_6

    return-object v1

    .line 167
    :cond_6
    :try_start_6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_10} :catch_14

    return-object p0

    :cond_11
    const-string p0, ""

    return-object p0

    :catch_14
    move-exception p0

    .line 169
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v1
.end method

.method private handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;
    .registers 1

    .line 110
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public static read(Lorg/json/JSONObject;)Ljava/lang/String;
    .registers 4

    .line 145
    const-string v0, "bg"

    const/4 v1, 0x0

    if-nez p0, :cond_6

    return-object v1

    .line 149
    :cond_6
    :try_start_6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_10} :catch_14

    return-object p0

    :cond_11
    const-string p0, ""

    return-object p0

    :catch_14
    move-exception p0

    .line 151
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v1
.end method

.method public static write(Lorg/json/JSONObject;)Ljava/lang/String;
    .registers 4

    .line 232
    const-string v0, "text"

    const/4 v1, 0x0

    if-nez p0, :cond_6

    return-object v1

    .line 236
    :cond_6
    :try_start_6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_10} :catch_14

    return-object p0

    :cond_11
    const-string p0, ""

    return-object p0

    :catch_14
    move-exception p0

    .line 238
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v1
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 131
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Ljava/lang/String;
    .registers 1

    .line 331
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/lang/String;
    .registers 1

    .line 348
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Ljava/lang/String;
    .registers 1

    .line 361
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 324
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    return-object p0
.end method

.method final MediaBrowserCompatCustomActionResultReceiver(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;
    .registers 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 481
    const-string v2, "links"

    const-string v3, "android"

    const-string v4, "poster"

    const-string v5, "hasLinks"

    const-string v6, "content_type"

    const-string v7, "hasUrl"

    const-string v8, "action"

    const-string v9, "media"

    const-string v10, "icon"

    const-string v11, "message"

    const-string v12, "title"

    :try_start_1a
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_25

    .line 482
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12
    :try_end_24
    .catch Lorg/json/JSONException; {:try_start_1a .. :try_end_24} :catch_167

    goto :goto_26

    :cond_25
    const/4 v12, 0x0

    .line 483
    :goto_26
    const-string v13, "color"

    const-string v15, "text"

    const-string v14, ""

    if-eqz v12, :cond_53

    .line 484
    :try_start_2e
    invoke-virtual {v12, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_3f

    invoke-virtual {v12, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v17, v16

    move-object/from16 v16, v2

    move-object/from16 v2, v17

    goto :goto_42

    :cond_3f
    move-object/from16 v16, v2

    move-object v2, v14

    :goto_42
    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RatingCompat:Ljava/lang/String;

    .line 485
    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4f

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_50

    :cond_4f
    move-object v2, v14

    .line 486
    :goto_50
    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaDescriptionCompat:Ljava/lang/String;

    goto :goto_55

    :cond_53
    move-object/from16 v16, v2

    .line 488
    :goto_55
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_60

    .line 489
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_61

    :cond_60
    const/4 v2, 0x0

    :goto_61
    if-eqz v2, :cond_7f

    .line 491
    invoke-virtual {v2, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6e

    invoke-virtual {v2, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_6f

    :cond_6e
    move-object v11, v14

    :goto_6f
    iput-object v11, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    .line 492
    invoke-virtual {v2, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_7c

    invoke-virtual {v2, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_7d

    :cond_7c
    move-object v2, v14

    .line 493
    :goto_7d
    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 495
    :cond_7f
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8a

    .line 496
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2
    :try_end_89
    .catch Lorg/json/JSONException; {:try_start_2e .. :try_end_89} :catch_167

    goto :goto_8b

    :cond_8a
    const/4 v2, 0x0

    .line 497
    :goto_8b
    const-string v10, "alt_text"

    const-string v11, "url"

    if-eqz v2, :cond_a5

    .line 498
    :try_start_91
    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9c

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_9d

    :cond_9c
    move-object v12, v14

    :goto_9d
    iput-object v12, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->read:Ljava/lang/String;

    .line 499
    invoke-virtual {v2, v10, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 501
    :cond_a5
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b0

    .line 502
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_b1

    :cond_b0
    const/4 v2, 0x0

    :goto_b1
    if-eqz v2, :cond_e3

    .line 504
    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_be

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_bf

    :cond_be
    move-object v9, v14

    :goto_bf
    iput-object v9, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 505
    invoke-virtual {v2, v10, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 506
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d2

    .line 507
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_d3

    :cond_d2
    move-object v6, v14

    :goto_d3
    iput-object v6, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 508
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e0

    .line 509
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_e1

    :cond_e0
    move-object v2, v14

    :goto_e1
    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 512
    :cond_e3
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_ee

    .line 513
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_ef

    :cond_ee
    const/4 v0, 0x0

    :goto_ef
    if-eqz v0, :cond_166

    .line 515
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_101

    .line 516
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_101

    move v2, v4

    goto :goto_102

    :cond_101
    move v2, v6

    .line 515
    :goto_102
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->IconCompatParcelizer:Ljava/lang/Boolean;

    .line 517
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_115

    .line 518
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_115

    goto :goto_116

    :cond_115
    move v4, v6

    .line 517
    :goto_116
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    .line 519
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_127

    .line 520
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_128

    :cond_127
    const/4 v2, 0x0

    :goto_128
    if-eqz v2, :cond_14c

    .line 521
    iget-object v4, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->IconCompatParcelizer:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_14c

    .line 522
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13d

    .line 523
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    goto :goto_13e

    :cond_13d
    const/4 v3, 0x0

    :goto_13e
    if-eqz v3, :cond_14c

    .line 525
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_14a

    .line 526
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    :cond_14a
    iput-object v14, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->write:Ljava/lang/String;

    :cond_14c
    if-eqz v2, :cond_166

    .line 529
    iget-object v2, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_166

    move-object/from16 v2, v16

    .line 530
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_163

    .line 531
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v14

    goto :goto_164

    :cond_163
    const/4 v14, 0x0

    :goto_164
    iput-object v14, v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplBaseParcelizer:Lorg/json/JSONArray;
    :try_end_166
    .catch Lorg/json/JSONException; {:try_start_91 .. :try_end_166} :catch_167

    :cond_166
    return-object v1

    :catch_167
    move-exception v0

    .line 536
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-object v1
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Ljava/lang/String;
    .registers 1

    .line 387
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RatingCompat:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Ljava/lang/String;
    .registers 1

    .line 374
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()Ljava/lang/String;
    .registers 1

    .line 400
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaDescriptionCompat:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Z
    .registers 2

    .line 453
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaDescriptionCompat()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->onAddQueueItem()Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public final MediaDescriptionCompat()Z
    .registers 2

    .line 414
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 415
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz p0, :cond_14

    const-string p0, "audio"

    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaMetadataCompat()Z
    .registers 2

    .line 425
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 426
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz p0, :cond_14

    const-string p0, "image/gif"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public final RatingCompat()Z
    .registers 2

    .line 436
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1c

    .line 437
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz p0, :cond_1c

    const-string p0, "image"

    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1c

    .line 438
    const-string p0, "image/gif"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    const/4 p0, 0x1

    return p0

    :cond_1c
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 97
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->write:Ljava/lang/String;

    return-object p0
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final onAddQueueItem()Z
    .registers 2

    .line 448
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 449
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz p0, :cond_14

    const-string p0, "video"

    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public final read()Lorg/json/JSONArray;
    .registers 1

    .line 279
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplBaseParcelizer:Lorg/json/JSONArray;

    return-object p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 119
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->read:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 458
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RatingCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 459
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 460
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 461
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 462
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 463
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 464
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->IconCompatParcelizer:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 465
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesCompatParcelizer:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 466
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 467
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 468
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 469
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplBaseParcelizer:Lorg/json/JSONArray;

    if-nez p2, :cond_4a

    const/4 p2, 0x0

    .line 470
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_57

    :cond_4a
    const/4 p2, 0x1

    .line 472
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 473
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplBaseParcelizer:Lorg/json/JSONArray;

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 475
    :goto_57
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 476
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inbox.CTInboxMessageContent.AnonymousClass2 (com.clevertap.android.sdk.inbox.CTInboxMessageContent$2)
.class final Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;
    .registers 2

    .line 25
    new-instance v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    invoke-direct {v0, p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(I)[Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;
    .registers 1

    .line 30
    new-array p0, p0, [Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 22
    invoke-static {p1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent$2;->IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 22
    invoke-static {p1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent$2;->IconCompatParcelizer(I)[Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    move-result-object p0

    return-object p0
.end method
