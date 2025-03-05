package com.dumbbellpro.android.ui.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "DumbbellPro",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Upcoming workout card
        Card(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Next Workout",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Monday: Chest, Shoulders, Triceps",
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { /* Navigate to workout screen */ },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("Start Workout")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Progress summary
        Card(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Your Progress",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(16.dp))

                // This would be replaced with actual chart in the full implementation
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Progress Chart Will Appear Here")
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // Bottom navigation buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /* Navigate to workouts */ }) {
                Text("Workouts")
            }

            Button(onClick = { /* Navigate to exercises */ }) {
                Text("Exercises")
            }

            Button(onClick = { /* Navigate to settings */ }) {
                Text("Settings")
            }
        }
    }
}