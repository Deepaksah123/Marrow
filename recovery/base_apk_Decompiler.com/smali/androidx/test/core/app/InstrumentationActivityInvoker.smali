###### Class androidx.test.core.app.InstrumentationActivityInvoker (androidx.test.core.app.InstrumentationActivityInvoker)
.class Landroidx/test/core/app/InstrumentationActivityInvoker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;,
        Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;,
        Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity (androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity)
.class public Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/core/app/InstrumentationActivityInvoker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BootstrapActivity"
.end annotation


# instance fields
.field private read:Z

.field private final write:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 128
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 131
    new-instance v0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity$1;

    invoke-direct {v0, p0}, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity$1;-><init>(Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;)V

    iput-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->write:Landroid/content/BroadcastReceiver;

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .registers 2

    .line 229
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public finish()V
    .registers 2

    .line 157
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    .line 159
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .registers 5

    if-nez p1, :cond_1b

    .line 220
    new-instance p1, Landroid/content/Intent;

    const-string v0, "androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 221
    const-string v0, "androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p3, :cond_15

    .line 223
    const-string p2, "androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY"

    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 225
    :cond_15
    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 226
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1b
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    .line 144
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 145
    iget-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->write:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x0

    if-eqz p1, :cond_1c

    .line 149
    const-string v1, "IS_TARGET_ACTIVITY_STARTED_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1c

    const/4 p1, 0x1

    goto :goto_1d

    :cond_1c
    move p1, v0

    :goto_1d
    iput-boolean p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->read:Z

    .line 152
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onDestroy()V
    .registers 2

    .line 213
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 214
    iget-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->write:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method protected onPause()V
    .registers 1

    .line 228
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .registers 12

    .line 164
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 166
    iget-boolean v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->read:Z

    if-nez v0, :cond_4d

    const/4 v0, 0x1

    .line 167
    iput-boolean v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->read:Z

    .line 169
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-static {v0}, Landroidx/test/internal/util/Checks;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    .line 170
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    if-eqz v10, :cond_37

    .line 190
    :try_start_28
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x10000000

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    .line 189
    invoke-virtual/range {v3 .. v10}, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    .line 182
    :cond_37
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x10000000

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 181
    invoke-virtual/range {v0 .. v6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_45
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_28 .. :try_end_45} :catch_46

    return-void

    :catch_46
    move-exception p0

    .line 200
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_4d
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 3

    .line 207
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 208
    const-string v0, "IS_TARGET_ACTIVITY_STARTED_KEY"

    iget-boolean p0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;->read:Z

    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onStart()V
    .registers 1

    .line 227
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    return-void
.end method

###### Class androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.AnonymousClass1 (androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity$1)
.class Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;


# direct methods
.method constructor <init>(Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;)V
    .registers 2

    .line 132
    iput-object p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity$1;->RemoteActionCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    .line 135
    iget-object p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity$1;->RemoteActionCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/app/Activity;->finishActivity(I)V

    .line 136
    iget-object p0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity$1;->RemoteActionCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$BootstrapActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

###### Class androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity (androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity)
.class public Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/core/app/InstrumentationActivityInvoker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EmptyActivity"
.end annotation


# instance fields
.field private final read:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 306
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 307
    new-instance v0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity$1;

    invoke-direct {v0, p0}, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity$1;-><init>(Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;)V

    iput-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;->read:Landroid/content/BroadcastReceiver;

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .registers 2

    .line 343
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public finish()V
    .registers 2

    .line 326
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    .line 328
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4

    .line 317
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 318
    iget-object p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;->read:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x0

    .line 321
    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onDestroy()V
    .registers 2

    .line 339
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 340
    iget-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;->read:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method protected onPause()V
    .registers 1

    .line 342
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .registers 3

    .line 333
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 334
    new-instance v0, Landroid/content/Intent;

    const-string v1, "androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public onStart()V
    .registers 1

    .line 341
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    return-void
.end method

###### Class androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity.AnonymousClass1 (androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity$1)
.class Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;


# direct methods
.method constructor <init>(Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;)V
    .registers 2

    .line 308
    iput-object p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity$1;->IconCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    .line 311
    iget-object p0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity$1;->IconCompatParcelizer:Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

###### Class androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity (androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity)
.class public Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/core/app/InstrumentationActivityInvoker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EmptyFloatingActivity"
.end annotation


# instance fields
.field private final IconCompatParcelizer:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 355
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 356
    new-instance v0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity$1;

    invoke-direct {v0, p0}, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity$1;-><init>(Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;)V

    iput-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;->IconCompatParcelizer:Landroid/content/BroadcastReceiver;

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .registers 2

    .line 392
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public finish()V
    .registers 2

    .line 375
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    .line 377
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4

    .line 366
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 367
    iget-object p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;->IconCompatParcelizer:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x0

    .line 370
    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onDestroy()V
    .registers 2

    .line 388
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 389
    iget-object v0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;->IconCompatParcelizer:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method protected onPause()V
    .registers 1

    .line 391
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .registers 3

    .line 382
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 383
    new-instance v0, Landroid/content/Intent;

    const-string v1, "androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public onStart()V
    .registers 1

    .line 390
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    return-void
.end method

###### Class androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity.AnonymousClass1 (androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity$1)
.class Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;


# direct methods
.method constructor <init>(Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;)V
    .registers 2

    .line 357
    iput-object p1, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity$1;->write:Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    .line 360
    iget-object p0, p0, Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity$1;->write:Landroidx/test/core/app/InstrumentationActivityInvoker$EmptyFloatingActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
